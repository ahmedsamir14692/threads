
package threads;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Threads {

    
    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Threads.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        thread_1  thread_0 = new thread_1();
        thread_0.start();
//         for(int i = 0 ;i<100; i++)
//        System.out.println("*");
        thread_1_1 s = new thread_1_1();
        Thread thread_1_1 = new Thread(s);// object of an class implemets Runnable interface
        thread_1_1.start();
        Thread thread_1_2 = new Thread(new Runnable(){
            @Override
            public void run() {
                 for(int i = 0 ;i<100; i++)
        System.out.println("@@@");
            }
            
        });
        thread_1_2.setDaemon(true);
        thread_1_2.start();
//        thread_1_2.
System.out.println(Thread.currentThread().getPriority());
  
       try{ 
        thread_0.join();
        thread_1_1.join();}
       catch( Exception  e)
       {
          e.printStackTrace();
       }
        
//        while(true )
//        { if(!thread_0.isAlive() && !thread_1_1.isAlive())
//        { thread_1_2.start();
//        break;}
//        }
        
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("ahmed");
       // Thread.currentThread().start(); IllegalThreadStateException

        
    }
    
}
