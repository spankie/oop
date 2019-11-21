package app;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

import coll.MyClass;

// import java.util.Arrays;
// import java.util.List;



public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("The stream after applying "
        //                    + "the function is : "); 
  
        // // Creating a list of Integers 
        // List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 

        // // Using Stream map(Function mapper) and
        // // displaying the corresponding new stream 
        // list.stream().map(number -> number * 3).forEach(System.out::println); 

        // Lecturer l = new Lecturer("spankie", "male", "Nigerian", "2018-04-18", "Mr.", 123, 20000, 3);
        // System.out.println(l.getName());
        // System.out.println(l.getNationality());
        // System.out.println(l.details());
        // System.out.println(l.Salary());
        // try {
        //     l.setDob("dob");
        // } catch(ParseException e) {
        //     System.out.println("Error setting dob: " + e.toString());
        // }

        ArrayList<MyClass> list = new ArrayList<MyClass>();
        MyClass c1 = new MyClass("v1", "abc");
        MyClass c2 = new MyClass("v2", "abc");
        list.add(c1);
        list.add(c2);
        list.forEach(m -> System.out.println(m));
        System.out.println("--------------------");

        System.out.println(list);
        list.remove(c2);
        System.out.println(list);
        MyClass c3 = new MyClass("v3", "xyz");
        MyClass c4 = new MyClass("v4", "qrs");
        // list.addAll(c3, c4);
        list.add(c3);
        list.add(c4);
        list.forEach(m -> System.out.println(m));
        list.removeIf(m -> m.getLabel() == "xyz");
        list.forEach(m -> System.out.println(m));
        System.out.println("--------------------");
        // Object[] a = list.toArray();
        for (MyClass i : list) {
            System.out.println(i);
        }
        // Object[] aa = list.toArray();
        // MyClass[] a1 = list.toArray(new MyClass[0]);
        // MyClass p = a1[0];
        System.out.println(list.contains(c4));
        // used forEach
        Consumer<MyClass> c = new Consumer<MyClass>() {
            public void accept(MyClass mc) {
                System.out.println(mc.getLabel());
            }
        };

        list.forEach(c);

        System.out.println("-------------------------");
        Map<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Dee");
        hm.put(2, "Paw");
        hm.put(3, "How");
        hm.forEach((k, m) -> System.out.println(k + " : " + m));
        // Set<Integer> shm = hm.entrySet();
        // shm.headMap();
        System.out.println("-------------------------");
        // comparable and comparator
        // comarable => compareTo
        // comparator => compare
        TreeSet<MyClass> cc = new TreeSet<>(); // uses the comparable interface to comapare (compareTo)
        MyClass mc = new MyClass("v7", "dfg");
        cc.add(mc);
        cc.add(new MyClass("v7", "dfg"));
        cc.forEach(m -> System.out.println(m.getLabel()));
        System.out.println("-------------------------");
        TreeSet<MyClass> ccc = new TreeSet<>(new MyComaparator()); // uses the comparable interface to comapare (compareTo)
        ccc.add(new MyClass("v89", "hut"));
        ccc.add(new MyClass("v83", "hji"));
        ccc.add(new MyClass("v90", "him"));
        ccc.forEach(m -> System.out.println(m.getLabel()));
    }
}