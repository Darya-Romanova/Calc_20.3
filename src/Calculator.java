import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char userInput = 'C';
        double firstOperand = 0;
        char operation = 'z';
        double secondOperand = 0;
        double result = 0;
        do {
            if (userInput == 'C') {
                System.out.println(":");
                firstOperand = scanner.nextInt();
                System.out.println("Увядзіце першы аперанд:");
                operation = scanner.next().charAt(0);
            } else {
                firstOperand = result;
                operation = userInput;
            }
            System.out.println("Увядзіце другі аперанд:");
            secondOperand = scanner.nextInt();
            result = calculate(firstOperand, operation, secondOperand);
            System.out.println(result);
            System.out.println("Увядзіце аперацыю:");
            userInput = scanner.next().charAt(0);
        } while (userInput != 's');
    }

    public static double calculate(double firstOperand, char operation, double secondOperand) {
        double result = 0;
        switch (operation) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                result = firstOperand / secondOperand;
                break;
            default:
                System.out.println("Няправільная аперацыя");
        }
        return result;
    }
}