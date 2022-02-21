variable, types of data and mathematics operations 


package basecamp 

/**
 * Class for example this exercise to Methods.
 */
public class Calculator {

    public static void add(double number1, double number2) {

        double result = number1 + number2;

        System.out.println("The sum of " + number1 + " more " + number2 + " é " + result);
    }

    public static void subtraction(double number1, double number2) {

        double result = number1 - number2;

        System.out.println("The subtraction of " + number1 + " less " + number2 + " is " + result);
    }

    public static void multiple(double number1, double number2) {

        double result = number1 * number2;

        System.out.println(" The mulitple of " + number1 + " time " + number2 + " is " + result);
    }

    public static void  divide(double number1, double number2) {

        double result = number1 / number2;

        System.out.println("The division of " + number1 + " by " + number2 + " is " + result);
    }

}
