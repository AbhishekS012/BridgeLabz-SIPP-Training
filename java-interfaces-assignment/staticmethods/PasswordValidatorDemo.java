package staticmethods;

public class PasswordValidatorDemo {
    public static void main(String[] args) {
        String[] pwds = {"weak", "Strong1!", "NoDigits!", "noupper1!", "NOLOWER1!"};
        for (String p : pwds) {
            System.out.println(p + " -> " + (SecurityUtils.isStrongPassword(p) ? "STRONG" : "WEAK"));
        }
    }
}
