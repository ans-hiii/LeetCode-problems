class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] letterCount = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            letterCount[magazine.charAt(i) - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            int index = ransomNote.charAt(i) - 'a';

            if (letterCount[index] == 0) {
                return false;
            }

            letterCount[index]--;
        }

        return true;
    }
}
