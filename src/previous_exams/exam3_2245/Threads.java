package exam3_2245;

public class Threads extends Thread {
    static Object lock = new Object();
    int id;

    public Threads(Object lock, int id) { this.lock = lock; this.id = id; }

    public void run () {
        synchronized (lock) {
            System.out.println(id);
            lock.notify();
            System.out.println(id);
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        (new Threads(lock, 1)).run();
        (new Threads(lock, 2)).run(); //1
    }
}

// Answer the questions.

// 1 - What change in possible executable paths will happen if you replace
// line marked with //1 with 'start()' instead of 'run()'?

// nothing

// 2 - Explain waht an illegal monitor exception is. Is this exception possible in this program?

// no
