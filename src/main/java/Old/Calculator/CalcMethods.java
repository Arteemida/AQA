package Old.Calculator;

public class CalcMethods {
    public static void main(String[] args) {
        int num1, num2;
        char operator;
        num1 = Lesson_4.inputnumber();
        operator = Lesson_4.inputoperator();
        num2 = Lesson_4.inputnumber();
        switch (operator) {
            case '+':
                System.out.println(Methods.addition(num1, num2));
                break;
            case '-':
                System.out.println(Methods.subtraction(num1, num2));
                break;
            case '*':
                System.out.println(Methods.multiplication(num1, num2));
                break;
            case '/':
                System.out.println(Methods.division(num1, num2));
                break;
            case '%':
                System.out.println(Methods.percent(num1, num2));
                break;
        }
    }
}
