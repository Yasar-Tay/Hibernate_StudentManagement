import java.util.Scanner;

public class StudentManagementRunner {
    public static void main(String[] args) {
        start();
    }

    private static void start(){
        Scanner input = new Scanner(System.in);

        int select;
        do{
            System.out.println("======================================");
            System.out.println("Student Management System");
            System.out.println("1 - Register a Student");
            System.out.println("2 - List all Students");
            System.out.println("3 - Update a Student");
            System.out.println("4 - Delete a Student");
            System.out.println("5 - Find a Student");
            System.out.println("6 - Generate Report for all Students");
            System.out.println("0 - Exit");
            System.out.println();
            System.out.println("Choose an operation:");
            select = input.nextInt();
            input.nextLine();
            switch (select){
                case 1:
                    //Register a Student
                    break;
                case 2:
                    //List all Students
                    break;
                case 3:
                    //Update a Student
                    break;
                case 4:
                    //Delete a Student
                    break;
                case 5:
                    //Find a Student
                    break;
                case 6:
                    //Generate Report for all Students
                    break;
                case 0:
                    System.out.println("Have a great day!");
                    break;
                default:
                    System.out.println("Invalid input! Please choose a valid option.");
                    break;
            }
        }while(select != 0);
    }
}
