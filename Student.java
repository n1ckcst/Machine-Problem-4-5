//subclass Student na nag-eextend sa superclass Person

class Student extends Person {

    private double grade;

    public Student(String name, int age, char gender, double grade) {
        super(name, age, gender); // caller for the constructor of the superclass (Person)
        this.grade = grade; // ginawan ng grade getter dahil walang grade getter sa superclass
    }

    // getter for grade attribute
    public double getGrade() {
        return grade;
    }

    // setter for grade attribute
    public void setGrade(double grade) {
        this.grade = grade;
    }

}
// Student class inherits attributes and methods from Person class
// Additional attribute: grade