import javax.swing.*;
import java.security.KeyStore;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("A");
        list.get(0);
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        System.out.println(list);
        System.out.println(set);

        Map<String, String> pair = new HashMap<>();
        pair.put("Key1", "Ion");
        pair.put("Key2", "Ion");
        String s = pair.get("Key2");
        System.out.println(pair);

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person("Andrei"));

        for (Integer val: personMap.keySet()){
            System.out.println(personMap.get(val).getName());
        }

        for (Person person: personMap.values()){
            System.out.println(person.getName());
        }

        for (Map.Entry<Integer, Person> entry: personMap.entrySet()){
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}