/*
 * with paraeters index and elements
 */
package vector;

import java.util.Vector;

/**
 *
 * @author simon
 */
public class vectorMethodDemo2{
    public static void main(String[] args) {
        Vector<Integer> vectorObject = new Vector<Integer>(500);
        
        vectorObject.add(0,1);
        vectorObject.add(1,4);
        vectorObject.add(2,7);
        vectorObject.add(3,8);
        for(Integer integer:vectorObject)
        {
            System.out.println("Index:" + vectorObject.indexOf(integer) + "value :" + integer);
        }
        
        //adding element at index 1
        vectorObject.add(1,6);
        System.out.println("\nAfter adding value at index 1 \n");
          for(Integer integer:vectorObject)
        {
            System.out.println("Index:" + vectorObject.indexOf(integer) + "value :" + integer);
        }
    }
    
}
