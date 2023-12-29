public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        int minLength = Integer.MAX_VALUE;

        for (String string : strs) {
            minLength = Math.min(string.length(), minLength);
        }

        StringBuilder lcp = new StringBuilder();
        for (int i = 0; i < minLength; i++){
            char current = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++){
                if (current != strs[j].charAt(i)){
                    return lcp.toString();
                }
            }
            lcp.append(current);
        }
        return lcp.toString();
    }
}
