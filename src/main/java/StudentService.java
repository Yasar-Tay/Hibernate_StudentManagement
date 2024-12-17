import java.util.Scanner;

public class StudentService {
    //service class

    StudentRepository studentRepository = new StudentRepository();
    Scanner scanner = new Scanner(System.in);

    public Student getNewStudent() {

        System.out.println("id:");
        Integer id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter a first name:");    // "         adkhh       " ->
        String firstName = scanner.nextLine().trim();
        System.out.println("Enter a last name:");   // "         adkhh       " ->
        String lastName = scanner.nextLine().trim();

        String fullName = firstName + " " + lastName;

        System.out.println("Enter a grade:");
        int grade = scanner.nextInt();
        scanner.nextLine();

        return new Student(id, fullName, grade);
    }

    public void registerServiceStudent(Student student) {

        studentRepository.registerStudent(student);
        System.out.println("New added student: " + student);
    }

}
