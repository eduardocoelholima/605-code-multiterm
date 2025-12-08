package exam3_2245;

import java.lang.Thread;
import java.util.*;

class Drop {
    private List<String> messages = new ArrayList<>();
    final static private Integer MAX = 3;
    Object consumerLock = new Object();
    Object producerLock = new Object();

    public String take() {
        synchronized (consumerLock) {
            while (messages.size() == 0) { try { consumerLock.wait(); } catch (InterruptedException e) {} }
            consumerLock.notifyAll();
            return messages.remove(messages.size() - 1);
        }
    }

    public void put(String message) {
        synchronized (producerLock) {
            while (messages.size() == MAX) { try { producerLock.wait(); } catch (InterruptedException e) {} }
            messages.add(message);
            producerLock.notifyAll();
        }
    }
}

public class DropTest {
    public static String p(String s) { System.err.println(s); return s;}

    public static void main(String[] args) {
        Drop drop = new Drop();
        Set<Runnable> runnables = new HashSet<>();
        Random seed = new Random();

        for (int i=0; i<3; i++) {
            Runnable consumer = () -> { while(true) drop.take(); };
            runnables.add(consumer);
            Runnable producer = () -> { while(true) drop.put(String.valueOf(seed.nextInt(2))); };
            runnables.add(producer);
        };

        for (Runnable r:runnables) (new Thread(r)).start();

    }
}

//This program compiles as is.


// 1. Is this program subject to a racing condition? Explain.

// yes

//2. How many messages can a Drop instance store?

// 3.
