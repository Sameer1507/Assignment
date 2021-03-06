/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author SAM
 */
import java.util.*;

class Employee{
    private String name;
    private int yearOfJoining;
    private int salary;
    private String address;

    public Employee(String name, int yearOfJoining, int salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Robert",1994,55000,"64C-WallStreet"));
        employees.add(new Employee("Sam",2000,42500,"68D-WallStreet"));
        employees.add(new Employee("John",1999,51500,"26B-WallStreet"));

        System.out.format("%-12s%-20s%-20s\n", "Name", "Year of joining", "Address");
        employees.stream().forEach(employee -> System.out.format("%-12s%-20s%-20s\n",employee.getName(),employee.getYearOfJoining(),employee.getAddress()));

    }

    
}
