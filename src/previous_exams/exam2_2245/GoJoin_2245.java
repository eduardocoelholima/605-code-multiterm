package exam2_2245;

import java.util.LinkedList;

public class GoJoin_2245 extends Thread {
        static int staticAccumulator;
        int instanceAccumulator;

        public synchronized void inc() { staticAccumulator++; instanceAccumulator++; }

        public void run () { for (int i=0; i<10; i++) inc(); }

        public static void main (String[] args) {
            LinkedList<GoJoin_2245> list = new LinkedList<>();
            for (int i=0; i<3; i++) {
                list.add(new GoJoin_2245());
                list.peekLast().start();
            }

            System.out.println(GoJoin_2245.staticAccumulator);
            for (GoJoin_2245 t:list) System.out.println(t.instanceAccumulator);
        }
    }

// Answer the questions.

//1. This program is subject to a racing condition.
// Explain what that is and how you could avoid it in this program.

// The static variable/instance method is not synchronized. Use a static synchronized method.

//2. Explain how you could use join() in this program and
// what purpose would it serve.

// You could add a join call from main thread to only print when the final result is ready.
