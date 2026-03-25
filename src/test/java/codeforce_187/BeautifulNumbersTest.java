package codeforce_187;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulNumbersTest {

    @Test
    void beautifulNumbersTest1() {
        assertEquals(0, BeautifulNumbers.noOfOperations("4"));
    }

    @Test
    void beautifulNumbersTest2() {
        assertEquals(1, BeautifulNumbers.noOfOperations("37"));
    }

    @Test
    void beautifulNumbersTest3() {
        assertEquals(2, BeautifulNumbers.noOfOperations("645"));
    }

    @Test
    void beautifulNumbersTest4() {
        assertEquals(12, BeautifulNumbers.noOfOperations("2374236843276813"));
    }

}