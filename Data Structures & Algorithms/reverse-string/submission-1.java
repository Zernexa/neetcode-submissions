class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        char aux;
        while(left < right){
            aux = s[left];
            s[left] = s[right];
            s[right] = aux;
            left++;
            right--;
        }
    }
}