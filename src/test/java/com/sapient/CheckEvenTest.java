package com.sapient;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckEvenTest {
    private CheckEven app;
    
    @Before
    public void setup() {
        app = new CheckEven();
    }
    
    
    @Test
    public void testNine() {
        boolean count=app.check(9);
        assertTrue(count == false);
    }

    @Test
    public void testSix() {
        boolean count=app.check(6);
        assertTrue(count == true);
    }

    @Test
    public void testFive() {
       boolean count=app.check(5);
       assertTrue(count == false);
    }
}