package problems;

public class Problem3_NotificationFiltering {
    public static void run() {
    java.util.List<String> alerts = java.util.Arrays.asList("Critical","Normal","Low Battery","Emergency");
    java.util.function.Predicate<String> filter = a -> a.equals("Critical")||a.equals("Emergency");
    alerts.stream().filter(filter).forEach(System.out::println);
}
}
