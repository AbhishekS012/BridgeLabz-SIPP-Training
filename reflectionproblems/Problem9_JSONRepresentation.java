package reflectionproblems;

import java.lang.reflect.*;

class Product {
    String name = "Laptop";
    double price = 1200.0;
}

public class Problem9_JSONRepresentation {
    public static String toJson(Object obj) throws Exception {
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            sb.append("\"").append(fields[i].getName()).append("\":\"")
              .append(fields[i].get(obj)).append("\"");
            if (i < fields.length - 1) sb.append(", ");
        }
        sb.append("}");
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        Product p = new Product();
        System.out.println(toJson(p));
    }
}