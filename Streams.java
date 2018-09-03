package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        //numbers.stream().forEach(x-> System.out.println(x));
//        List<Integer>list=numbers.stream()
//                .filter(x->x%2==0)
//                .peek(x-> System.out.println(x+ " "))
//                .map(x->x*2)
//                .peek(x-> System.out.println(x +" "))
//                .collect(Collectors.toList());
//
//
//    }

// lista z liczbami tylko wiekszymi niz 10
        // pomnoz wszystkie razy 10
        //znajdz najmniejsza
//        System.out.println( numbers.stream()
//                .filter(x -> x > 10)
//                .mapToInt(x -> x * 10)
//                .min().getAsInt());

        List<String> names =Arrays.asList("Michal","Jan","Adam","Konrad","isfjiosdjf","sdjisfjo");
        //iminona>5
        //uppercase
        //dokleic do kazdego imiona @
        //ograniczyc do 2 osob
        //i wyswietlic
        names.stream()
                .filter(x->x.length()>5)
                .map(x->x.toUpperCase())
                .map(x->x+"@")
                .limit(2)
                .forEach(x-> System.out.println(x));





    }
}