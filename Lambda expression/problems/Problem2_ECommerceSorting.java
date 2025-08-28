package problems;

public class Problem2_ECommerceSorting {
    public static void run() {
    class Product {
        String name; double price; double rating; double discount;
        Product(String n,double p,double r,double d){name=n;price=p;rating=r;discount=d;}
        public String toString(){return name+" $"+price+" r:"+rating+" d:"+discount;}
    }
    java.util.List<Product> products = new java.util.ArrayList<>();
    products.add(new Product("Shirt",20,4.5,10));
    products.add(new Product("Shoes",50,4.8,20));
    products.add(new Product("Hat",15,4.2,5));
    products.sort((a,b)->Double.compare(a.price,b.price));
    System.out.println("Sorted by price: "+products);
    products.sort((a,b)->Double.compare(b.rating,a.rating));
    System.out.println("Sorted by rating: "+products);
    products.sort((a,b)->Double.compare(b.discount,a.discount));
    System.out.println("Sorted by discount: "+products);
}
}
