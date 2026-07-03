class Solution {
    public void reverseString(char[] s) {
        char[] sRev = new char[100001];
        for (int i = 0; i < s.length; i++){
            sRev[s.length - 1 - i] = s[i];
        }
        for (int i = 0; i < s.length; i++){
            s[i] = sRev[i];
        }
    }
}