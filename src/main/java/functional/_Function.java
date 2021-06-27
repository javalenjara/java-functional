package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

//One input, one output
public class _Function {

    public static void main(String[] args) {
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        //BiFunction example
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementByOneAndMultiplyFunction.apply(4, 100));

    }

    //Functional style. Same as increment method. 1 parameter, 1 return.
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }

    //Takes two arguments and return 1. Similar to Function
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementByOne, numToMultiplyBy) -> (numberToIncrementByOne + 1) * numToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
