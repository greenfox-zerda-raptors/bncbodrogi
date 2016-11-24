package ws03;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by User on 2016.11.21..
 */
public class FibonacchoTest {

    public static double fibcalc(int num) {
        return Math.floor(Math.pow((1+Math.sqrt(5))/2, num) / Math.sqrt(5) + 0.5);
    }

    @Test
    public void calculateFibonaccho() throws Exception {
        Fibonaccho fibi = new Fibonaccho();
        int testNum = (int)fibcalc(3);
        assertEquals(Integer.valueOf(testNum) , fibi.calculateFibonaccho(-10));
    }

}