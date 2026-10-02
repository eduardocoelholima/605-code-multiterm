package exam1_2251;

interface I0 {}
interface I1 extends I0 { default I1 rest1() { return null; }; }
interface I2 extends I0 { default I2 rest2() { return null; }; }
abstract class C1 implements I1 {}
abstract class C2 extends C1 implements I2 {}
class C3 extends C2 {
    static int shared;
    int id;
    String name;
    public String toString() { return name; }
}

public class Minion {
    public static void main(String[] args) {
        I0[] minions = new C3[3];
        minions[0] = (new C3()).rest1();
        minions[1] = (new C3()).rest1();
        for (I0 minion:minions) System.out.println(minion);
    }
}

// Answer the following questions

// 1. What is the output of this program

// null x3

// 2. What happens if I1 and I2 were not subinterfaces of I0? Give a detailed explaination.

// not compile, array location assignments would fail in main()
