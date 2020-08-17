/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions7;

/**
 *
 * @author SAM
 */
class Triangle<L extends Number>{

    public double areaTriangle(L x,L y, L z) {
        double a = x.doubleValue();
        double b = y.doubleValue();
        double c = z.doubleValue();

        if (a<0||b<0||c<0) return 0;

        double s = (a + b + c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-b));
    }

}
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("Area : " + new Triangle().areaTriangle(5 ,10, 15));
           
    }
    
}
