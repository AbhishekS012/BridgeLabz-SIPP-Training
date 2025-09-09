package annotationproblems;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class Person {
    @JsonField(name="user_name")
    String username = "john";
    @JsonField(name="user_age")
    int age = 25;
}

public class Advanced6_JsonField {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        StringBuilder sb = new StringBuilder("{");
        Field[] fields = Person.class.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            JsonField jf = fields[i].getAnnotation(JsonField.class);
            sb.append("\"").append(jf.name()).append("\":\"").append(fields[i].get(p)).append("\"");
            if (i < fields.length - 1) sb.append(", ");
        }
        sb.append("}");
        System.out.println(sb.toString());
    }
}