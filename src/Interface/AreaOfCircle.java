/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author root
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter Radius of circle:");
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();
       
        double area = Math.PI * r * r;
        System.out.println("Area of circle is :" + area);
        
    }
    
}
