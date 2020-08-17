/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questions8;

/**
 *
 * @author SAM
 */
class customException extends Exception {
    public customException(String message) {
        super(message);
    }
}

class genericClass {

    public <S> void genericMethod(S value) {
        try {
            if (value instanceof String) throw new customException("String value!");
            double v = Double.parseDouble(String.valueOf(value));
            System.out.println((v * 2) / 3);
        } catch (customException e) {
            System.out.println(e.getMessage());
        }
    }
}
public class Question8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     genericClass g = new genericClass();
        g.genericMethod(3);
        g.genericMethod(27.6f);
        g.genericMethod(51.0d);
        g.genericMethod("String");
    }
    
}
