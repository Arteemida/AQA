package Old.Calculator;

import java.util.Scanner;

public class Lesson_4 {
    static Scanner scanner = new Scanner(System.in);

    public static int inputnumber() {

        int num = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter number. Attempt " + (i + 1));

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Error. Incorrect number");
                scanner.nextLine();
            }
            if (i == 2) {
                System.exit(0);
            }
        }

        return num;
    }

    public static char inputoperator() {

        char operator = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter operator. Attempt " + (i + 1));

            operator = scanner.next().charAt(0);
            if (operator == '/' || operator == '+' || operator == '-' || operator == '*' || operator == '%') {
                return operator;
            } else {
                System.out.println("Error. Incorrect operator");
                scanner.nextLine();
            }
            if (i == 2) {
                System.exit(0);
            }
        }

        return operator;
    }
}
