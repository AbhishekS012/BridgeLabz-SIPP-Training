package markerinterfaces;

import java.io.*;

public class BackupProcessor {
    public static void backup(Object obj, File file) throws IOException {
        if (!(obj instanceof BackupSerializable)) {
            throw new IllegalArgumentException("Object not marked for backup!");
        }
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(obj);
        }
        System.out.println("Backup written to " + file.getAbsolutePath());
    }

    public static Object restore(File file) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            return in.readObject();
        }
    }
}
