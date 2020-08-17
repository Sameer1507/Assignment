/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
/**
 *
 * @author SAM
 */

class Calculator{
    interface add {
         void add(int a, int b);
    }

    interface difference {
         void difference(int a, int b);
    }

    interface product {
         void product(int a, int b);
    }

    interface safeDivision {
         void safeDivision(float a, float b);
    }
}

public class Question1 {


    public static void main(String[] args) {

        Calculator.add c1 = (a,b)-> System.out.println(a+b);
        Calculator.difference c2 = (a,b) -> System.out.println(a-b);
        Calculator.product c3 = (a,b)-> System.out.println(a*b);
        Calculator.safeDivision c4 = (a,b)->{
            try{
                if (b==0) throw new ArithmeticException();
                else System.out.println(a/b);
            }catch (ArithmeticException e){
                System.out.println("Cannot divided by zero");
            }
        };

        c1.add(11,6);
        c2.difference(12,8);
        c3.product(15,9);
        c4.safeDivision(7f,0f);
        c4.safeDivision(27f,5f);
    }
}