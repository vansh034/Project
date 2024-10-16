package CollegeManagementSystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GetMarks {
    public static void getMarks(Scanner scanner) {
        System.out.print("\nEnter roll number: ");
        String rollNumber = scanner.nextLine();

        try {
            FileReader reader = new FileReader("student_marks.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            boolean found = false;

            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 2 && data[0].equals(rollNumber)) {
                    double marks = Double.parseDouble(data[1]);
                    System.out.println("Roll Number: " + rollNumber);
                    System.out.println("Marks: " + marks + "\n");
                    found = true;
                    break;
                }
            }

            bufferedReader.close();

            if (!found) {
                System.out.println("No marks found for roll number: " + rollNumber + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file.\n");
        }
    }
}
