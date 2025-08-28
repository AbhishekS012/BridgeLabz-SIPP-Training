package markerinterfaces;

public class SensitiveDataDemo {
    public static void main(String[] args) {
        CustomerSecrets secrets = new CustomerSecrets("ABCDE1234F", "XYZTOKEN");
        String payload = "PAN=" + secrets.getPan() + ";TOKEN=" + secrets.getToken();
        String stored = EncryptionProcessor.maybeEncrypt(secrets, payload);
        System.out.println("Stored payload: " + stored);
    }
}
