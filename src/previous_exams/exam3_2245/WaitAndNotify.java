package exam3_2245;

public class WaitAndNotify extends Thread    {
    static int counter = 0;
    int id;
    public WaitAndNotify(int id)  { this.id = id; }
    public void run () {
        synchronized (this) {
            if (id == 0) {
                new WaitAndNotify(1).start();
                new WaitAndNotify(2).start();
            } else {
                System.err.println(id);
                try { if (id == 1) this.wait(); }
                catch (InterruptedException e) {}
                System.err.println(id);
            }
        }
    }

    public static void main (String[] args) { new WaitAndNotify(0).start(); }
}

// 1. What are ALL the possible outputs of running this program?

// 122...
// 212...
// 221...

// 2. Is it possible that a thread is indefinitely in the
// WAITING state in one of this program's runs? Explain.

// Yes. Thread with id==1 will always wait and never be notified.

