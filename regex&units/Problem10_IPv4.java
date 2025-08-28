package problems;

public class Problem10_IPv4 {
    public static boolean solve(String ip){ if(ip==null)return false; String[] parts=ip.split("\\."); if(parts.length!=4)return false; for(String part:parts){ if(part.isEmpty()||(part.length()>1&&part.startsWith("0"))){ if(!part.equals("0")) return false;} try{int n=Integer.parseInt(part); if(n<0||n>255) return false;}catch(Exception e){return false;} } return true;}
}
