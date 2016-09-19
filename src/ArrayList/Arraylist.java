/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class Arraylist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //integer arraylist
      ArrayList<Integer> alist = new ArrayList<Integer>();
      alist.add(4);
      alist.add(5);
      alist.add(8);
        System.out.println("Integer arraylist is:" + alist);
        System.out.println("printing size is:" + alist.size());
        
        //string arraylist
        
        ArrayList<String> slist = new ArrayList<>();
        slist.add("simon");
        slist.add("is a android programmer");
        System.out.println("String arraylist is: "+ slist);
        
        //void clear using in integer array list
//        alist.clear();
//        System.out.println("Integer arraylist is:" + alist);
//        System.out.println("printing size is:" + alist.size());
        
        
        //using object clone
        ArrayList<String> cloneSlist = (ArrayList<String>) slist.clone();
        System.out.println("clone list of string slist:" + cloneSlist);
        
        //checking bollean contains elemetn
        boolean flag1 = alist.contains(5);
        if(flag1 == true){
            System.out.println("It contains element");
        }else{
            System.out.println("It doesnot contains element");
        }
    }
    
}
