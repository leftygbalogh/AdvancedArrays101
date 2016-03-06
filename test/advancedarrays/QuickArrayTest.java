/*
 * Code is prose.
 * 
 * The code is mine. You are free to use it.
 * I put a lot of effort into it so it does what I want it to do.
 * If you use it, you do so at your own risk.
 * If you use it, keep this license and the reference to my profiles.
 * Other than that, have fun.
 * 
 * Lefty G Balogh
 * https://www.linkedin.com/in/leftygbalogh
 * https://github.com/leftygbalogh
 */
package advancedarrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lefty G Balogh
 */
public class QuickArrayTest {

    @Test
    public void testReplaceElement() {
        System.out.println("replaceElement");
        int index = 2;
        int value = 0;
        int[] array = {10, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        QuickArray instance = new QuickArray(array);
        int sumBefore = instance.getSum();
        int realBefore = 505;
        assertEquals(sumBefore, realBefore);

        instance.replaceElement(index, value);
        int sumAfter = instance.getSum();
        int realAfter = 483;
        assertEquals(sumAfter, realAfter);

    }

    @Test
    public void testGetSum() {
        int[] array = {10, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        QuickArray instance = new QuickArray(array);
        int before = instance.getSum();
        int tmp = 505;

        assertEquals(before, tmp);
    }

    @Test
    public void testGetAverage() {
        int[] array = {10, 11, 22, 33, 44, 55, 66, 77, 88, 99};
        QuickArray instance = new QuickArray(array);
        double result = instance.getAverage();
        double expResult = 50.5;

        assertEquals(expResult, result, 0);    }



   }
