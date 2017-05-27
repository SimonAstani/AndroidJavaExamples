/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author simon
 */
public class Interface {
    
    public interface RollnoDetails{
    void rollno();
    }
    public interface PersonDetails extends RollnoDetails{
    void name();
    }
    
    public class Details implements PersonDetails{
        public void name(){
            System.out.println("simonAstnai");
        }
        public void rollno(){
            System.out.println("9849885478");
        }
        public void main(String[] args) {
            
            Details details = new Details();
            System.out.println("Name:");
            details.name();
            
            System.out.println("Email:");
            details.rollno();
            
        }
    
    }
}
