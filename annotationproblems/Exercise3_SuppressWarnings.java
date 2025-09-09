package annotationproblems;

import java.util.ArrayList;

public class Exercise3_SuppressWarnings {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
    }
}