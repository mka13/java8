package cwiczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonApp {

    public static void main(String[] args) {
        Person person1=new Person("Andrzej","KOwalski",24);
        Person person2=new Person("Jan","Nowak",36);
        Person person3=new Person("Michal","Kaczkowski",29);
        Person person4=new Person("Maciej","KOwal",50);
        Person person5=new Person("Janusz","Kowalczyk",20);
        Person person6=new Person("Tomasz","KOwalski",60);
        List<Person> personList= Arrays.asList(person1, person2, person3, person4, person5, person6);
       consumeList(personList,(System.out::println));
       //Consumer cons = person-> System.out.println(person);

    }
    static <T> void consumeList(List<T> list, Consumer<T>consumer){
        for (T t: list){
            consumer.accept(t);
        }

    }


}
