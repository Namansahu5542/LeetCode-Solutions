class Solution {
    public boolean lemonadeChange(int[] bills) {

        int AmtOfFive = 0, AmtOfTen = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                AmtOfFive += 5;
            } else if (bills[i] == 10) {
                if(AmtOfFive>=5){

                AmtOfFive -= 5;
                AmtOfTen += 10;
                }else{
                    return false;
                }
            } else {
                if (AmtOfTen > 0 && AmtOfFive >= 5) {
                    AmtOfTen -= 10;
                    AmtOfFive -= 5;
                } else if(AmtOfFive>=15) {
                    AmtOfFive -= 15;

                }else{
                    return false;
                }

            }

            if (AmtOfFive < 0 || AmtOfTen < 0) {
                return false;
            }
        }
        return true;
    }
}