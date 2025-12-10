package exam3_2251;

import java.util.*;

public class Faster {

	public static void main(String[] args) {
        Random rand = new Random();
		ArrayList<Integer> alist = new ArrayList<>();
		LinkedList<Integer> llist = new LinkedList<>();
        for(int i = 0; i < 1000; i++) {
            alist.add(rand.nextInt() % 1000);
            llist.add(rand.nextInt() % 1000);
        }

        alist.get(Math.abs(rand.nextInt() % 1000)); // 1
        llist.get(Math.abs(rand.nextInt() % 1000)); // 2

        HashMap<Integer, Integer> hm = new HashMap<>();
        TreeMap<Integer, Integer> tm = new TreeMap<>();

        for (Integer i: alist) { tm.put(i,i);}; //3
        for (Integer i: alist) { hm.put(i,i);}; //4
    }
}


// 1. Explain why //1 is expected to run faster than //2?

// to get the i-th element in an arraylist is O(1) while it is O(n) for a linked list

// 2. When adding an element to a TreeMap, time complexity is O(log n) (//3), while the
// same operation is O(1) (//4) in a HashMap. Why would one choose to use a TreeMap then?

// trees maintain a natural order so the elements can be iterated following this order.

