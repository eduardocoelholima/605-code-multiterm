package exam2_2245;

public class GoExceptions_2245 {
	public static void runAndThrows() throws RuntimeException {
		int[] intArray = {2};
        try {
            try {
                intArray[2] = 1;
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
                System.out.println(intArray[0]);
                intArray[1] = 1;
            }
        } finally {}
	}

	public static void main (String[] args) {
		try {
			GoExceptions_2245.runAndThrows();}
		catch (ArrayIndexOutOfBoundsException e) { System.out.println("6"); } //1
		finally {}
    }
}

// 1. What will be the output of this program?

// 4 2 6

//2. Would the program compile if the line marked as //1 is removed? Explain.

// Yes since its a RuntimeException.
// Running it would cause 4 2 stacktrace (uncaught exception)
