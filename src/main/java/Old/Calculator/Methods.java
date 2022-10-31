package Old.Calculator;

public class Methods {

    private static boolean isNull(int num) {
        return num == 0;
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        if (isNull((int) num2)) {
            divisionByZero();
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public static double percent(double num1, double num2) {
        if (isNull((int) num2)) {
            divisionByZero();
            return 0;
        } else {
            return num1 / num2 * 100;
        }
    }

    private static void divisionByZero() {
        System.out.println("Division by zero");
        System.exit(0);
    }
}
