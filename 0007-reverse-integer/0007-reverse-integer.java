class Solution {
    public int reverse(int x) {
        int count = 0;
        long temp = x;
        while (temp != 0) {
            count++;
            temp /= 10;

        }
        count--;
        while (x != 0) {
            int n = x % 10;
            temp += n * Math.pow(10, count--);
            x = x / 10;
        }
       return (temp <= Integer.MAX_VALUE &&
        temp >= Integer.MIN_VALUE)
        ? (int) temp
        : 0;
    }
}