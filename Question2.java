/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2;

/**
 *
 * @author SAM
 */
import java.util.*;

class Rectangle{
    int height,width;

    public void display(){
        System.out.println("Width: " + width +" "+ "Height: " + height);
    }
}
class RectangleArea extends Rectangle{

    public void read_input() {
        Scanner s = new Scanner(System.in);
        System.out.println( "Enter Width of Reactangle: " );
        width = s.nextInt();
       System.out.println( "Enter Height of Reactangle: " );
        height = s.nextInt();
        
    }

    @Override
    public void display() {
        super.display();
        System.out.println( "Area of Reactangle: " + width*height);
    }
}
public class Question2 {

    public static void main(String[] args) {
        // TODO code application logic here
           RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.read_input();
        rectangleArea.display();

    }
    
}
