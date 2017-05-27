/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WorkingWithuRL;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author root
 */
public class ParsingURL {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://example.com:80/docs/book/tutorials"
                    + "/index.html?name=networking#DOWNLOADING");
        System.out.println("protocol = " + url.getProtocol());
        System.out.println("getAuthority = " + url.getAuthority());
        System.out.println("getHOst = " + url.getHost());
        System.out.println("getPort = " + url.getPort());
        System.out.println("getPath = " + url.getPath());
        System.out.println("getQuery = " + url.getQuery());
        System.out.println("getFile = " + url.getFile());
        System.out.println("geRef = " + url.getRef());
                
    }
    
}
