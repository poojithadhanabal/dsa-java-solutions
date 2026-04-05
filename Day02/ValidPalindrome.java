class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            char c1=s.charAt(left);
            char c2=s.charAt(right);

            if(Character.toLowerCase(c1)!=Character.toLowerCase(c2)){
                return false;
            }
                left++;
                right--;
            
        }
        return true;
    }
}