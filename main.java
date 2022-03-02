package bootcamp;

/**
 * Principal class for exercise about Methods.

   Contribuidor: Eduardo Programador (www.eduardoprogramador.com)
 */
public class Main {

    public static void main(String[] args) {

        // Calculator
        System.out.println("Exercise calculaator");
        Calculator.sum(3, 5);
        Calculadora.subtraction(9, 1.8);
        Calculadora.multiplication(7, 8);
        Calculadora.divide(5, 2.5);
	Calculadora.pow(2.4, 10);
	Calculadora.remainder(123, 17);

        // Message
        System.out.println("Exercise message");
        Mensagem.obtainMessage(8);
        Mensagem.obtainMessage(14);
        Mensagem.obtainMessage(1);

        // Loan
        System.out.println("Exercíse loan");
        Loan.calculate(1000, Loan.getTwoQuotas());
        Loan.calculate(1000, Loan.getThreeQuotas());
        Loan.calculate(1000, 5);

    }
}
