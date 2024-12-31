
// threads performing on the same data...

class Counter{
    int count;

    // to solve the problem of race condition we can use synchronized
    public synchronized void increment(){
        count++;
    }
}

public class raceCondition {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        Runnable obj1 = ()->{
            for(int i=0; i<10000; i++){
                c.increment();
            }
        };
        Runnable obj2 = ()->{
            for(int i=0; i<10000; i++){
                c.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
// prints unexpected values because thread t1 and t2 are busy working but the main thread is idle and prints the value of c.count
        System.out.println(c.count);

        // to solve this problem we can tell main thread to wait until t1 and t2 joins back
        t1.join();
        t2.join();

        // the output is still unexpected because here race condition occurs means sometimes t1 and t2 increments the value at the same time but only one increment occurs
        System.out.println(c.count);

        
        

    }
}
