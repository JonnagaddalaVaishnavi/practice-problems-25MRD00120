// First, check if both strings have the same length. If not, they cannot be anagrams.
// Create a frequency array of size 26 to store the count of each character.
// Traverse both strings together, increase the count for characters in the first string and decrease it for characters in the second string.
// After processing all characters, check the frequency array.
// If all values are 0, both strings contain the same characters with the same frequency, so they are anagrams.

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] frequency = new int[26];
        for(char ch : s.toCharArray()){
            frequency[ch - 'a']++;
        }

        for(char ch : t.toCharArray()){
            frequency[ch-'a']--;
        }

        for(int count : frequency){
            if(count != 0){
                return false;
            }
        }
    return true;
    //TC is O(n)
    }
}