package exam1_2251; //2


interface Yellable {
    public default String helper() { return "Helping"; }
}

abstract class Parent implements Yellable {
    Parent() { System.out.println("Parent"); }
    public String scream() { return "I CAN SCREAM."; } //MARKED1
}

public final class Daughter extends Parent {
    public String yell() { return "I CAN YELL"; }
    Daughter() { super(); System.out.println("Child"); }

    public static void main(String[] args) {
        Yellable d = new Daughter();
        Daughter p = (Daughter) d; //MARKED1
        System.out.println(p.yell());
        System.out.println(p.helper());
    }
}

// Answer the following questions.

// 1. What is the output of this program execution?

//Parent
//Child
//I CAN YELL
//Helping

// 2. Explain what happens if you remove the casting in the statement marked with //MARKED1.

// d is an interface type, so we dont have automatic downcasting.
// will not compile without the casting.
// Casting here is fine since it was created using the subtype
// (class that implements the interface)