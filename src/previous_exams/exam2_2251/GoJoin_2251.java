package exam2_2251;

import java.util.LinkedList;

public class GoJoin_2251 extends Thread {
        static Integer staticAccumulator = 0;
        Integer instanceAccumulator = 0;

        GoJoin_2251(int accumulator) { instanceAccumulator = accumulator; }

        public void inc() {
            instanceAccumulator++;
            staticAccumulator++;
        }

        public void run () {
            synchronized (instanceAccumulator) { for (int i = 0; i < 3; i++) inc(); }
        }

        public static void main (String[] args) {
            LinkedList<exam2_2251.GoJoin_2261> list = new LinkedList<>();
            Integer lock = 0;
            for (int i=0; i<2; i++) {
                list.add(new exam2_2251.GoJoin_2261(lock));
                list.peekLast().start();
            }
            for (exam2_2251.GoJoin_2261 t:list) System.out.println(t.instanceAccumulator);
        }
    }

// Answer the questions.

//1. Is this program subject to a racing condition? Explain which variable(s) is/are subject to the racing condition.

// no. both variables are protected by the synchronized block.

//2. What are the possible output of this program?

// 00 11 22 33

