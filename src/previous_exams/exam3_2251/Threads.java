package exam3_2251;

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
        (new Threads(new Object(), 1)).start();
        (new Threads(lock, 2)).start();
    }
}

// Answer the questions.

// 1 - What are the possible outputs of this program?

// Sync: 1122,2211
// Non-Sync: 1122,1221,1212,
// Exception: 2211exception,2112exception,1212exception,2121exception

// 2 - Is this program properly synchronized? Explain why.

// The lock used by one thread might not match the lock of the other one
// so it will not be synchronized in those scenarios.