package markerinterfaces;

public class PrototypeModel implements Cloneable {
    private String name;
    private int version;
    public PrototypeModel(String name, int version) { this.name = name; this.version = version; }
    public String getName() { return name; }
    public int getVersion() { return version; }
    @Override public PrototypeModel clone() {
        try { return (PrototypeModel) super.clone(); }
        catch (CloneNotSupportedException e) { throw new AssertionError(e); }
    }
    @Override public String toString() { return "PrototypeModel{" + name + ", v" + version + "}"; }
}
