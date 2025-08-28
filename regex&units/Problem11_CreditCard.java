package problems;

public class Problem11_CreditCard {
    public static boolean visa(String n){return n!=null&&n.matches("^4\\d{15}$");} public static boolean mastercard(String n){return n!=null&&n.matches("^5\\d{15}$");}
}
