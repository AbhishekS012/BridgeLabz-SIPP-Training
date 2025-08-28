package problems;

public class Problem5_NameUppercasing {
    public static void run() {
    java.util.List<String> names = java.util.Arrays.asList("alice","bob","charlie");
    names.stream().map(String::toUpperCase).forEach(System.out::println);
}
}
