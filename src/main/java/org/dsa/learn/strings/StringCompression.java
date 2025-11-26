package org.dsa.learn.strings;

/**
 * Input = "aabbbccc" => Output should be a2b3c3
 * Input = "abc" => Output should return abc instead of a1b1c1
 * Constraints - Makesure the given input length is less than output length else return the given.
 */

public class StringCompression {
    public static String get(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                sb.append(input.charAt(i));
                if (count > 1) {
                    sb.append(count);
                }
                count = 1;
            }
        }

        // Append the last character and its count
        sb.append(input.charAt(input.length() - 1));
        if (count > 1) {
            sb.append(count);
        }

        return sb.length() >= input.length() ? input : sb.toString();
    }
}
