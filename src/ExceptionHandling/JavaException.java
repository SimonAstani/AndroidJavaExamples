/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author root
 * 
 * There are two types of exception checked and uncheked exception.
 * Checked exception are complied time exception
 * 
 */

public class JavaException {
    
    public static void main(String[] args) {
        File file = new File ("E:file.txt");
        FileReader fr = new FileReader(file);
        
    }
    
}
    