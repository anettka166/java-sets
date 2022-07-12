package session1;

import java.util.Iterator;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {


        Set<Integer> set = Set.of(1, 2, 3, 4);
        Iterator<Integer> iterator = set.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

    }
}