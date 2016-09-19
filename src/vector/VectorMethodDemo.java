/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vector;

import java.util.Vector;

/**
 *
 * @author simon
 */
public class VectorMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Vector<Integer> vectorObject = new Vector<Integer>();
           vectorObject.add(2);
           vectorObject.add(5);
           vectorObject.add(9);
           vectorObject.add(5);
           vectorObject.add(5);
           
           System.out.println("values of vector object is :" +vectorObject);
    }
    
}
