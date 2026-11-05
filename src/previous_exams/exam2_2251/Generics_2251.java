package exam2_2251;

abstract class Parent_2251<T> {
    T aT;
}

interface Interface_2251 {
    default String go() {return "3";}
}

public class Generics_2251<T> extends Parent_2251<T> implements Interface_2251 {
    public void set(T aT) { this.aT = aT; }
    public String toString() { return go(); }

    public static void main(String args[])	{
        Parent_2251 a = new Generics_2251();
        Generics_2251 b = (Generics_2251) a;
        Interface_2251 c = (Generics_2251) a;
        System.out.println(c);
    }
}


// Answer the following.

// 1. Write the code for the parent class for this code to compile. The parent class is not allowed to have any concrete methods.

// 2.  Assuming the output of this program should be "3", write the code for the Interface for this program to compile.

