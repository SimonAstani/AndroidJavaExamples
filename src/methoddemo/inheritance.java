/*
 *Importance of inheritance
reusability of code: tala deyeko eg ma jastai. child class le parent class ma use gareko add() method use garyo.
                        instead of recompileing. yesle time ra money matra haina. code ko realiablity ma ne help garxa
Method overiding : 

            Importatnce points
                1. when child and parent class sanga same data members vayo vane.concept lai data hiding vanena
                2.parent class ra child class sanga same funciton vayo vane tetstal method overiding vanenxa
                3.parent class ra child class sanga same static funcion vaye. teslai function hiding vanxa
                4.Inheritance vako base class ra parent class ko relationshiop ho
                5.java ma multiple inheritance possible hunnaaaa
 */
package methoddemo;

class Parent{
    int x = 5;
    int y =4;
    public int add(){
        return x+y;
    }
}
  class Child extends Parent{ //child contains same properties as parent
    int z;
    public void subtract(){
        z = add()-x;
        System.out.print(z);
       
    }
}



public class inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Child child = new Child (); //create new child object
        child.subtract();           //subtraction method called in child object
    }
    
}
