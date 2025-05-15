class Solution {
    public int firstUniqChar(String s) {
         int[] freq = new int[26]; // assuming only lowercase English letters

        // First pass: count frequency of each character
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Second pass: find first character with frequency 1
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}