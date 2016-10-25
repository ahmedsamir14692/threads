
package threads;


public class thread_1_1 implements Runnable
{

    @Override
    public void run() {
         for(int i = 0 ;i<100; i++)
        System.out.println("#");
    }
    
}
