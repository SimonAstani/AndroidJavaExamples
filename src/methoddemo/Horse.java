//This horse is an example of method overiding.
//Here in the below example. hamle animal  vanne class vitra kehe kura print garew
//ra tyo print gereko method run arko class horse ma declare gareara. print garew
//finally hamele horse is ruuning print garna choild class horse jun parent class animal bata extend gareko xa
//tesma run() method lai overide garew
//in horse clild class some functionalily is changed to the same method in parent class . so it is overidden
class Animal{
        void run(){
            System.out.print("Animal is print or running");
        }
    }
    
    public class Horse extends Animal{
       @Override                                                //overide lekhna optimal xa yesle chahe compiler lai method overide xa vanne sandesh dinxa
           void run(){
          System.out.println("HOrse is running not animal");
          }
           
          public static void main(String[] args) {
        // TODO code application logic here
        Horse horse = new Horse();
        horse.run();
            
    }
    }
/*Adavantage of method overiding7
1.made to achieve dynamic binging or runtime polymorphism
2.gives more specification to the method that is already running in the base class      */

/*rules for method overiding
1.must extends parent class in base claass
2.method that is overiden must have same parameters
3.method that is overidden mustnot be final or static*/

/*Points to be remember
1.final or static method cannot be overidden
2.it is also called runtime polymorphism or dynamic binging*/