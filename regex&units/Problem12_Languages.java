package problems;

public class Problem12_Languages {
    public static java.util.List<String> solve(String text){ java.util.List<String> out=new java.util.ArrayList<>(); if(text==null)return out; java.util.regex.Matcher m=java.util.regex.Pattern.compile("\\b(JavaScript|Java|Python|Go)\\b").matcher(text); while(m.find()) out.add(m.group(1)); return out;}
}
