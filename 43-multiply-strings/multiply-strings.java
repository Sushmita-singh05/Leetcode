class Solution {
    public String multiply(String num1, String num2) {

        int n1 = num1.length();
        int n2 = num2.length();

        int[] result = new int[n1 + n2];

        for (int i = n1 - 1; i >= 0; i--) {
            int carry = 0;

            for (int j = n2 - 1; j >= 0; j--) {

                int product = (num1.charAt(i) - '0') *
                              (num2.charAt(j) - '0');

                int sum = product + result[i + j + 1] + carry;

                result[i + j + 1] = sum % 10;
                carry = sum / 10;
            }

            result[i] += carry;
        }

        StringBuilder ans = new StringBuilder();

        for (int digit : result) {
            if (ans.length() == 0 && digit == 0) {
                continue;
            }
            ans.append(digit);
        }

        return ans.length() == 0 ? "0" : ans.toString();
    }
}
