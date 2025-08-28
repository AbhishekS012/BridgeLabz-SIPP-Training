package problems;

public class Problem9_Censor {
    public static String solve(String input, java.util.List<String> badWords) { if(input==null||badWords==null||badWords.isEmpty()) return input; String escaped=String.join("|", badWords.stream().map(w->java.util.regex.Pattern.quote(w)).toArray(String[]::new)); java.util.regex.Pattern p=java.util.regex.Pattern.compile("\\b(?i:"+escaped+")\\b"); java.util.regex.Matcher m=p.matcher(input); StringBuffer sb=new StringBuffer(); while(m.find()){m.appendReplacement(sb,"****");} m.appendTail(sb); return sb.toString(); }
}
