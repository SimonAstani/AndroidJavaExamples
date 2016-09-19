/*
void addElement(E obj)
 */
package vector;

import java.util.Vector;

/**
 *
 * @author simon
 */
public class vector3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Vector<Integer> vectorobj  = new Vector<Integer>();
         vectorobj.add(5);
         vectorobj.add(5);
         vectorobj.add(7);
         vectorobj.add(2);
         vectorobj.add(9);
         System.out.println("Values in vector object" + vectorobj);
         vectorobj.addElement(11);
         System.out.println("Values in vector object after adding" + vectorobj);
    }
    
}
