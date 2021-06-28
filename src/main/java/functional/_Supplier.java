package functional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());

        System.out.println(getDBConnectionUrlsSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<List<String>> getDBConnectionUrlsSupplier = () -> {
        List<String> urls = new ArrayList<>();
        urls.add("jdbc://localhost:5432/users");
        urls.add("jdbc://localhost:5432/customers");
        return urls;
    };
}
