package edu.escuelaing.arep.stat;

import edu.escuelaing.arep.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

/**
 *
 * @author dnielben
 */
public class StatIT extends TestCase {
    
    public StatIT(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of mean method, of class Stat.
     */
    public void testMean() {
        System.out.println("mean");
        List<Double> lval = new LinkedList();
        lval.add(160.0);
        Double expResult = 160.0;
        Double result = Stat.mean(lval);
        assertEquals(expResult, result);
    }
    
}
