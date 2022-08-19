
package Sg2_chapter14_ex1;

/**
 *
 * @author maria
 */
public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    // This method could throw an ArithmeticException
    public double divide(int x, int y) throws ArithmeticException {
        return x / y;
    }

    public void display() throws Exception {
        System.out.println("Calculator");
throw new Exception("Busy throwing new exception.");
    }
}
