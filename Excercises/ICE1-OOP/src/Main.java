//Sajad Mirpour
//ICE1 OOP
//Jan 29
import oop.payrollsystem.Employee;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static Employee employee = null;

    //adding an employee
    public static Employee addEmployee() {
        System.out.print("Enter employee ID: ");
        int id = input.nextInt();
        input.nextLine(); //added this as otherwise this statement would be skipped and cant be user inputed
        System.out.print("Enter employee name: ");
        String name = input.nextLine();
        System.out.print("Enter employee department: ");
        String department = input.nextLine();
        System.out.print("Enter employee salary: ");
        double salary = input.nextDouble();
        System.out.print("Enter employee tax rate: (as in like 0.10 for example");
        double taxRate = input.nextDouble();

        employee = new Employee(id, name, department, salary, taxRate);
        return employee;
    }

    //view employee details
    public static void viewEmployeeDetails() {
        if (employee != null) {
            employee.displayEmployeeDetails();
        } else {
            System.out.println("No employee available in payroll system.");
        }
    }

    //search employees by their ID
    public static void employeeSearchById(int searchId) {
        if (employee != null && employee.getId() == searchId) {
            employee.displayEmployeeDetails();
        } else {
            System.out.println("Employee is not found.");
        }
    }

    //use of ChatGPT on these 2 parts on search employee by ID and updating employee salary to help build
    //an understanding as everything I was having issue and red underlines and it corrected my errors

    // update an employes salary
    public static void updateEmployeeSalary(int employeeId) {
        if (employee != null && employee.getId() == employeeId) {
            System.out.print("Enter new salary: ");
            double newSalary = input.nextDouble();
            employee.setSalary(newSalary);
            System.out.println("Salary updated successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }
    //main method of the fucntioning payroll system
    public static void main(String[] args) {
        //to keep the program running always until it gets told to stop by return in case 5
        while (true) {
            System.out.println("Employee Payroll System");
            System.out.println("1. Add a new employee");
            System.out.println("2. View employee details");
            System.out.println("3. Search for an employee by ID");
            System.out.println("4. Update employee salary");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    addEmployee();  //adding new employee
                    System.out.println("Employee added successfully!");
                    break;
                case 2:
                    viewEmployeeDetails();  //viewing employee details
                    break;
                case 3:
                    System.out.print("Enter employee ID to search for employee: ");
                    int searchId = input.nextInt();
                    employeeSearchById(searchId);  //search for employee by an ID
                    break;
                case 4:
                    System.out.print("Enter employee ID to update the salary: ");
                    int updateId = input.nextInt();
                    updateEmployeeSalary(updateId);  //updating employee salary
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Sorry the input is invalid please try again.");
            }
        }
    }
}
