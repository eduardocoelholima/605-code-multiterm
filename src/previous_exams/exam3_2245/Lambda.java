package exam3_2245;

interface QuadFunction<R,A,B,C,D>{
    public R apply(A A, B b, C c, D d);
}

public class Lambda {
    public static void main(String[] args) {
        QuadFunction<String, Integer, Integer, Integer, Integer> function = new QuadFunction<>() {
            public String apply(Integer a, Integer b, Integer c, Integer d) { return Integer.toString(a+b+c+d); }
        };

        System.out.println("result = " + function.apply(1,2,1,2));
    }
}



// 1. Write an interface QuadFunction that would make the given code compile.

//interface QuadFunction<R,A,B,C,D>{
//    public R apply(A A, B b, C c, D d);
//}

// 2. Rewrite the declaration of variable 'function' using a lambda expression to achieve
// the same result of the provided code

// QuadFunction<String, Integer, Integer, Integer, Integer> function2 = (a, b, c, d) -> Integer.toString(a+b+c+d);
