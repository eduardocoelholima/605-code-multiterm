package exam3_2251;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {

        Supplier<List<Integer>> supplier = LinkedList::new; //1
        System.out.println(supplier.get());
        Function<Integer, String> function =x -> Integer.toBinaryString(x); //2
        System.out.println(function.apply(1));

    }
}


// 1. Rewrite the statement in //1 using a lambda expression

// supplier = () -> new LinkedList();

// 2. Rewrite the statement in //2 using an anonymous class

// function = new Function<Int,Str>() {
//     Str apply (Int x) { return Integer.toBinaryString(x); }
// }