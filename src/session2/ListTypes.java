package session2;

import java.util.*;

public class ListTypes {

    public static void main(String[] args) {

        // List is the interface  which is implemented by classes: ArrayList, LinkedList, Vector, Stack
        //List  allows dublicate elements
        //List preserves insertion order

        System.out.println("-----------------1-----------------");

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(24);
        list.add(25);
        list.add(140);
        list.add(13);
        list.add(24);
        list.add(29);
        list.add(170);
        System.out.println(list);

        System.out.println("--------------2-----------------");

        List<Integer> list1 = new LinkedList<>();

        list1.add(12);
        list1.add(24);
        list1.add(25);
        list1.add(140);
        list1.add(13);
        list1.add(24);
        list1.add(29);
        list1.add(170);
        System.out.println(list1.get(3));

        System.out.println("-----------------3-----------------");

        List<Integer> vec = new Vector<>();
        vec.add(1);
        vec.add(2);
        vec.add(3);
        vec.add(4);
        vec.add(5);
        vec.add(6);
        vec.add(7);
        vec.add(8);
        vec.add(9);
        vec.add(10);
        System.out.println(vec);

        System.out.println("-------------------4----------------");

        Stack<String > books = new Stack<>();
        books.push("Titanic");
        books.push("Harry Potter");
        books.push("Lisa Mona");
        books.push("Every day love");

        String topElement = books.peek();

        books.pop();
        System.out.println(topElement);
        System.out.println(books.size());



    }
}
