
// OOPs - Easy: Traffic Signal Simulation
enum TrafficLight { RED, YELLOW, GREEN }

class TrafficSignal {
    private TrafficLight light;

    public TrafficSignal() {
        light = TrafficLight.RED;
    }

    public void changeLight() {
        switch (light) {
            case RED: light = TrafficLight.GREEN; break;
            case GREEN: light = TrafficLight.YELLOW; break;
            case YELLOW: light = TrafficLight.RED; break;
        }
        System.out.println("Light changed to: " + light);
    }
}

public class TrafficSignalSimulation {
    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        for (int i = 0; i < 5; i++) {
            signal.changeLight();
        }
    }
}
