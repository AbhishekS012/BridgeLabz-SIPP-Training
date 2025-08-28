package problems;

public class Problem3_HexColor {
    public static boolean solve(String s) { return s != null && s.matches("^#[0-9A-Fa-f]{6}$"); }
}
