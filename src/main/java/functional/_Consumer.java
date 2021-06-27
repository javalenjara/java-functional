package functional;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        //Normal way
        Customer maria = new Customer("Maria", "7777777");
        greetCustomer(maria);

        //Using Costumer Functional interface
        greetCostumerConsumer.accept(maria);
    }

    static Consumer<Customer> greetCostumerConsumer = customer -> System.out.println(
            "Hello " + customer.customerName + ", thanks for registering phone number "
            + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "
        + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
