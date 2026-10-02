package exam1_2251;

interface Changeable {
    Memory change(Memory o);
}

class MemoryParent {
    static int o;
    MemoryParent() { }
    MemoryParent(int o) { this.o = o; }
}

public class Memory extends MemoryParent implements Changeable {
    Memory() { o = 10; }
    Memory(int o) {
        super(o);
    }
    Memory(Memory o) {
        o.o = this.o;
    }

    public Memory change(Memory o) { this.o = o.o; return o; }
    public String toString() {
        return String.valueOf(o);
    }
    public static void main(String[] args) {
        Memory m1 = new Memory();
        System.out.println(m1);
        Memory m2 = new Memory(20);
        System.out.println(m2);
        Changeable o = new Memory(m2);
        System.out.println(o);
        o.change(m1);
//        System.out.println(o.change(o)); //MARKED1
    }
}


// Answer the following.

// 1. Write the Changeable interface so the provided program compile without errors.



// 2. The line marked with //MARKED1 will cause a compile time error if uncommented.
// Explain why and provide a fix for the problem.

// Required: Memory, provided Changeable
// Cast as Memory


