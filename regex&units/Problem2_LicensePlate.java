package problems;

public class Problem2_LicensePlate {
    public static boolean solve(String s) { return s != null && s.matches("^[A-Z]{2}\\d{4}$"); }
}
