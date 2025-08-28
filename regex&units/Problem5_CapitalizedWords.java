package problems;

public class Problem5_CapitalizedWords {
    public static java.util.List<String> solve(String text) { java.util.List<String> out=new java.util.ArrayList<>(); if(text==null)return out; java.util.regex.Matcher m=java.util.regex.Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(text); while(m.find()) out.add(m.group()); return out; }
}
