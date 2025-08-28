package problems;

public class Problem14_RepeatingWords {
    public static java.util.Set<String> solve(String text){ java.util.Set<String> out=new java.util.LinkedHashSet<>(); if(text==null)return out; java.util.regex.Matcher m=java.util.regex.Pattern.compile("(?i)\\b(\\w+)\\s+\\1\\b").matcher(text); while(m.find()) out.add(m.group(1).toLowerCase()); return out;}
}
