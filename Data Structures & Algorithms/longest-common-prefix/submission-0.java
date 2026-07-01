class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++){
            for (String x : strs){
                if (x.length() == i || x.charAt(i) != strs[0].charAt(i)){
                    return prefix;
                }
            }
            prefix += strs[0].charAt(i);
        }
        return prefix;
    }
}