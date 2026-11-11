class Solution {
    public static void PreviousEle(int[] arr, int[] prev) {
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                prev[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            prev[st.pop()] = -1;
        }
    }

    public static void nextEle(int[] arr, int[] next) {
       Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                next[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            next[st.pop()] = arr.length;
        }

    }

    public int largestRectangleArea(int[] heights) {
        int prev[] = new int[heights.length];
        int next[] = new int[heights.length];
        int maxArea = -1;

        PreviousEle(heights, prev);
        nextEle(heights, next);
        for (int i = 0; i < heights.length; i++) {
            int width = next[i] - prev[i] - 1;
            int area = width * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
