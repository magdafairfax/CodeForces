package codeforces_1085;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AnimatronicsTest {

    @Test
    void findMinTimeWithOneAnimatronicsTest1() {
        assertEquals(7, Animatronics.findMinTime(List.of(1, 4, 9, 16, 25), 1, 32));
    }

    @Test
    void findMinTimeWithOneAnimatronicsTest2() {
        assertEquals(0, Animatronics.findMinTime(List.of(1), 1, 1));
    }

    @Test
    void findMinTimeWithTwoAnimatronicsTest1() {
        assertEquals(5, Animatronics.findMinTime(List.of(10), 2, 10));
    }

    @Test
    void findMinTimeWithTwoAnimatronicsTest2() {
        assertEquals(1, Animatronics.findMinTime(List.of(6, 7), 2, 7));
    }

    @Test
    void findMinTimeWithThreeAnimatronics() {
        assertEquals(19, Animatronics.findMinTime(List.of(13, 37), 3, 40));
    }

    @Test
    void findMinTimeWithFiveAnimatronics() {
        assertEquals(19, Animatronics.findMinTime(List.of(3, 17, 20, 28, 36 ,44, 45, 50), 5, 60));
    }

    @Test
    void findMinTimeWithSevenAnimatronics() {
        assertEquals(1477, Animatronics.findMinTime(List.of(6, 7, 66, 77, 666, 777), 7, 1987));
    }
}