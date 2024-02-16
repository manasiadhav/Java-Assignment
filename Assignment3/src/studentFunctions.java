import java.util.ArrayList;
import java.util.Scanner;
public class studentFunctions {
    ArrayList<Student> studentList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addStudent() {
        System.out.println("Enter number of students that u want to add");
        int num = sc.nextInt();
        System.out.println("Enter Student/s");
        for (int i = 0; i < num; i++) {
            System.out.println("Enter prn");
            int prn = sc.nextInt();
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter DOB");
            String dob = sc.next();
            System.out.println("Enter marks");
            float marks = sc.nextFloat();
            Student s = new Student(prn, name, dob,marks);
            studentList.add(s);
        }
    }

    public void printStudentDetails() {
        System.out.println("--------- Student Information --------");

        for (int i = 0; i < studentList.size(); i++) {
            printStudent(i);
        }
    }

    public void printStudent(int i) {
        System.out.println("PRN" + "\t" + "Name" + "\t" + "DOB"+"\t" +"Marks");
        System.out.println(studentList.get(i).getPrn() + "   " +
                studentList.get(i).getName() + "  " +
                studentList.get(i).getDob() + "  " +
                studentList.get(i).getMarks());

    }


    @Override
    public String toString() {

        String str = "";
        for (int i = 0; i < studentList.size(); i++) {

            str = studentList.get(i).getPrn() + "   " +
                    studentList.get(i).getName() + "  " +
                    studentList.get(i).getDob() + "  " +
                    studentList.get(i).getMarks();
        }

        return str;
    }


    public void deleteStudent() {
        System.out.println("Enter prn for deleting the book");
        int prn = sc.nextInt();
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).getPrn() + "deleted from ArrayList");
            if (studentList.get(i).getPrn() == prn)
                studentList.remove(i);
            else {
                System.out.println("student not found");
            }
        }
    }
}
