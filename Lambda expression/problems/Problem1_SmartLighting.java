package problems;

public class Problem1_SmartLighting {
    public static void run() {
    interface LightAction { void execute(); }
    LightAction motion = () -> System.out.println("Lights ON due to motion.");
    LightAction evening = () -> System.out.println("Dim lights in evening.");
    LightAction voice = () -> System.out.println("Voice command: Party Mode!");
    motion.execute();
    evening.execute();
    voice.execute();
}
}
