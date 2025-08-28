package markerinterfaces;

import java.io.File;

public class BackupDemo {
    public static void main(String[] args) throws Exception {
        UserData data = new UserData("abhishek", "a@example.com");
        File f = new File("user.backup");
        BackupProcessor.backup(data, f);
        Object restored = BackupProcessor.restore(f);
        System.out.println("Restored: " + restored);
    }
}
