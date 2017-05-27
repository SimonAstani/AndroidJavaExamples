/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author root
 */
public class ArrayWithForLoop {

    public static void main(String[] args) {
        double[] myList = {1.5, 2.5, 6.7, 8.4, 4.8};

        //print all the array elements using for loop
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

        double total = 0;
        //summing all the double values
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("The total sum is: " + total);

        // Finding the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Max is " + max);
    }

}
