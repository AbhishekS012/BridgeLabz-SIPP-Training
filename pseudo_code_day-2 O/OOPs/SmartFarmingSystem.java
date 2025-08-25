
// OOPs - Moderate: Smart Farming System
abstract class Crop {
    String name;
    Crop(String name) { this.name = name; }
    abstract void waterRequirement();
    abstract void harvest();
}

class Rice extends Crop {
    Rice() { super("Rice"); }
    void waterRequirement() { System.out.println("Rice requires high water."); }
    void harvest() { System.out.println("Rice harvested in 4 months."); }
}

class Wheat extends Crop {
    Wheat() { super("Wheat"); }
    void waterRequirement() { System.out.println("Wheat requires medium water."); }
    void harvest() { System.out.println("Wheat harvested in 6 months."); }
}

public class SmartFarmingSystem {
    public static void main(String[] args) {
        Crop rice = new Rice();
        Crop wheat = new Wheat();
        rice.waterRequirement();
        rice.harvest();
        wheat.waterRequirement();
        wheat.harvest();
    }
}
