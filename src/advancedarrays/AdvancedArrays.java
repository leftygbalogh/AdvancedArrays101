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
public class AdvancedArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] array = {10,11,22,33,44,55,66,77,88,99};
        QuickArray qArray = new QuickArray(array);
        System.out.println(qArray.getSum());
        System.out.println(qArray.getAverage());
        System.out.println(qArray.getSize());
        
        
        DynamicArray dArray = new DynamicArray(array);
        dArray.printArray();
        dArray.addElement(100);
        dArray.printArray();
        
    }
    
}
