package com.company

import org.junit.jupiter.api.Test

class MovieTitleLoaderTest extends GroovyTestCase {
    @Test
    void testGetRandomMovieTitle() {
        MovieTitleLoader loader = new MovieTitleLoader()
        assertEquals("Those should be two different titles",loader.getRandomMovieTitle(),loader.getRandomMovieTitle());
    }
}
