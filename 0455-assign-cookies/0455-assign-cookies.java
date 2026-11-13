class Solution {
    public int findContentChildren(int[] greed, int[] cookie) {
        Arrays.sort(greed);
		Arrays.sort(cookie);
		int i = cookie.length - 1, j = greed.length - 1, count = 0;
		while (i >= 0 && j >= 0) {
			if (greed[j] <= cookie[i]) {
				count++;
				i--;
				j--;
			} else {
				j--;
			}
			
		}
		return count;
    }
}