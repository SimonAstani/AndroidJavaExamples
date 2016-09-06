/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methoddemo;

/**
 *
 * @author simon
 */
//example by changing parameters
public class methodOverloading {
    
    void add(float a,float b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c, int d){
        System.out.println(a+b+c+d);
    }
    public static void main(int a, int b){
         System.out.println(a+b);
    }
    public static void main(String args[]){
        methodOverloading obj = new methodOverloading();
        System.out.println("We are in main method");
        main(1,1);                                          //MAIN METHOD dew chote use gareyo..
        obj.add(5f,4f);                                     //floag data types is used two different parameters
        obj.add(43, 798, 6, 68);
        
    }
    
}
