package Java_Bootcamp.OOPS;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,2,1,1, 0, 9, 2);

        // filter()
        System.out.println("Filtering the values");
        arr.stream()
           .filter(x -> x % 2 == 0)
           .forEach(System.out::println);
            
        // sorted()
        System.out.println("\nSorting the values");
        arr.stream()
           .sorted()
           .forEach(System.out::println);

        // Descending order
        System.out.println("\nArray in Descending order");
        arr.stream()
           .sorted(Comparator.reverseOrder())
           .forEach(System.out :: println);


        // map()
        System.out.println("\nMapping the values");
        arr.stream()
           .map(x -> x * x)
           .forEach(System.out::println);

        // collect
        System.out.println("\nCollect into a new List");
        List<Integer> evens = arr.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(evens);

        // reduce()
        int sum = arr.stream()
                     .reduce(0, (a, b) -> a + b);
        System.out.println("\nSum of Numbers: " + sum);

        // limit()
        System.out.println("\nFirst 3 Even numbers");
        arr.stream()
           .filter(x -> x % 2 == 0)
           .limit(3)
           .forEach(System.out :: println);
 
       // distinct()
       System.out.println("\nRemove Duplicates");
       arr.stream()
          .distinct()
          .forEach(System.out :: println);

      // count()
      List<String> names = Arrays.asList("Santu", "Sanju", "Swift");
      long count = names.stream() 
                        .filter(x -> x.startsWith("S"))
                        .count();
      System.out.println("\ncount names start with 'S': " + count);      

      //Convert List of Strings to Uppercase
      System.out.println("\nUppercase Strings:");
      List<String> list = Arrays.asList("java", "stream", "api");
      list.stream()
          .map(String::toUpperCase)
          .forEach(System.out::println);
    }
}




