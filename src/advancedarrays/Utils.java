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

/**
 *
 * @author Lefty G Balogh
 */
public class Utils {

    public int[] copyClone2(int[] array) {
        int[] bArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            bArray[i] = array[i];
        }
        return bArray;
    }
}
