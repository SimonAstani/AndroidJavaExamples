/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author simon
 */
public class ListInterfaceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.create object that store values of string type
        List<String> arraylist = new ArrayList<String>();
        List<String> linkedlist = new LinkedList<String>();
        List<String> vectorObject = new Vector<String>();
        
        //2.Add values ==used add method to store value is datastructure
        arraylist.add("this");
        arraylist.add("is a");
        arraylist.add("arraylist");
        
        linkedlist.add("This");
        linkedlist.add("is a");
        linkedlist.add("linkedlist");
        
        vectorObject.add("This");
        vectorObject.add("is a");
        vectorObject.add("vectorlist");
        
        //3.Display a value of those object
        System.out.println("arraylist:"+arraylist);
        System.out.println("linkedlist:"+linkedlist);
        System.out.println("vectorlist :"+vectorObject);
        
    }
    
}
//listtle theory
/*points to be remember about list
1.It is dynamic in nature. It is useable when we dont the capacity of datastructure.
2.Arraylist is preferred when getting and setting elemets is required
3. linked list is prefered when modification is required
4.Vector is legacy class. that it is introduced before Jdk 1.2

List Methods:

1. void add(int index, Object obj)

This method adds specified element at the specified index, moving the entire elements one step up, avoiding any type of overlapping of element.

2. boolean addAll(int index, Collection c)

This method adds all  elements of Collection c after the specified index, moving the entire elements up, avoiding any type of overlapping, This method returns true if the operation is successful or else false.

3. Object get(int index)

This method retrieves element at the specified index.

4. int indexOf(Object obj)

This method retrieves the first occurrence of the given element in the List or it will return -1 if there is no such elements.

5. int lastIndexOf(Object obj)

This method retrieves the last occurrence of the given element in the List or it will return -1 if there is no such elements.

6. ListIterator listIterator( )

This method gives object of ListIterator from the index 0 of the list, to traverse all the elements from the start.

7. ListIterator listIterator(int index)

This method gives object of ListIterator starting from the specified index of the list to traverse all the elements from the start of that index.

8. Object remove(int index)

This method removes an element from the list at specified index, In addition to removing this method also returns removed element. After deleting that element indexes of subsequent elements in the list are decreased by 1.

9. Object set(int index, Object obj)

This method sets the element at the specified index, if there is already any element present than that element is replaced by the new one.

10. List subList(int start, int end)

This method returns the sub-list from the index “start” to index “end”.

 
*/