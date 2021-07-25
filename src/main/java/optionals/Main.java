package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        /*Object value = Optional.ofNullable("hello")
                .orElseGet(() -> "default value");*/

        /*Object value = Optional.ofNullable(null)
                .orElseThrow(() -> new IllegalStateException("Exception"));*/

       Optional.ofNullable(null)
                .ifPresent(value -> System.out.println("Sending email to: " + value));

    }
}
