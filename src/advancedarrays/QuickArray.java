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
public class QuickArray {

    private int[] baseArray;
    private int sum;
    private double average;
    private int size;

    public void printArray() {
        for (int i = 0; i < baseArray.length - 1; i++) {
            System.out.print(baseArray[i] + ", ");
        }
        System.out.println(baseArray[baseArray.length - 1]);
    }

    public void replaceElement(int index, int value) {
        int tmp = baseArray[index];
        sum = sum - tmp + value;
        calculateAverage();

        baseArray[index] = value;

    }

    private void calculateSum() {
        sum = 0;
        for (int i : baseArray) {
            sum = sum + i;
        }

    }

    private void calculateSize() {

        size = baseArray.length;

    }

    private void calculateAverage() {

        if (size != 0) {
            average = (double) sum / size;
        }
    }

    public int[] copyClone(int[] array) {
        int[] bArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            bArray[i] = array[i];
        }
        return bArray;

    }

    public QuickArray() {
    }

    public QuickArray(int[] baseArray) {
        setBaseArray(baseArray);
        calculateSum();
        calculateSize();
        calculateAverage();

    }

    public int[] getBaseArray() {
        return baseArray;
    }

    public void setBaseArray(int[] baseArray) {
        this.baseArray = copyClone(baseArray);
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
