package session1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(12);
        set.add(13);
        set.add(12);
        set.add(13);
        set.add(14);
        System.out.println(set);

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set.isEmpty());

        set.addAll(List.of(15, 18, 19, 21));

        System.out.println(set);


       boolean exists =  set.contains(14);
        System.out.println(exists);











    }
}
