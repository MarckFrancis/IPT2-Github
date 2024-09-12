import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String operator;
        double num1, num2, result;

        System.out.println("Welcome to the Simple Calculator");
        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        operator = scanner.next();

        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();

        switch (operator) {
            case "+":
                result = num1 + num2;
                System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, result);
                break;
            case "-":
                result = num1 - num2;
                System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, result);
                break;
            case "*":
                result = num1 * num2;
                System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please use +, -, *, or /.");
                break;
        }

        scanner.close();
    }
}
