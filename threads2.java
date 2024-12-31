

// threads : 
/*
using threads with runnable interface
 * 
 */

 class Hi implements Runnable{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Hi - " + i);
            
        }
    }
}

class Hello implements Runnable{
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println("Hello - " + i);
            
        }
    }
}




public class threads2 {
    public static void main(String[] args) {
        // Runnable obj1 = new Hi();
        // Runnable obj2 = new Hello();



        
        Runnable obj1 = new Runnable(){
            public void run(){
                for(int i=0; i<10; i++){
                    System.out.println("Hii - " + i);
                }
            }
        };
        // using lamda expression to implement runnable interface
        Runnable obj2 = ()->{
                for(int i=0; i<10; i++){
                    System.out.println("Hello - " + i);
                }
            };
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}



// Thread States:
/*
 * New: new thread is created
 * Runnable: when start method is invoked
 * Running : when thread is running on cpu run method
 * Waiting : when thread is waiting for its turn to execute on cpu sleep method or wait method
 * Dead : thread accomplished its task stop method
 * 
 * new -> runnable -> running -> waiting -> runnable -> running -> dead
 */