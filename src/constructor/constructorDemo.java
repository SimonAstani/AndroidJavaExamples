/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author simon
 */
class rectangle
{
    int length,breadth;
    
    //declare construction to initialize the value of length and breadth]
    rectangle(){
    length = 5;
    breadth = 2;
    }
    //calculate area
    int area()
    {
        int rectArea = length * breadth;
        return  rectArea;
    }
    
}

public class constructorDemo {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        System.err.println("Area of rectangle is:" + r.area());
    }
    
}
/*when line 32 is executed new operator creates a new instance of object that is uninitiallized
constructor rectangle()is called ane vitra ko body part executes hunxa.
==>address of allocated rectangle object is ruturned and assign to the reference variable r
==>texe */
