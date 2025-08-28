package problems;

public class Problem7_Links {
    public static java.util.List<String> solve(String text) { java.util.List<String> out=new java.util.ArrayList<>(); if(text==null)return out; java.util.regex.Matcher m=java.util.regex.Pattern.compile("https?://[^\\s]+").matcher(text); while(m.find()) out.add(m.group()); return out; }
}
