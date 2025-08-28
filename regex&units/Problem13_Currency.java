package problems;

public class Problem13_Currency {
    public static java.util.List<String> solve(String text){ java.util.List<String> out=new java.util.ArrayList<>(); if(text==null)return out; java.util.regex.Matcher m=java.util.regex.Pattern.compile("\\$\\d+(?:\\.\\d{2})?|\\b\\d+\\.\\d{2}\\b").matcher(text); while(m.find()) out.add(m.group()); return out;}
}
