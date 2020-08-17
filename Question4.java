/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4;

/**
 *
 * @author SAM
 */
import java.util.*;
class Circle{
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Default constructor: ");
        Circle c1 = new Circle();
        System.out.println("Radius is: "+c1.getRadius());
        System.out.print("Area is: ");
        System.out.format("%.3f", c1.getArea());
        System.out.println();

        System.out.println(" Parameterized constructor: ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Radius: ");
        int input_radius = Integer.parseInt(sc.nextLine());
        Circle c2 = new Circle(input_radius);
        System.out.println("Radius is: "+c2.getRadius());
        System.out.print("Area is: ");
        System.out.format("%.3f", c2.getArea());
    }
    
}
