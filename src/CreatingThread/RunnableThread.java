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
 * Creating a thread using a Runable interface
 */
class RunnableThread implements Runnable {

    private Thread t;
    private String threadName;

    public RunnableThread(String name) {
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + "," + i);
                //let thread sleep for while
                Thread.sleep(50);
            }
        } catch (InterruptedException ex) {
            System.out.println("Thread" + threadName + "interrupted:");
        }
        System.out.println("Thread"  + threadName + "existiing.");
    }
    
    public void start(){
        System.out.println("starting" + threadName);
        if(t == null )
        {
            t = new Thread(this, threadName);
            t.start();
        }
    }

}

 class TestThread {
    public static void main(String[] args) {
        RunnableThread R1 = new RunnableThread("Thread-1");
        R1.start();
        
        RunnableThread R2 = new RunnableThread("Thread-2");
        R1.start();
        
    }
 }
