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
public class StringExamples {
    public static void main(String[] args) {
        jack();
        jill();
        
        int[] temp = new int[5];
        System.out.println(temp[6]);
    }
    
    public static void jack(){
    String str1 = "hello3";
    String str2 = "hello" + "3";
        System.out.println(str1 == str2);
    }
    public static void jill(){
    String str1 ="hello";
    String str2 = "hello" +str1.length();
        System.out.println(str1 == str2);
    }
    
}
