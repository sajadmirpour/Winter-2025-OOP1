//Sajad Mirpour
//January 30th 2025
//Assignment 1
//Creating student details under a university and adding changes
public class Main {
    public static void main(String[] args) {
        // creating 2 students objects
        Student student1 = new Student("Jonathan", 18, "100960121");
        Student student2 = new Student("George", 19, "100960081");

        // Displaying the details of both of the students
        student1.displayDetails();
        student2.displayDetails();

        // Using the getters and setters
        // Replacing Jonathan (student1) with Marcus using the getters and setters
        student1.setName("Marcus");
        student1.setAge(22);
        student1.setStudentID("100962180");

        // Printing the details
        student1.displayDetails();

        // Changing the univsity name
        Student.changeUniversityName("Ontario Tech University");

        // Displaying the details again to see the change in university name
        System.out.println("After changes:"); //To make terminal more clear on when the change is made
        System.out.println("");
        student1.displayDetails();
        student2.displayDetails();
    }
}

