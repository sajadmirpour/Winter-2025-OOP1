//Sajad Mirpour
//ICE1 OOP
//Jan 29 2025
package oop.payrollsystem;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    private double taxRate;

    public Employee(int id, String name, String department, double salary, double taxRate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.taxRate = taxRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }
    //calcualting the net salry
    public double calculateNetSalary() {
        return salary - (salary * taxRate);
    }
    //printing the employee details statemenets when it gets called upon
    public void displayEmployeeDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary +
                ", Tax Rate: " + taxRate + ", Net Salary: " + calculateNetSalary());
    }
}
