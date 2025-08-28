package staticmethods;

public interface SecurityUtils {
    static boolean isStrongPassword(String pwd) {
        if (pwd == null || pwd.length() < 8) return false;
        boolean hasUpper=false, hasLower=false, hasDigit=false, hasSymbol=false;
        for (char c : pwd.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else hasSymbol = true;
        }
        return hasUpper && hasLower && hasDigit && hasSymbol;
    }
}
