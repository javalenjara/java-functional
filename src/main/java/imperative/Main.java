package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jhon", MALE));
        people.add(new Person("Maria", FEMALE));
        people.add(new Person("Aisha", FEMALE));
        people.add(new Person("Alex", MALE));
        people.add(new Person("Alice", FEMALE));

        //Imperative way
        System.out.println("//Imperative way");
        List<Person> females = new ArrayList<>();

        for(Person person : people){
            if (FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for(Person female : females){
            System.out.println(female);
        }

        System.out.println("//Declarative way");

        //Declarative approach
        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
