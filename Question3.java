/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author SAM
 */
import java.util.*;

class Employee{
    private int empId;
    private String empName;
    private String empDesignation;
    private int empSalary;
    private String empLocation;

    public Employee(int empId, String empName, String empDesignation, int empSalary, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empDesignation = empDesignation;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesignation() {
        return empDesignation;
    }

    public void setEmpDesignation(String empDesignation) {
        this.empDesignation = empDesignation;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesignation='" + empDesignation + '\'' +
                ", empSalary=" + empSalary +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }
}
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(01,"Abhishek","Regional Manager",29000,"Patna"));
        employees.add(new Employee(02,"Bavita","Junior Engineer",45000,"Gaya"));
        employees.add(new Employee(03,"Upendra","Sub Inspector",55000,"Munger"));
        employees.add(new Employee(04,"Shubham","Clarke",35000,"Lucknow"));
        employees.add(new Employee(05,"RaviKant","Professor",75000,"Motihari"));
        employees.add(new Employee(06,"Aditya","Assistant Manager",51500,"Nalanda"));
        employees.add(new Employee(07,"Girish","Lab Assistant",72000,"New Delhi"));
        employees.add(new Employee(18,"Himesh","Teacher",45000,"Roorkee"));
        employees.add(new Employee(19,"Jitendra","Project Manager",50000,"Kolkata"));
        employees.add(new Employee(20,"Ishita","Assistant",32000,"Chennai"));

        System.out.println(" List of employees: \n");
        employees.stream().forEach(e->System.out.println(e.getEmpName()));

        System.out.println("\n Employees whose Salaries greater than 50,000: \n");
        employees.stream().filter(e->e.getEmpSalary()>50000).forEach(e->System.out.println("Name : " + e.getEmpName() + " , Salary : " + e.getEmpSalary()));

        System.out.println("\n Locations starting with letter \'M\' : \n");
        employees.stream().filter(e->e.getEmpLocation().startsWith("M")).forEach(e->System.out.println("Name : " + e.getEmpName() + " , Location : " + e.getEmpLocation()));

        System.out.println("\n Designations ending with \'E\'");
        employees.stream().filter(e->e.getEmpDesignation().endsWith("e")).forEach(e-> System.out.println("Name : " + e.getEmpName() + " , Designation : " + e.getEmpDesignation()));

    }
    
}
