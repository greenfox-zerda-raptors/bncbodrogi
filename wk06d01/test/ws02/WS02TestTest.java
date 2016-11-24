package ws02;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class WS02TestTest {
    @Test
    public void sumOfAllThings() throws Exception {
        WS02Test test = new WS02Test();
        Integer five = new Integer(5);
        ArrayList<Integer> aryLstMty = new ArrayList<>();
        ArrayList<Integer> aryLst = new ArrayList<>();
        ArrayList<Integer> aryLtONeElement = new ArrayList<>();
        aryLtONeElement.add(five);

        for (int i = 0; i < 10; i++){
            aryLst.add(i);
        }

        assertEquals(Integer.valueOf(45), test.sumOfAllThings(aryLst));
        assertEquals(Integer.valueOf(0), test.sumOfAllThings(aryLstMty));
        assertEquals(Integer.valueOf(5), test.sumOfAllThings(aryLtONeElement));
    }

}