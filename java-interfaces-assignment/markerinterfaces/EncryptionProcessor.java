package markerinterfaces;

import java.util.Base64;

public class EncryptionProcessor {
    public static String maybeEncrypt(Object obj, String data) {
        if (obj instanceof SensitiveData) {
            return Base64.getEncoder().encodeToString(data.getBytes());
        }
        return data;
    }
}
