package interfaces.devices;

public class Light implements SmartDeviceControl {
    private boolean on;
    @Override public void turnOn() { on = true; System.out.println("Light turned ON"); }
    @Override public void turnOff() { on = false; System.out.println("Light turned OFF"); }
    public boolean isOn() { return on; }
}
