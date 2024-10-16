package StudentManagementSystem;

import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCollege Management System");
            System.out.println("1. Enter Marks");
            System.out.println("2. Get Marks");
            System.out.println("3. Exit");
            System.out.print("\nEnter your choice: ");


            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    InputMarks.enterMarks(scanner);
                    break;
                case 2:
                    GetMarks.getMarks(scanner);
                    break;
                case 3:
                    System.out.println("Exiting the program.\n");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.\n");
                    break;
            }
        }
    }

    private static class InputMarks {

        private static void enterMarks(Scanner scanner) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public InputMarks() {
        }
    }

    private static class GetMarks {

        private static void getMarks(Scanner scanner) {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public GetMarks() {
        }
    }
}

