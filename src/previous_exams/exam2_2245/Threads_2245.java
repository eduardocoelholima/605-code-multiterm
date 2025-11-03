package exam2_2245;

public class Threads_2245 extends Thread {
    static Object lock;
    int id;

    public Threads_2245(Object lock, int id) { this.lock = lock; this.id = id; }

    public void run () {
        synchronized (lock) {
            System.out.println(id);
            System.out.println(id);
            try{ if (id == 1) sleep(1); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        Object lock = new Object();
        (new Threads_2245(new Object(), 1)).start();
        (new Threads_2245(new Object(), 2)).run();
    }
}

// Answer the questions.

// 1. What outputs are possible when the two involved threads are synchronized
// using the same object?

// Yes, it is possible. t1 runs after t2 constructor finishes.

// 2. List all possible outputs this program can give.

// All variations are possible (6)
