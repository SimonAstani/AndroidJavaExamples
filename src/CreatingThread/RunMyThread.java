/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreatingThread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author root
 */
 class RunnableThreadEx implements Runnable{
    public static int mycount = 0;

    public RunnableThreadEx() {
    }
    
    public void run() {
        while(RunnableThreadEx.mycount <= 10){
            try {
                System.out.println("Expl:thread" + (++RunnableThreadEx.mycount));
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Exception in thread" + ex.getMessage());
            }
        }
       
    }
 }
    
    public class RunMyThread{
        public static void main(String a[]) {
            
            System.out.println("Starting Main Thread");
            RunnableThreadEx  Rt = new RunnableThreadEx();
            Thread t = new Thread(Rt);
            t.start();
            while(RunnableThreadEx.mycount <= 10){
            try{
                System.out.println("Main Thread: "+(++RunnableThreadEx.mycount));
                Thread.sleep(100);
            } catch (InterruptedException ex){
                System.out.println("Exception in main thread: "+ex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
            
        }
    }
   
