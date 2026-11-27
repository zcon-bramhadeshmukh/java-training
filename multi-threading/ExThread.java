public class ExThread extends Thread {

    String name;

    public ExThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        //running state
        System.out.println("Thread " + name + " is running.");
        try {
            Thread.sleep(1000);//sleep/wait state
        } catch (InterruptedException e) {
            System.out.println("Thread " + name + " was interrupted.");
        }
        System.out.println("Thread " + name + " has finished.");//terminated
    }


    public static void main(String[] args) {
        ExThread thread1 = new ExThread("A");//created state
        ExThread thread2 = new ExThread("B");

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Thread 1 priority: " + thread1.getPriority());
        System.out.println("Thread 2 priority: " + thread2.getPriority());
        System.out.println("Thread 1 name: " + thread1.getName());
        System.out.println("Thread 2 name: " + thread2.getName());

        try {
            thread1.start();//runnable state/ready to run
            //join is used to wait for a invoking threa
            //here only after thread1 finishesh then only thread2 will continue
            thread1.join();
            thread2.start();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("thread was interrupted.");
        }

        System.out.println("finished.");
    }
}

/*
output:
Thread 1 priority: 10
Thread 2 priority: 1
Thread 1 name: Thread-0
Thread 2 name: Thread-1
Thread A is running.
Thread A has finished.
Thread B is running.
Thread B has finished.
finished.
 */