import java.util.Scanner;

public class studentDemo {
    public static void main(String[] args) {
        studentFunctions studentFunctions = new studentFunctions();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentFunctions.addStudent();
                    break;
                case 2:
                    studentFunctions.printStudentDetails();
                    break;
                case 3:
                    studentFunctions.deleteStudent();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}