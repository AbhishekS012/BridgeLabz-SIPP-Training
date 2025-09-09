package reflectionproblems;

public class Problem4_DynamicObjectCreation {
    static class Student {
        String name;
        Student() { this.name = "Default Student"; }
    }
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("reflectionproblems.Problem4_DynamicObjectCreation$Student");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        System.out.println("Created object: " + obj);
    }
}