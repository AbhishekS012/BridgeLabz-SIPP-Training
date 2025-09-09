package reflectionproblems;

import java.lang.reflect.*;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class Problem7_ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Field field = Configuration.class.getDeclaredField("API_KEY");
        field.setAccessible(true);
        System.out.println("Old API_KEY: " + field.get(null));
        field.set(null, "NEW_SECRET_KEY");
        System.out.println("New API_KEY: " + field.get(null));
    }
}