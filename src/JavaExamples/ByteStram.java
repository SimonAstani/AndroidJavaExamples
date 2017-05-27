/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExamples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author root The byte stream contains to most frequently classed
 * FileInputStream and FileOutputStram
 */
public class ByteStram {

    public static void main(String[] args) throws FileNotFoundException, IOException {
             FileInputStream FI = null;
            FileOutputStream FO = null;

        try {
           
            FI = new FileInputStream("/root/Desktop/input");
            FO = new FileOutputStream("/root/Desktop/outputyeta.txt");

            int c;
            while ((c = FI.read()) != -1) {
                FO.write(c);
            }

        } finally {
            if(FI != null){
                FI.close();
               
           }if(FO != null){
               FO.close();
           }
           

        }
    }

}
