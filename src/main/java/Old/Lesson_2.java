package Old;

import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
        double num1 = 0, num2 = 0, result = 0;
        char operator;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number");
        if (input.hasNextDouble()) {
            num1 = input.nextDouble();
        } else {
            System.out.println("Error. Please, enter correct number.");
            System.exit(0);
        }

        System.out.println("Choose an operator(+,-,*,/ or %)");
        operator = input.next().charAt(0);

        System.out.println("Enter 2nd number");
        if (input.hasNextDouble()) {
            num2 = input.nextDouble();
        } else {
            System.out.println("Error. Please, enter correct number.");
            System.exit(0);
        }

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error. Division by zero.");
                    System.exit(0);
                } else {
                    result = num1 / num2;
                }
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Error. Division by zero.");
                    System.exit(0);
                } else {
                    result = num1 / num2 * 100;
                }
                break;
            default:
                System.out.println("Error. Incorrect operator.");
                System.exit(0);
                break;
        }
        System.out.println("Result: " + result);
        System.exit(0);
    }
}