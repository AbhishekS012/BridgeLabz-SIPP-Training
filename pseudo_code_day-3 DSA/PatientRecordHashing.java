
// DSA - Moderate: Patient Record Hashing using HashMap
import java.util.*;

class Patient {
    int id;
    String name;
    Patient(int id, String name) { this.id = id; this.name = name; }
}

public class PatientRecordHashing {
    public static void main(String[] args) {
        Map<Integer, Patient> records = new HashMap<>();
        records.put(1, new Patient(1, "Ramesh"));
        records.put(2, new Patient(2, "Suresh"));

        // Retrieve
        Patient p = records.get(1);
        System.out.println("Retrieved: " + p.name);

        // Update
        records.put(1, new Patient(1, "Ramesh Kumar"));
        System.out.println("Updated: " + records.get(1).name);

        // Delete
        records.remove(2);
        System.out.println("Remaining Records: " + records.size());
    }
}
