package exam2_2251;

import java.io.*;

class Dummy {}

public class Serialization_2251 implements Serializable {
    static Integer value = 0;
    Dummy dummy = new Dummy();

    Serialization_2251 read() {
        Serialization_2251 o = new Serialization_2251();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.save"));) {
            o = (Serialization_2251) in.readObject();
        } catch (Exception e) {}
        return o;
    }

    Serialization_2251 write() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.save"));) {
            setValue(this, ++value);
            out.writeObject(this);
        } catch (Exception e) { }
        return this;
    }

    @Override
    public String toString() { return ""+value; }

    public static void setValue(Serialization_2251 o, Integer v) {
        o.value = v;
    }

    public static void main (String args[] ){ System.out.println(new Serialization_2251().write().read().write()); }
}

// 1. What is the output of this program?

// 2

// 2. How many times is the method setValue() called?

// 2
