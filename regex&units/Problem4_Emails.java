package problems;

public class Problem4_Emails {
    public static java.util.List<String> solve(String text) { java.util.List<String> out=new java.util.ArrayList<>(); if(text==null)return out; java.util.regex.Matcher m=java.util.regex.Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,}").matcher(text); while(m.find()) out.add(m.group()); return out; }
}
