class Solution {
    public int[] plusOne(int[] digits) {
        int newdigits[];
        if (digits[0] == 9) {
            newdigits = new int[digits.length + 1];
            System.arraycopy(digits, 0, newdigits, 1, digits.length);
        } else {
            newdigits = new int[digits.length];
            System.arraycopy(digits, 0, newdigits, 0, digits.length);
        }

        int l = digits.length - 1;
        if (digits[l] != 9) {
            digits[l] = digits[l] + 1;
            return digits;
        } else {
            int c = 1, i = newdigits.length - 1;
            while (c != 0) {
                int sum = newdigits[i] + c;
                int s = sum % 10;
                c = sum / 10;
                newdigits[i] = s;
                i--;
            }
            
        }

        if (newdigits[0] == 0) {
            
            System.arraycopy(newdigits, 1, digits, 0, digits.length);
            
        }else{
            digits=newdigits;
        }
        return digits;
    }
}