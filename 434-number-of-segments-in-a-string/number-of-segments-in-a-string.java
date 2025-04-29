class Solution {
    public int countSegments(String s) {
         String[] words = s.split(" ");
        int count = 0;

        // Count non-empty words
        for (String word : words) {
            if (!word.isEmpty()) {
                count++;
            }
        }

        return count;
    }
}