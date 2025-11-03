package exam2_2245;

import java.io.*;

class Dummy implements Serializable {}

public class Serialization_2245 implements Serializable {
    transient Integer value;
    transient Dummy dummy = new Dummy();

    Serialization_2245 read() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("object.save"));) {
            Serialization_2245 o = (Serialization_2245) in.readObject();
        } catch (Exception e) { }
        return this;
    }

    Serialization_2245 write() {
        Serialization_2245 o = new Serialization_2245();
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("object.save"));) {
            out.writeObject(o);
            setValue(this, 1);
        } catch (Exception e) { }
        return o;
    }

    @Override
    public String toString() { return ""+value; }

    public static void setValue(Serialization_2245 o, Integer v) {
        o.value = v;
    }

    public static void main (String args[] ){ System.out.println(new Serialization_2245().write().read()); }
}

// 1. What is the output of this program?

// null

// 2. If the field "dummy" is no longer transient, what will happen?

// Nothing, the class is serializable
