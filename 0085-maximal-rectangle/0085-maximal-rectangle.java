class Solution {
    public static void PSE(int[] arr, int[] prev) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                prev[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            prev[st.pop()] = -1;
        }
    }

    public static void NSE(int[] arr, int[] next) {
        Deque<Integer> st = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                next[st.pop()] = i;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            next[st.pop()] = arr.length;
        }
    }

    public static int MaxArea(int[] heights) {
        int MaxArea = -1;
        int[] next = new int[heights.length];
        int[] prev = new int[heights.length];
        PSE(heights, prev);
        NSE(heights, next);
        for (int i = 0; i < heights.length; i++) {
            int w = next[i] - prev[i] - 1;
            int area = w * heights[i];
            MaxArea = Math.max(MaxArea, area);
        }
        return MaxArea;
    }

    public static int maximalRectangle(char[][] matrix) {
        int heights[] = new int[matrix[0].length];
        int count = 0, MaxArea = -1;
        for (int j = 0; j < matrix.length; j++) {

            for (int i = 0; i < matrix[0].length; i++) {
                if (matrix[j][i] == '1') {
                    heights[i]++;
                } else {
                    heights[i] = 0;
                }
            }
            int area = MaxArea(heights);
            MaxArea = Math.max(area, MaxArea);

        }
        return MaxArea;
    }
}