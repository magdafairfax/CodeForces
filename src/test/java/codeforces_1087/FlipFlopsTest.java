package codeforces_1087;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlipFlopsTest {

    @Test
    void flipFlops_test1() throws UnsupportedOperationException{
        List<Long> list = new ArrayList<Long>();
        list.add(21L);
        assertEquals(12L, FlipFlops.findMaxPower(12L, 23L, list));
    }

    @Test
    void flipFlops_test2() throws UnsupportedOperationException{
        List<Long> list = new ArrayList<Long>();
        list.add(1L);
        list.add(2L);
        list.add(93L);
        list.add(84l);
        list.add(2l);
        assertEquals(53l, FlipFlops.findMaxPower(18L, 30L, list));
    }

    @Test
    void flipFlops_test3() throws UnsupportedOperationException{
        List<Long> list = new ArrayList<Long>();
        list.add(19L);
        list.add(1000000000L);
        list.add(1L);
        list.add(9L);
        list.add(2L);
        list.add(3l);
        list.add(8l);
        list.add(1l);
        list.add(2l);
        list.add(3l);
        assertEquals(3000000048L, FlipFlops.findMaxPower(1000000000L, 1000000000L, list));
    }

}