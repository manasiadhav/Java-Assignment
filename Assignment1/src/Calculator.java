import java.util.Scanner;
public class Calculator {
    public static float addition(float num1, float num2) {
        return num1 + num2;
    }

    public static float subtraction(float num1, float num2) {
        return num1 - num2;
    }

    public static float multiplication(float num1, float num2) {
        return num1 * num2;
    }

    public static float division(float num1, float num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero");
            return Float.NaN;
        }
    }

    public static double squareRoot(double num) {
        if (num >= 0) {
            return Math.sqrt(num);
        } else {
            System.out.println("Cannot calculate square root of a negative number.");
            return Float.NaN;
        }
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static float Mean() {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        int count = 0;

        System.out.println("Enter numbers (type 'end' to finish):");

        while (true) {
            String input = scanner.next();

            if (input.equals("end")) {
                break;
            }

            try {
                float num = Float.parseFloat(input);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'end' to finish");
            }
        }

        if (count > 0) {
            return sum / count;
        } else {
            System.out.println("No valid numbers entered");
            return Float.NaN;
        }
    }

    public static double Variance() {
        Scanner scanner = new Scanner(System.in);
        float sum = 0;
        float sumSquares = 0;
        int count = 0;

        System.out.println("Enter numbers (type 'end' to finish):");

        while (true) {
            String input = scanner.next();

            if (input.equals("end")) {
                break;
            }

            try {
                float num = Float.parseFloat(input);
                sum += num;
                sumSquares += num * num;
                count++;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'end' to finish");
            }
        }

        if (count > 1) {
            float mean = sum / count;
            return sumSquares / count - mean * mean;
        } else {
            System.out.println("Insufficient data to calculate variance");
            return Float.NaN;
        }
    }
}

