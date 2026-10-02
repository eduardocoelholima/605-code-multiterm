package exam1_2251; //1

public class Args {
    public static int value;
    Args() { this(1); }
    public Args(int value) { this.value = value; } //MARKED1
    Args init(int value ) { return new Args(value); }
    public String toString() { return String.valueOf(value); }
}

class ArgsTest {
    public static void main(String[] args) {
        Args a = new Args();
        System.out.println(a);
        Args b = new Args();
        System.out.println(b);
        Args c = b.init(10);
        System.out.println(c);
        Args d = new Args();
        System.out.println(d);
    }
}

// 1. What is the output of this program?

// 1 1 10 1

// 2. What happens if you change the access modifier in line //MARKED1 to "private"?

// nothing


