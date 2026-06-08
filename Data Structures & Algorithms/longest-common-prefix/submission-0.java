class Solution {
    public String longestCommonPrefix(String[] strs) {

        // If array is empty, return empty string
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Take first string as initial prefix
        String prefix = strs[0];

        // Compare prefix with remaining strings
        for (int i = 1; i < strs.length; i++) {

            // Keep reducing prefix until current string starts with it
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}