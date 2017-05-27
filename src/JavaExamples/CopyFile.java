/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaExamples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author root
 */
public class CopyFile { 
    public static void main(String[] args) throws IOException{
    FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader("/root/Desktop/input");
         out = new FileWriter("/root/Desktop/output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
