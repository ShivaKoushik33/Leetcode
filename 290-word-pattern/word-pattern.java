class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(ch)) {
                // If mapping for char already exists, check consistency
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                // If mapping for char doesn't exist, check if word is already mapped to another char
                if (map.containsValue(word)) {
                    return false;
                }
                // Establish new mapping
                map.put(ch, word);
            }
        }
        return true;
    }
}