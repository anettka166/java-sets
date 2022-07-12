package session1;

import java.util.ArrayList;
import java.util.List;

public class List_loop {
    public static void main(String[] args) {

       List<String> names = new ArrayList<>();
       names.add("Harry");
       names.add("Larry");
       names.add(0, "Anna");
       names.addAll(List.of("Jerry", "Mary", "Tom"));

        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }
        for (int i = names.size()-1; i < names.size(); i--) {
            System.out.println(names.get(i));
        }




    }
}
