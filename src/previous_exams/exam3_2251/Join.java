package exam3_2251;

import java.util.ArrayList;

public class Join extends Thread {
        static int accumulator;
        static ArrayList<Join> list = new ArrayList<>();

        public Join() { list.add(this); }
        public void run () { for (int i=0; i<1000; i++) accumulator++; }

        public static void main (String[] args) {
            for (int i=0; i<1000; i++) new Join().start();
            try { for (Join t: Join.list) t.join(); } catch (Exception e) {}
            System.out.println(Join.accumulator);
        }
    }

// Answer the questions.

//1 - This program can have different outputs. Explain why.

// accumulator is not "protected" and will be accessed by all threads without contention
// leading to racing conditions

//2 - How would you fix the program to always present the same output?

// use a synchronized block/method anytime the shared variable is accessed