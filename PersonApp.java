package cwiczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonApp {

    public static void main(String[] args) {
        Person person1=new Person("Andrzej","KOwalski",24);
        Person person2=new Person("Jan","Nowak",15);
        Person person3=new Person("Michal","Kaczkowski",29);
        Person person4=new Person("Maciej","KOwal",50);
        Person person5=new Person("Janusz","Kowalczyk",13);
        Person person6=new Person("Tomasz","KOwalski",60);
        List<Person> personList= Arrays.asList(person1, person2, person3, person4, person5, person6);
       //consumeList(personList,(System.out::println));
       //Consumer cons = person-> System.out.println(person);
       //predicateList(personList,person -> person.getAge()>18);
        applyToList(personList,person->{
             person.setAge(person.getAge()+1);
             return person;
        });
        System.out.println(person6.getAge());
    }
    static <T> void consumeList(List<T> list, Consumer<T>consumer){
        for (T t: list){
            consumer.accept(t);
                    }

    }
static <T> void predicateList(List<T> list,Predicate <T> predicate){

        for (T t: list){
         if(predicate.test(t)){
             System.out.println(t);
            }
       }
}
static <T> void applyToList(List<T> list, Function<T,T>function){
      for (T t:list){
          function.apply(t);
          list.set(list.indexOf(t),t);

      }



    }

//    static <T> void applyToList2(List<T> list, Function<T,T>function){
//
//       for(int i=0, i<list.size(),i++){
//
//
//
//        }

}
