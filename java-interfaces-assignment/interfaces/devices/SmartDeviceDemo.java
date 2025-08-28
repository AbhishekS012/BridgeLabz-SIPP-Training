package interfaces.devices;

public class SmartDeviceDemo {
    public static void main(String[] args) {
        SmartDeviceControl[] devices = { new Light(), new AC(), new TV() };
        for (SmartDeviceControl d : devices) d.turnOn();
        for (SmartDeviceControl d : devices) d.turnOff();
    }
}
