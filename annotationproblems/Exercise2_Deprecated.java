package annotationproblems;

class LegacyAPI {
    @Deprecated
    void oldFeature() {
        System.out.println("Old feature");
    }
    void newFeature() {
        System.out.println("New feature");
    }
}

public class Exercise2_Deprecated {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        api.oldFeature();
        api.newFeature();
    }
}