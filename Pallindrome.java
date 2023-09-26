package com.thealgorithms.strings;

/**
 * Wikipedia: https://en.wikipedia.org/wiki/Palindrome
 */
class Palindrome {

    /**
     * Check if a string is a palindrome using the first and last character method
     *
     * @param s a string to check
     * @return {@code true} if the given string is a palindrome, otherwise {@code false}
     */
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
