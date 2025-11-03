package exam2_2245;

abstract class Parent_2245<T> {
    T aT;
    abstract public void go(T aT);
}

interface Interface_2245<T> {
    void go(T aT);
}

public class Generics_2245<T> extends Parent_2245<T> implements Interface_2245<T> {
    public void go(T aT)	{ System.out.print("child"); }
    public void set(T aT) { this.aT = aT; }
    public String toString() { return "daughter"; }

    public static void main(String args[])	{
        Parent_2245 a = new Generics_2245(); //1
        Generics_2245 b = (Generics_2245) a;
        Interface_2245 c = (Generics_2245) a;
        System.out.println(c);
    }
}


// Answer the following.

// 1. Is the statement in line //1 an example of raw types? Explain.

// Use of raw type skips type checking.

// 2. What will be the output of this program? Explain.

// daughter
