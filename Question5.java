package question5;

/**
 *
 * @author SAM
 */
import java.util.*;

class Complex{
    double real;
    double imaginary;

    public Complex(double real , double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex sum(Complex b){
        return new Complex(this.real+b.real,this.imaginary+b.imaginary);
    }
    public Complex difference(Complex b){
        return new Complex(this.real-b.real,this.imaginary-b.imaginary);
    }
    public Complex product(Complex b){
        return new Complex( this.real*b.real - this.imaginary*b.imaginary , this.imaginary*b.real + this.real*b.imaginary);
    }
    public String toString(){
        return this.real + " + " + this.imaginary+"i";
    }
}
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
            System.out.println("Enter the first group of Real & Imaginary No.s seperated by space: ");
            double a1 = s.nextDouble();
            double b1 = s.nextDouble();
            System.out.println("Enter the second group of Real & Imaginary No.s seperated by space: ");
            double a2 = s.nextDouble();
            double b2 = s.nextDouble();

            System.out.println("\nEnter your choice: \n1. Sum\n2. Difference\n3. Product\n");
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    System.out.println(new Complex(a1,b1).sum(new Complex(a2,b2)));
                    break;
                case 2:
                    System.out.println(new Complex(a1,b1).difference(new Complex(a2,b2)));
                    break;
                case 3:
                    System.out.println(new Complex(a1,b1).product(new Complex(a2,b2)));
                    break;
                default:
                    System.out.println("Invalid Input");
            }
    
    }
}