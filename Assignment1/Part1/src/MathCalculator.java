import java.io.IOException;

public class MathCalculator {

    private InputMethods inputMethods;
    private FibFact fibFact;

    public MathCalculator(InputMethods inputMethods, FibFact fibFact) {
        this.inputMethods = inputMethods;
        this.fibFact = fibFact;
    }

    public void displayMenu() {
        System.out.println("Choose an operation:");
        System.out.println("1. Fibonacci");
        System.out.println("2. Factorial");
        System.out.println("3. Exit");
    }

    private void calculateFibonacci() throws IOException {
        int n = inputMethods.getInput();
        System.out.println("Fibonacci(" + n + ") = " + fibFact.calculateFibonacci(n));
    }

    private void calculateFactorial() throws IOException {
        int n = inputMethods.getInput();
        System.out.println("Factorial(" + n + ") = " + fibFact.calculateFactorial(n));
    }

    public void performOperation() throws IOException {
        final int EXIT_OPTION = 3;
        int choice;

        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = inputMethods.inputScanner();

            switch (choice) {
                case 1:
                    calculateFibonacci();
                    break;
                case 2:
                    calculateFactorial();
                    break;
                case EXIT_OPTION:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }

        } while (choice != EXIT_OPTION);
    }

    public static void main(String[] args) throws IOException {
        InputMethods inputMethods = new InputMethods();
        FibFact fibFact = new FibFact();
        MathCalculator mathCalculator = new MathCalculator(inputMethods, fibFact);

        mathCalculator.performOperation();
    }
}