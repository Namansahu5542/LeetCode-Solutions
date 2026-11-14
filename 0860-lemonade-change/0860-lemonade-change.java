class Solution {
    public boolean lemonadeChange(int[] bills) {

        int AmtOfFive = 0, AmtOfTen = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                AmtOfFive++;
            } else if (bills[i] == 10) {
                if (AmtOfFive == 0) {
                    return false;

                }
                AmtOfFive--;
                AmtOfTen++;
            } else {
                if (AmtOfTen > 0 && AmtOfFive > 0) {
                    AmtOfTen--;
                    AmtOfFive--;
                } else if (AmtOfFive >= 3) {
                    AmtOfFive -= 3;

                } else {
                    return false;
                }

            }

        }
        return true;
    }
}