package CollegeManagementSystem;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMarks {
    public static void enterMarks(Scanner scanner) {

        try{
            System.out.print("\nEnter roll number: ");
            String rollNumber = scanner.nextLine();

            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            Student student = new Student(rollNumber, marks);

            try {
                FileWriter writer = new FileWriter("student_marks.txt", true);
                writer.write(student.getRollNumber() + "," + student.getMarks());
                writer.write(System.lineSeparator());
                writer.close();
                System.out.println("Data written to the file successfully!\n");
            } catch (IOException e) {
                System.out.println("Error writing to the file.\n");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Wrong Input");
        }
    }
}

