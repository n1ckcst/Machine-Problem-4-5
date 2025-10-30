
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("Enter Student No. 1 Details:");

        System.out.print("Name: ");
        String student1Name = scanner.nextLine();

        int student1Age;                                                                            // REGULAR EXCEPTION HANDLING: STUDENT1AGE
        while (true) {
            System.out.print("Age: ");

            try {
                student1Age = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
            } catch (NullPointerException e) {
                System.out.println("Input cannot be null. Please enter a valid integer for age.");
            } catch (RuntimeException e) {
                System.out.println("An unexpected error occurred: ");
            } catch (Exception e) {
                System.out.println("General Exception occured: ");
            } finally {
                // System.out.println("You have entered the age field.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        System.out.print("Gender (M/F): ");
        char student1Gender = scanner.next().charAt(0);


        double student1Grade;                                                  // REGULAR EXCEPTION HANDLING: STUDENT1GRADE
        while (true){
            try {
                System.out.print("Grade: ");
                student1Grade = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for grade.");
            } catch (NullPointerException e) {
                System.out.println("Input cannot be null. Please enter a valid number for grade.");
            } catch (RuntimeException e) {
                System.out.println("An unexpected error occurred: ");
            } catch (Exception e) {
                System.out.println("General Exception occured: ");
            } finally {
                // System.out.println("You have entered the grade field.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        Student student1 = new Student(student1Name, student1Age, student1Gender, student1Grade);

        System.out.println("===================================");

        System.out.println("Enter Student No. 2 Details:");
        System.out.print("Name: ");
        String student2Name = scanner.nextLine();

        int student2Age;                                                                            // REGULAR EXCEPTION HANDLING: STUDENT2AGE
        while (true) {
            System.out.print("Age: ");

            try {
                student2Age = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
            } catch (NullPointerException e) {
                System.out.println("Input cannot be null. Please enter a valid integer for age.");
            } catch (RuntimeException e) {
                System.out.println("An unexpected error occurred: ");
            } catch (Exception e) {
                System.out.println("General Exception occured: ");
            } finally {
                // System.out.println("You have entered the age field.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        System.out.print("Gender (M/F): ");
        char student2Gender = scanner.next().charAt(0);

        double student2Grade;                                                  // REGULAR EXCEPTION HANDLING: STUDENT2GRADE
        while (true){
            try {
                System.out.print("Grade: ");
                student2Grade = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for grade.");
            } catch (NullPointerException e) {
                System.out.println("Input cannot be null. Please enter a valid number for grade.");
            } catch (RuntimeException e) {
                System.out.println("An unexpected error occurred: ");
            } catch (Exception e) {
                System.out.println("General Exception occured: ");
            } finally {
                // System.out.println("You have entered the grade field.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        Student student2 = new Student(student2Name, student2Age, student2Gender, student2Grade);

        System.out.println("===================================");

        System.out.println("Enter Teacher Details:");
        System.out.print("Name: ");
        String teacherName = scanner.nextLine();

        int teacherAge;                                                                            // REGULAR EXCEPTION HANDLING: TEACHER AGE
        while (true) {
            System.out.print("Age: ");

            try {
                teacherAge = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
            } catch (NullPointerException e) {
                System.out.println("Input cannot be null. Please enter a valid integer for age.");
            } catch (RuntimeException e) {
                System.out.println("An unexpected error occurred: ");
            } catch (Exception e) {
                System.out.println("General Exception occured: ");
            } finally {
                // System.out.println("You have entered the age field.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

        System.out.print("Gender (M/F): ");
        char teacherGender = scanner.next().charAt(0);


        double teacherSalary;                                                   // REGULAR EXCEPTION HANDLING: TEACHER SALARY
        while (true){
            try {
                System.out.print("Salary: ");
                teacherSalary = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number for salary.");
            } catch (NullPointerException e) {
                System.out.println("Input cannot be null. Please enter a valid number for salary.");
            } catch (RuntimeException e) {
                System.out.println("An unexpected error occurred: ");
            } catch (Exception e) {
                System.out.println("General Exception occured: ");
            } finally {
                // System.out.println("You have entered the salary field.");
                scanner.nextLine(); // Clear the invalid input
            }
        }

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