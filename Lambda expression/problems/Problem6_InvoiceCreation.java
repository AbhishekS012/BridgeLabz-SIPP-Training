package problems;

public class Problem6_InvoiceCreation {
    public static void run() {
    class Invoice { int id; Invoice(int id){this.id=id;} public String toString(){return "Invoice:"+id;} }
    java.util.List<Integer> txIds = java.util.Arrays.asList(1,2,3);
    java.util.function.Function<Integer,Invoice> factory = Invoice::new;
    txIds.stream().map(factory).forEach(System.out::println);
}
}
