package JAVA8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // imparative approach
        int array [] = {1,2,3,4,5,6};
        int sum = 0;
        for(int i = 0; i < array.length;i++){
           if(array[i] % 2 == 0){
               sum+=array[i];
           }
        }
        System.out.println(sum);

        List<String> list = Arrays.asList("banana", "mango", "kiwi");
        Stream<String> stringStream = list.stream();


        // how to initialize stream
        Stream<Integer> stream = Stream.iterate(0,n->n+1).limit(100);
        System.out.println(stream);

       //methods
       List <Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> filteredNumber = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(filteredNumber);

       List<Integer> updatedfilterList =  filteredNumber.stream().map(x -> x/2).collect(Collectors.toList());
        System.out.println(updatedfilterList);

        List<Integer> combined_list = numbers.stream().filter(x -> x%2 == 0)
                        .map(x->x/2).sorted((x,y)-> y-x)
                .skip(1)
                .peek(x -> System.out.println(x))
                .collect(Collectors.toList());
        System.out.println(combined_list);


        List<Integer> rollNumber = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        rollNumber.parallelStream().collect(Collectors.toList());
        System.out.println(rollNumber);

List<Integer> operationStream = Stream.iterate(0,n -> n+1)
        .limit(10)
        .filter(x-> x/2 == 0)
        .map(x->x/2)
        .sorted((x,y)->y-x)
        .skip(1)
        .peek(System.out::println)
        .max((x,y)->y-x).stream().collect(Collectors.toList());
        System.out.println(operationStream);
    }
}
