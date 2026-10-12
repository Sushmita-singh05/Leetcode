class Solution {
    public int reverse(int x) {
        int temp,num;
        int rev = 0;
        temp = x;
        while(temp != 0){
            num = temp % 10;
            
            if (rev > 214748364 || rev < -214748364) {
                return 0;
            }
            if (rev == 214748364 && num > 7) {
                return 0;
            }
            if (rev == -214748364 && num < -8) {
                return 0;
            }

            rev = rev * 10 + num;
            temp = temp / 10;
        }
        return rev;
    }
}