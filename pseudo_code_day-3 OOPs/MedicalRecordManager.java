
// OOPs - Moderate: Medical Record Manager (Interfaces and Polymorphism)
interface Searchable {
    void search(String keyword);
}

interface Printable {
    void print();
}

class Prescription implements Searchable, Printable {
    String patientName;
    Prescription(String patientName) { this.patientName = patientName; }

    public void search(String keyword) {
        if (patientName.contains(keyword)) {
            System.out.println("Prescription found for: " + patientName);
        }
    }

    public void print() {
        System.out.println("Printing prescription for: " + patientName);
    }
}

class LabReport implements Searchable, Printable {
    String reportType;
    LabReport(String reportType) { this.reportType = reportType; }

    public void search(String keyword) {
        if (reportType.contains(keyword)) {
            System.out.println("Lab Report found: " + reportType);
        }
    }

    public void print() {
        System.out.println("Printing Lab Report: " + reportType);
    }
}

public class MedicalRecordManager {
    public static void main(String[] args) {
        Searchable s1 = new Prescription("Rohit Sharma");
        Searchable s2 = new LabReport("Blood Test");

        s1.search("Rohit");
        s2.search("Blood");

        ((Printable) s1).print();
        ((Printable) s2).print();
    }
}
