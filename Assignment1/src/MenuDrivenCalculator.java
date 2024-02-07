import java.util.Scanner;
public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Power");
            System.out.println("7. Mean");
            System.out.println("8. Variance");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 9) {
                System.out.println("Thank you");
                break;
            }

            double result = 0;

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    float num1 = scanner.nextFloat();
                    System.out.print("Enter second number: ");
                    float num2 = scanner.nextFloat();
                    result = Calculator.addition(num1, num2);
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextFloat();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextFloat();
                    result = Calculator.subtraction(num1, num2);
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextFloat();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextFloat();
                    result = Calculator.multiplication(num1, num2);
                    break;
                case 4:
                    System.out.print("Enter numerator: ");
                    num1 = scanner.nextFloat();
                    System.out.print("Enter denominator: ");
                    num2 = scanner.nextFloat();
                    result = Calculator.division(num1, num2);
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    num1 = scanner.nextFloat();
                    result = Calculator.squareRoot(num1);
                    break;
                case 6:
                    System.out.print("Enter base: ");
                    num1 = scanner.nextFloat();
                    System.out.print("Enter exponent: ");
                    num2 = scanner.nextFloat();
                    result = Calculator.power(num1, num2);
                    break;
                case 7:
                    result = Calculator.Mean();
                    break;
                case 8:
                    result = Calculator.Variance();
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.println();
        }

    }
}
