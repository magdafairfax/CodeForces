package codeforces_1086;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class CyclistsTest {

    @Test
    void getCyclistTest1() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(42);
        queue.add(1);

        assertEquals(0, Cyclists.getMaxWins(queue, 1, 2, 42));
    }

    @Test
    void getCyclistTest2() {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(2);
        queue.add(1);
        queue.add(2);

        assertEquals(5, Cyclists.getMaxWins(queue, 2, 1, 6));
    }

}