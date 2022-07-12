package session3;
import java.util.*;

public class SEtDemo {

    public static void main(String[] args) {

       Set<String> names = new HashSet<>();
       names.add("Mike");
        names.add("Anna");
        names.add("Kate");
        names.add("Nate");
        names.add("Tom");
        System.out.println(names);

        Iterator<String> iterator = names.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Set<String> students = new LinkedHashSet<>();
        students.add("Lena");
        students.add("Leka");
        students.add("Luka");
        students.add("Abaa");
        students.add("Kuku");
        System.out.println(students);
       Iterator<String> iterator1 = students.iterator();

       while(iterator1.hasNext()){
           String name = iterator.next();
           if(name.equalsIgnoreCase("Kuku")){
               System.out.println(name);
           }
       }
       Set<String> books = new TreeSet<>();
       books.add("Harry Potter");
        books.add("London fog");
        books.add("IronMan");
        books.add("Titanic");
        books.add("HDeath");
        System.out.println(books);









    }
}
