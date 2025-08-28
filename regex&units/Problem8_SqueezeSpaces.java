package problems;

public class Problem8_SqueezeSpaces {
    public static String solve(String input) { if(input==null)return null; return input.replaceAll("\\s{2,}"," "); }
}
