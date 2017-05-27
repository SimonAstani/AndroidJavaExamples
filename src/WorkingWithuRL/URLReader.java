/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithuRL;

import JavaExamples.BufferReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author root
 */
public class URLReader {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://github.com/SimonAstani?tab=followers");
        URLConnection urlconnection = url.openConnection();
        
        BufferedReader in;
        in = new BufferedReader(
                new InputStreamReader(urlconnection.getInputStream()));
        
        String inputline;
        
        while((inputline = in.readLine()) != null){
            System.out.println(inputline);
            in.close();
                    
        }
        
    }
    
}
