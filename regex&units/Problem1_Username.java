package problems;

public class Problem1_Username {
    public static boolean solve(String s) { return s != null && s.matches("^[A-Za-z][A-Za-z0-9_]{4,14}$"); }
}
