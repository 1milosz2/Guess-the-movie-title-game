package com.company

import org.junit.jupiter.api.Test

class MaskedStringTest extends GroovyTestCase {
    @Test

    void testMaskString() {
        MaskedString s = new MaskedString("alibaba rozbojnik");
        assertEquals("All characters apart from Whitespaces should have been substituted with stars","******* *********",s.maskedString);
    }

    void testTryToRevealLetter() {
        MaskedString s = "alibaba";
        char a = 'a';
        String outcome = s.tryToRevealLetter(a)
        assertEquals("This should reveal all a","a***a*a",outcome)
    }

    void testTryToRevealString() {
        MaskedString s = "alibaba rozbojnik";
        String outcome = s.tryToRevealString("alibaba rozbojnik")
        assertEquals("This should reveal whole text",outcome)
    }
}
