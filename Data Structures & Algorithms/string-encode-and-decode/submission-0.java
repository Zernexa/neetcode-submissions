class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";
        for (String word : strs){
            int n = word.length();
            encodedString = encodedString.concat(n + "#" + word);
        }
        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int hashPos = str.indexOf("#", i);
            int x = hashPos;

            boolean found = false;
            int l = 0, p = 1;

            while(!found && x > i){
                x--;
                if (str.charAt(x) >= '0' && str.charAt(x) <= '9'){
                    l = l + Integer.parseInt(String.valueOf(str.charAt(x))) * p;
                    p *= 10;
                } else found = true;
            }
            
            String word = str.substring(hashPos + 1, hashPos + 1 + l);
            decodedString.add(word);
            i = hashPos + 1 + l;
        }
        return decodedString;
    }
}
