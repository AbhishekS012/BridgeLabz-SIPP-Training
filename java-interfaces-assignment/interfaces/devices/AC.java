package interfaces.devices;

public class AC implements SmartDeviceControl {
    private boolean on;
    private int temperature = 24;
    @Override public void turnOn() { on = true; System.out.println("AC turned ON @ " + temperature + "°C"); }
    @Override public void turnOff() { on = false; System.out.println("AC turned OFF"); }
    public void setTemperature(int temp) { this.temperature = temp; }
}
