package codeforces_188;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpringTest {


    @Test
    public void test1() {
        int[]  expected =  new int[3];

        assertEquals(14 ,Spring.findWater(2,1,3,10) [0]);
        assertEquals(38 ,Spring.findWater(2,1,3,10) [1]);;
        assertEquals(8 ,Spring.findWater(2,1,3,10) [2]);;
    }

    @Test
    public void test2() {
        int[]  expected =  new int[3];

        assertEquals(881 ,Spring.findWater(6,20,15,1000) [0]);
        assertEquals(236 ,Spring.findWater(6,20,15,1000) [1]);;
        assertEquals(281 ,Spring.findWater(6,20,15,1000) [2]);;
    }

}