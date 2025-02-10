//Sajad Mirpour
//January 30th 2025
//Assignment 1
//Creating student details under a university and adding changes
public class Student {
    //fields
    private String name;
    private int age;
    private String studentID;
    private static String universityName = "Tech University";

    // Constructors for fields
    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    // default constructors
    public Student() {
        this.name = "";
        this.age = 0;
        this.studentID = "";
    }

    // Getters and Setters auto filled
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public static String getUniversityName() {
        return universityName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    // a method to display student details
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("University: " + getUniversityName());
        System.out.println(""); //adding a line space due to all student details being connected
    }
}

