package exam3_2245;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class UsingLists {

	public static void main(String[] args) {
        Random rand = new Random();
		ArrayList<Integer> alist = new ArrayList<>();
		LinkedList<Integer> llist = new LinkedList<>();
        for(int i = 0; i < 1000; i++) {
            alist.add(rand.nextInt() % 1000);
            llist.add(rand.nextInt() % 1000);
        }

        alist.get(rand.nextInt() % 1000); //1
        llist.get(rand.nextInt() % 1000); //2

        alist.remove(0); // 3
        llist.remove(0);
    }
}


// 1. In this program, is llist always slower than alist, in lines //1 and //2?
// If not, give an example. If yes, explain.

// No. If lots of removal from start/end (or close) llist will perform better.

// 2. What is the time complexity of statement //3? Explain.

// O(n)
