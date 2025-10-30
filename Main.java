
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
    Scanner scanner = new Scanner(System.in);

    System.out.println("===================================");
    System.out.println("Enter Student No. 1 Details:");
    
    System.out.print("Name: ");
    String student1Name = scanner.nextLine();

    System.out.print("Age: ");
    int student1Age = scanner.nextInt();

    System.out.print("Gender (M/F): ");
    char student1Gender = scanner.next().charAt(0);

    System.out.print("Grade: ");
    double student1Grade = scanner.nextDouble();
    
    scanner.nextLine(); 
    Student student1 = new Student(student1Name, student1Age, student1Gender, student1Grade);
    System.out.println("===================================");

    System.out.println("Enter Studednt No. 2 Details:");
    System.out.print("Name: ");
    String student2Name = scanner.nextLine();

    System.out.print("Age: ");
    int student2Age = scanner.nextInt();

    System.out.print("Gender (M/F): ");
    char student2Gender = scanner.next().charAt(0);

    System.out.print("Grade: ");
    double student2Grade = scanner.nextDouble();

    scanner.nextLine();
    Student student2 = new Student(student2Name, student2Age, student2Gender, student2Grade);
    System.out.println("===================================");

    System.out.println("Enter Teacher Details:");
    System.out.print("Name: ");
    String teacherName = scanner.nextLine();

    System.out.print("Age: ");
    int teacherAge = scanner.nextInt();

    System.out.print("Gender (M/F): ");
    char teacherGender = scanner.next().charAt(0);

    System.out.print("Salary: ");
    double teacherSalary = scanner.nextDouble();
    Teacher teacher = new Teacher(teacherName, teacherAge, teacherGender, teacherSalary);
    System.out.println("===================================");

    scanner.close();

    System.out.println("------------------OUTPUT RECORDS------------------");
    System.out.println("Student No. 1:");
    System.out.println("Name: " + student1.getName());
    System.out.println("Age: " + student1.getAge());
    System.out.println("Gender: " + student1.getGender());
    System.out.printf("Grade: %.2f\n", student1.getGrade());
    System.out.println("===================================");

    System.out.println("Student No. 2:");
    System.out.println("Name: " + student2.getName());
    System.out.println("Age: " + student2.getAge());
    System.out.println("Gender: " + student2.getGender());
    System.out.printf("Grade: %.2f\n ", student2.getGrade());
    System.out.println("===================================");

    System.out.println("Teacher:");
    System.out.println("Name: " + teacher.getName());
    System.out.println("Age: " + teacher.getAge());
    System.out.println("Gender: " + teacher.getGender());
    System.out.printf("Salary: %.2f\n", teacher.getSalary());
    

    }
}
