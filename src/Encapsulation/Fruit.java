/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author simon
 */
public class Fruit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FruitDetails apple = new FruitDetails("Apple", "Rs40", "red");      //using constructor for initialization
         
        //usign getter to get values
        System.out.println("Name :" + apple.getName()+ "  price :" + apple.getPrice() + "  color:" + apple.getColor());
        
        //updating price and collor using setter
        apple.setColor("Green");
        apple.setPrice("RS30");
        System.out.println("price after updating is");
        
        //again using getter to get values
        System.out.println("Name :" + apple.getName()+ " price :" + apple.getPrice() + " color:" + apple.getColor());

        
    }
    
}

/**1. encaptulation is the process of data hiding. as in eg. here. class fruit details is hided form
 * the user and 
 * To achieve abstraiction hamle datafild private use garew so no outside class can access it.  however
 * hamel getter and setter method use garew to appply those method in fruit class.
 * encapsulation is hiding internal detail of the object as frutidetails class
 * 
 * differece betten abstraction and encapsulation is.. on typind phone no in mobile phone.form keypads you dont know how ite
 * is working . it can be achieved form abstracion but how keypad is connected to internal circuit. gives preety much idea of encapsulation
 
 **/

