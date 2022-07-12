package session1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIteration {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Mary");
        names.add("Gary");
        names.add("Lary");
        names.add("Bary");
        names.add("Zary");
        names.add("Hary");
        names.add("Pary");

        System.out.println(names.size());

        Iterator<String> iterator  = names.iterator();

        //as long as iterator has next element:
        while( iterator.hasNext()){
            String each = iterator.next();
            System.out.println(each);

            //given a set of integers, print the odd elements
            Set<Integer> nums = new HashSet<>();
            nums.add(12);
            nums.add(13);
            nums.add(16);
            nums.add(18);
            nums.add(19);
            nums.addAll(Set.of(6,23,98));
            Iterator<Integer> allNumbers = nums.iterator();

            while(allNumbers.hasNext()){
                int n =  allNumbers.next();
                if(n % 2!=0){
                    System.out.println(n);
                }
            }

        }






    }
}
