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
public class methodOverding {

   class Animal{
    void run(){
        System.out.println("Animal is running");
    }
   }
   
   static class horse extends Animal{
   //run() method is override heres
       void run(){
           System.out.println("Horse is running");
       }
       public static void main(String[] args) {
           horse ghoda = new horse();
           ghoda.run();
       }
   }
   
    
}
