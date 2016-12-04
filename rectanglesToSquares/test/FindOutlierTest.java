import junit.framework.TestCase;

import java.util.Random;

/**
 * Created by User on 2016.12.04..
 */
public class FindOutlierTest extends TestCase {
    public void testFind() throws Exception {

        int arry[] = new int[]{7,7,7,7,2,7,7,7,7,7};
        assertEquals(2, FindOutlier.find(arry));

    }

}