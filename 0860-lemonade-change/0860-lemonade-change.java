class Solution {
    public boolean lemonadeChange(int[] bills) {

        int AmtOfFive = 0, AmtOfTen = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                AmtOfFive += 5;
            } else if (bills[i] == 10) {
                AmtOfFive -= 5;
                AmtOfTen += 10;
            } else {
                if (AmtOfTen > 0 && AmtOfFive >= 5) {
                    AmtOfTen -= 10;
                    AmtOfFive -= 5;
                } else {
                    AmtOfFive -= 15;

                }

            }

            if (AmtOfFive < 0 || AmtOfTen < 0) {
                return false;
            }
        }
        return true;
    }
}