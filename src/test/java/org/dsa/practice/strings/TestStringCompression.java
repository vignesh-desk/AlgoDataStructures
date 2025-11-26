package org.dsa.practice.strings;

import org.dsa.learn.strings.StringCompression;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStringCompression {
    @Test
    public void testStringCompressionAttains() {
        var input = "aaabbaa";
        final var my_result = StringCompression.get(input);

        // Derive your solution here and replace the hard coded result
        var your_result = "a3b2a2";

        Assertions.assertEquals(your_result, my_result);
    }

    @Test
    public void testStringCompressionNotAttains() {
        var input = "abcde";
        final var my_result = StringCompression.get(input);

        // Derive your solution here and replace the hard coded result
        var your_result = "abcde";

        Assertions.assertEquals(your_result, my_result);
    }
}
