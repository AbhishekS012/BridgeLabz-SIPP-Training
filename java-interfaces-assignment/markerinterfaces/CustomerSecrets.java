package markerinterfaces;

public class CustomerSecrets implements SensitiveData {
    private final String pan;
    private final String token;
    public CustomerSecrets(String pan, String token) { this.pan = pan; this.token = token; }
    @Override public String toString() { return "CustomerSecrets{***}"; }
    public String getPan() { return pan; }
    public String getToken() { return token; }
}
