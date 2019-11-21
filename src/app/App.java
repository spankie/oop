package app;

import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("The stream after applying "
                           + "the function is : "); 
  
        // Creating a list of Integers 
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15); 

        // Using Stream map(Function mapper) and
        // displaying the corresponding new stream 
        list.stream().map(number -> number * 3).forEach(System.out::println); 

        Lecturer l = new Lecturer("spankie", "male", "Nigerian", "2018-04-18", "Mr.", 123, 20000, 3);
        System.out.println(l.getName());
        System.out.println(l.getNationality());
        System.out.println(l.details());
        System.out.println(l.Salary());
    }
}