package javaCore;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class Test {

    Hello hel= null;

    @Before
    public void setUp() throws Exception {
     hel = new Hello();
    }

    public void test() {
     assertEquals(1, 1);
    }
    /**
     * "@After" method is really unnecessary. But if there are external resources created in the test fixture,
     * you must release those resources yourself. See the next question.
     * @throws Exception
     */
    @After
    public void crash() throws Exception {
        hel = null;
    }


}
