class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while(left < right){
            while(!Character.isLetterOrDigit(s.charAt(right)) && left < right){
                right--;
            }
            while(!Character.isLetterOrDigit(s.charAt(left)) && left < right){
                left++;
            }
            
            char cl = s.charAt(left), cr = s.charAt(right);

            cl = Character.toLowerCase(cl);
            cr = Character.toLowerCase(cr);

            if (cl == cr){
                left++;
                right--;
                continue;
            } else return false;
        }
        return true;
    }
}
