package ws01;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppleTest {
    @Test
    public void getName() throws Exception {
        Apple myObject = new Apple();
        assertEquals("apple", myObject.getName());
        assertEquals("pineapple", myObject.getName());
    }

    @Test
    public void setName() throws Exception {

    }

}