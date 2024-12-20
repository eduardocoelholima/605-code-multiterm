// demonstrate the use of an unchecked cast
// in this case we can see the warning with the -Xlint javac option
// also notice that in practice during runtime T will become Object

package generics.generics2;

import java.lang.reflect.Array;

public class MyReflectArray<T> {
	T[] data = null;
	public MyReflectArray(int size ) {
		 data = (T[])new Object[size];
//		 data = new T[size];
//		data = (T[])getArray( new Object().getClass(), size );

	}
	public T get( int i ) {
		return data[i];
	}
	public void set( int i, T val ) {
		data[i] = val;
	}
	public <T> T[] getArray(Class<T> aClass, int size) {
		@SuppressWarnings("unchecked")
			T[] arr = (T[]) Array.newInstance(aClass, size);

	    return arr;
	}
	public <T> T[] getArray(int size) {
		@SuppressWarnings("unchecked")
			T[] arr = (T[]) Array.newInstance(new Object().getClass(), size);
	    return arr;
	}
	public static void main(String args[]) {
		MyReflectArray<String> aMyVector1 = new MyReflectArray<String>(11);
		aMyVector1.set(0, "a");
		System.out.println("aMyVector1.get(0): " + aMyVector1.get(0));

	}
}

/*
MyVector1.java:7: warning: [unchecked] unchecked cast
		data = (T[])getArray( new Object().getClass(), size );
		                    ^
  required: T[]
  found:    CAP#1[]
  where T is a type-variable:
    T extends Object declared in class MyVector1
  where CAP#1 is a fresh type-variable:
    CAP#1 extends Object from capture of ? extends Object
1 warning

*/
