package exam2_2251;

public class Threads_2251 extends Thread {
    static Object lock = new Object();
    int id;

    public Threads_2251(int id) { this.id = id; }

    public void run () {
        synchronized (lock) {
            System.out.print(id);
            System.out.print(id);
            try{ if (id == 1) sleep(1); } catch (InterruptedException e) {}
        }
    }

    public static void main(String[] args) {
        (new Threads_2251(1)).run();
        (new Threads_2251(2)).start();
        (new Threads_2251(3)).run();
    }
}

// Answer the questions.

// 1. What outputs are possible when running this program?

// 112233 113322

// 2. Explain a modification to this program that would allow the following output to happen: 112332.

// make the lock instance variable
// then all variations are possible (6)
