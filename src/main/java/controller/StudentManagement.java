package controller;

import domain.Student;
import service.StudentService;

import java.util.Scanner;

public class StudentManagement {

    public static void start(){
        Scanner input = new Scanner(System.in);

        StudentService studentService = new StudentService();

        int select;
        do{
            System.out.println("======================================");
            System.out.println("domain.Student Management System");
            System.out.println("1 - Register a domain.Student");
            System.out.println("2 - List all Students");
            System.out.println("3 - Update a domain.Student");
            System.out.println("4 - Delete a domain.Student");
            System.out.println("5 - Find a domain.Student");
            System.out.println("6 - Generate Report for all Students");
            System.out.println("0 - Exit");
            System.out.println();
            System.out.println("Choose an operation:");
            select = input.nextInt();
            input.nextLine();
            switch (select){
                case 1:
                    //Register a domain.Student
                    Student student = studentService.getNewStudent();
                    studentService.registerServiceStudent(student);
                    break;
                case 2:
                    //List all Students
                    break;
                case 3:
                    //Update a domain.Student
                    break;
                case 4:
                    //Delete a domain.Student
                    break;
                case 5:
                    //Find a domain.Student
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
