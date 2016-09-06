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
class method{
int length,breadth;
void getdata(int l, int b)//method define gareko
{
    length = l;
    breadth =b;

}
    int area()//area method ho jastle regtangle ko area calculate garxa from givin l anb b. the return area is integer as defined
    {
        int rectanglearea = length * breadth;
        return rectanglearea;
    }
        }
public class Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        method obj = new method();
        obj.getdata(6,6);
        int result= obj.area();
        System.out.println("Area of rectangle is"+result);
    }
    
}
