package bootcamp;

/**
 * Class of example to this one about Methods.
 */
public class Loan {

    public static int getTwoQuota() {
        return 2;
    }

    public static int getThreeQuota() {

        return 3;
    }

    public static double getTaxTwoQuotas() {

        return 0.3;
    }

    public static double getTaxThreeQuotas() {

        return 0.45;
    }

    public static void calculate(double value, int quota) {

        if (quota == 2) {

            double valueFinal = value + (value * getTaxTwoQuotas());

            System.out.println("Final loan amount for 2 quotas: USD " + valueFinal);
        } else if (quota == 3) {

            double valueFinal = value + (value * getTaxThreeQuotas());

            System.out.println("Final loan amount for 3 quotas: USD " + valueFinal);
        } else {
            System.out.println("Number of quotas not accepted.");
        }

    }

}
