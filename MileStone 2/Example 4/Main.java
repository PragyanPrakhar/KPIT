class Operation extends Thread {
    public void run() {
        System.out.println("Thread Called::");
    }
}

class Action implements Runnable {
    @Override
    public void run() {
        System.out.println("This is a thread::");
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Operation o = new Operation();
        o.start();// Schedule the thread with the Os.
        o.run(); // Expecting the run method of the operation class to be called.

        Action a = new Action();// make object
        Thread t = new Thread(a);// Create thread object by passing action object as a parameter.
        t.start();
        t.run();

        // Creating thread using lambda expression, Quick ,eaasy, no extra class needed.
        // It is not possible to write the function logic in the lambda expreTherefore
        // we can create Runnable logic like shown below.
        Runnable logic = () -> {
            System.out.println("Lambda thread Is running inside the runnable logic");
        };
        Thread t3 = new Thread(() -> {
            System.out.println("Lambda thread");
        });

        Thread t4 = new Thread(logic);
        t4.start();
        t4.run();
        t3.start();
        // We can skip the start method and directly call the run method.

        // Let's say we have one million cars from a manufacturer [in use around the
        // world]

        // updates software on 1 million car's infotainment system.

        // connect and transfer and update file to the car{Repeat this for one million
        // cars}

        // cloud -------------> (file) car receives the file system

        // 1 million threads ----> each threas sending update to one car at a time.
        // 1 million times faster output.

        // With the concurrency we can divide the taks into the threads and run them
        // parallelly.
        // This will increase the speed of the task.

    }
}
