package interfaces.devices;

public class TV implements SmartDeviceControl {
    private boolean on;
    private int volume = 10;
    @Override public void turnOn() { on = true; System.out.println("TV turned ON (vol " + volume + ")"); }
    @Override public void turnOff() { on = false; System.out.println("TV turned OFF"); }
    public void setVolume(int v) { this.volume = v; }
}
