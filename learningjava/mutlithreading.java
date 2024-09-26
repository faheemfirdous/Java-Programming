// threads or multithreading
/* performing multiple operations at a time is called multi threading or multi tasking
 * by multi threading we assign different different taskes to our multi core machine
 * by default in java we have a 1 main thread running in multi threading we make a main
 * thread and call other threads from that and run them parallely
 * we have to achieve multi threading either by extends Threads 
 * or by implements Runnable both do the same job but Runnable is an interface and 
 * is just with normal single inheritance 
 */

public class mutlithreading  {
    
    // syntax to use thread is we have to extend our class with threads
    // which is a super class in java
    public class MyThread extends Thread {
        int[] values = {2,4,6567,78,76,6565,5656};
    
        @Override
        public void run() {
            for (int i = 0; i < values.length; i++) {
                values[i] = values[i] * 2;
                System.out.println(values[i]);
            }
        }
    }

    public class MyThreadd implements Runnable {
        double valuee[] = {3242,3,43,34,3,43,343};

        @Override
        public void run(){
            for (int i = 0; i < valuee.length; i++) {
                valuee[i] = Math.pow(valuee[i], 2);
                System.out.println(valuee[i]);
            }
        }
    }

    public static void main(String[] args) {
        mutlithreading mt1 = new mutlithreading();

        MyThread t1 = mt1.new MyThread();
        t1.run();
        
        MyThreadd t2 = mt1.new MyThreadd();
        t2.run();
    }
}
