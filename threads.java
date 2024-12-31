
// threads : 
/* there might be multiple processes running in a software Simultaneously and to this we will be using threads for such processes.
 we can run light weight process on multiple threads
multiple threads can share resources
we can run multiple threads at the same time
In every thread you need to have run method
 * we can suggest the scheduler the priority of the threads. the range of priority goes form 1 to 10 where 1 is the lowest priority and 10 is highest priority
 */

class Hi extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("Hi - " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Hello extends Thread{
    public void run(){
        for(int i = 0; i<100; i++){
            System.out.println("Hello - " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class threads {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        System.out.println(obj1.getPriority() + "---------------" + obj2.getPriority());

        // obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
    }
}
