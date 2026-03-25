package codeforces_1084;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialityStringTest {


    @Test
    void isSpecialityString_Length1() {
        assertFalse(SpecialityString.isSpecialityString("a"));
    }

    @Test
    void isSpecialityString_willWinn() {
        assertTrue(SpecialityString.isSpecialityString("siixxsevvenn"));
    }

    @Test
    void isSpecialityString_willLose() {
        assertFalse(SpecialityString.isSpecialityString("byebye"));
    }
}