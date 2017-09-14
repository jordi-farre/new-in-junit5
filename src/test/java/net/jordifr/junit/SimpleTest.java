package net.jordifr.junit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("This is a simple test class")
public class SimpleTest {

    @Test
    @DisplayName("This is a simple test method")
    void test() {
        assertEquals("test", "test");
    }

    @RepeatedTest(value = 20, name = "{currentRepetition} de {totalRepetitions}")
    @DisplayName("This is a repeated test")
    void repeatedTest() {
        assertEquals("test", "test");
    }

}
