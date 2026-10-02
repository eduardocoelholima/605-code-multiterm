package exam1_2251; //5

public class Cast extends CastParent {

    private int value = -100;
    private Cast(int value) { this.value = value; }
    public String toString() { return String.valueOf(value); }

    public static void main(String[] args) {
        CastParent a = new Cast(10);
        Cast b = (Cast) a;
        CastParent c = b;
        System.out.println(a.value + " " + b.value + " " + c.value);
    }
}

class CastParent {
    protected int value = 100;
    public CastParent() { this.value = 0; } //MARKED1
    public String toString() { return String.valueOf(value); }
}

// Answer the following.

// 1. What is the output of this program?
//
// 0 10 0

// 2. If keyword "public" is removed from line with //MARKED1, what would happen?
//
// default access modifier, nothing changes in the execution, all ww
