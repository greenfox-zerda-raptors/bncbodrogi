import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Bence on 2017.02.17..
 */
public class AppTest {

    ArrayList<Integer> oneToFive = new ArrayList<Integer>() {{
        for(int i = 1; i < 6; i++){
            add(i);
        }
    }};

    ArrayList<Integer> threeToSeven = new ArrayList<Integer>() {{
        for(int i = 3; i < 8; i++){
            add(i);
        }
    }};

    @Test
    public void onlyInTheFirstTest() throws Exception {

        ArrayList<Integer> expected = new ArrayList<Integer>() {{
           add(1);
           add(2);
        }};

        assertEquals(expected, App.onlyInTheFirst(oneToFive, threeToSeven));
    }

}