package exam2_2251;

public class GoExceptions_2251 {
	public static void runAndThrows() throws RuntimeException {
		int[] intArray = {1,2};
        try {
            try {
                intArray[1] = 1;
                System.out.println("1");
                try {
                    intArray[0] = 2;
                    System.out.println("2");
                } catch (ArrayIndexOutOfBoundsException e) {
                    intArray[1] = 1;
                    System.out.println("3");
                }
            } catch (Exception e) {
                System.out.println("4");
            } finally {
                System.out.println(intArray[2]);
                intArray[1] = 1;
            }
        } finally {}
	}

	public static void main (String[] args) {
		try {
			exam2_2251.GoExceptions_2261.runAndThrows();}
		catch (ArrayIndexOutOfBoundsException e) { System.out.println("6"); } //1
		finally {}
    }
}

// 1. What will be the output of this program?

// 1 2 6

//2. Will an uncaught exception occur while running this program? Explain when if it occurs.

// No
