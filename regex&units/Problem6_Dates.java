package problems;

public class Problem6_Dates {
    public static java.util.List<String> solve(String text) { java.util.List<String> out=new java.util.ArrayList<>(); if(text==null)return out; java.util.regex.Matcher m=java.util.regex.Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b").matcher(text); while(m.find()) out.add(m.group()); return out; }
}
