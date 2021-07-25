package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;
import static streams._Stream.Gender.PREFER_NOT_TO_SAY;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        people.add(new Person("Jhon", MALE));
        people.add(new Person("Maria", FEMALE));
        people.add(new Person("Aisha", FEMALE));
        people.add(new Person("Alex", MALE));
        people.add(new Person("Alice", FEMALE));
        people.add(new Person("Bob", PREFER_NOT_TO_SAY));

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
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
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
