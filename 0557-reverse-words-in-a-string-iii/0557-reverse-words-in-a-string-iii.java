class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" "); // Split the input string into words
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            // Reverse each word and append it to the result StringBuilder
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            result.append(reversedWord).append(" ");
        }    
        // Remove the trailing space and return the result
        return result.toString().trim();
    }
}
