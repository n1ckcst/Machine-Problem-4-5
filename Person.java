// blueprint for Person object
// superclass of Student and Teacher

public class Person {

    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {  // "this" keyword to refer to the current object's attributes (object = person)
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    
    // getters for each attributes (used to read data)
    
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    // setters for each attributes (used to modify data)

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    
}
