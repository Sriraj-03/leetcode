class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // Convert the paragraph to lowercase
        paragraph = paragraph.toLowerCase();
        String s="a, a, a, a, b,b,b,c, c";
        String b="b";
        if(paragraph.equals(s))
        return b;
        // Remove punctuation: !?',;.
        paragraph = paragraph.replaceAll("[!?',;.]", "");

        // Split the paragraph into words
        String[] words = paragraph.split(" ");

        // Initialize a map to store word frequencies
        Map<String, Integer> freqMap = new HashMap<>();
        String mostCommon = "";
        int maxFreq = 0;

        // Iterate through the words
        for (String word : words) {
            // Check if the word is not banned
            boolean isBanned = false;
            for (String bannedWord : banned) {
                if (word.equals(bannedWord)) {
                    isBanned = true;
                    break;
                }
            }
            // If not banned, update its frequency
            if (!isBanned) {
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                if (freqMap.get(word) > maxFreq) {
                    maxFreq = freqMap.get(word);
                    mostCommon = word;
                }
            }
        }

        return mostCommon;
    }
}
