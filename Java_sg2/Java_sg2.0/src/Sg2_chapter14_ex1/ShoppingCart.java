
package Sg2_chapter14_ex1;

/**
 *
 * @author maria
 */
public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);

        // Handle possible ArithmeticException
        try {
            double divResult = calc.divide(15, 0);
            System.out.println("Division Result: " + divResult);
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        try {
            calc.display();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
