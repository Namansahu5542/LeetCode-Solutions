class Solution {
    public static void solve(String[][] keypad, int index, String str, List<String> li) {
        if (index >= keypad.length) {
            li.add(str);
            return;
        }
        for (String ele : keypad[index]) {
            solve(keypad, index + 1, str + ele, li);
        }
    }

    public List<String> letterCombinations(String digits) {
        String[][] keypad = {

                { "a", "b", "c" },
                { "d", "e", "f" },
                { "g", "h", "i" },
                { "j", "k", "l" },
                { "m", "n", "o" },
                { "p", "q", "r", "s" },
                { "t", "u", "v" },
                { "w", "x", "y", "z" },

        };
        int l = digits.length();
        List<String> str = new ArrayList<>();
        int[] nums = new int[l];
        for (int i = 0; i < l; i++) {

            int number = digits.charAt(i) - '0';
            nums[i] = number - 2;
        }
        String[][] finalArr = new String[l][];

        for (int i = 0; i < l; i++) {
            finalArr[i] = keypad[nums[i]];
        }
        solve(finalArr, 0, "", str);
        return str;
    }
}