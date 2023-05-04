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
                System.out.println("Введите первое число:");
                firstOperand = scanner.nextInt();
                System.out.println("Введите операцию:");
                operation = scanner.next().charAt(0);
            } else {
                firstOperand = result;
                operation = userInput;
            }
            System.out.println("Введите второе число:");
            secondOperand = scanner.nextInt();
            result = calculate(firstOperand, operation, secondOperand);
            System.out.println(result);
            System.out.println("Введите операцию:");
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
                System.out.println("Неверный знак операции");
        }
        return result;
    }
}