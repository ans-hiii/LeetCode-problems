import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groupedWords = new HashMap<>();

        for (String word : strs) {

            char[] letters = word.toCharArray();
            Arrays.sort(letters);

            String key = new String(letters);

            if (!groupedWords.containsKey(key)) {
                groupedWords.put(key, new ArrayList<>());
            }

            groupedWords.get(key).add(word);
        }

        return new ArrayList<>(groupedWords.values());
    }
}
