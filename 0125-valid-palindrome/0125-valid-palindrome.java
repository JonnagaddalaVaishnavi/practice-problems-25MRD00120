class Solution {
    public boolean isPalindrome(String s) {

        // Initialize two pointers:
        // i starts from the beginning, j starts from the end of the string
        int i = 0, j = s.length() - 1;

        // Continue until the two pointers meet or cross
        while (i <= j) {
            // Skip non-alphanumeric characters from the left side
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            } 
            // Skip non-alphanumeric characters from the right side
            else if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            } 
            else {
                // Compare characters in a case-insensitive manner
                if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                    // If mismatch found, it's not a palindrome
                    return false;
                }
                // Move both pointers inward
                i++;
                j--;
            }
        }

        // If all valid characters matched, the string is a palindrome
        return true;
    }
}
