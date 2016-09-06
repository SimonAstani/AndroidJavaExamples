/*

==========>There exist three types of constructor
1.Defult constructor
2.Parameterized constructor
3.Copy constructor


 */
package constructor;

/**
 *
 * @author simon
 */


//=========================>Default constructor<====================================
class Display
{
 int a = 5;
 int b= 6;
 int c;  //assign default value
 
 Display()          //defualt constructor no argument ane body part is also empty compiler create automatically eg. here c vitra 0 value 
                    //automatically assign gareko xa.
 {
     a = 3; //overide default value
 }
 void show()
 {
     System.out.println("value of a:" +a);
     System.out.println("value of b : "+ b);
     System.out.println("value of c :" + c);
     System.out.println("\n \n \n");
 }
 
    
}

class DisplayDemo{
    public static void main(String[] args) {
        Display d = new Display();
        d.show();
    }
    }


//============================>Type 2. parameterized constructor<=================================//
class square
{
   int length;
   
   //constructor to initilize lenght value
   square(int l)
   {
       length = l;
   }
   int area()
   {
       return(length * length);
   } 
        
}
class paramconstructDemo
{
    public static void main(String[] args) {
        square firstSquare = new square(5);
        square secondSquare = new square(3);
        System.out.println("Area of first square :" + firstSquare.area());
        System.out.println("Area of Second Square : " + secondSquare.area());
    }
}


//===================>Type 3. Copy constructor>=================================//

class RectangleVolume
{
    int length,breadth,height;
    
    //constructor to be initialized

    public RectangleVolume(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }
    //copy constructor

    public RectangleVolume(RectangleVolume obj) {
            System.out.println("copy construction invokoed");
            length=obj.length;
            breadth=obj.breadth;
            height=obj.height;
    }
    
    //method to calculate volume
    int volume()
    {
        return (length*breadth*height);
    }
    
}

class copyConstructionDemo
{
    public static void main(String[] args) {
        RectangleVolume firstvolume = new RectangleVolume(5, 5, 2);
        RectangleVolume secondvolume = new RectangleVolume(firstvolume); //second colume is follwed by copy construction
        System.out.println("volume of first case:"+firstvolume.volume());
        
        System.out.println("volume of second case:"+secondvolume.volume());
    }
}
