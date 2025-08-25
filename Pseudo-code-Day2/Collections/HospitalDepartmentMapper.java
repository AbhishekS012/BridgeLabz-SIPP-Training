
// Collections - Moderate: Hospital Department Mapper
import java.util.*;

class Doctor {
    String name, specialization;
    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}

public class HospitalDepartmentMapper {
    public static void main(String[] args) {
        Map<String, List<Doctor>> hospital = new HashMap<>();

        hospital.put("Cardiology", Arrays.asList(new Doctor("Dr. A", "Cardiologist")));
        hospital.put("Neurology", Arrays.asList(new Doctor("Dr. B", "Neurologist"), new Doctor("Dr. C", "Neurologist")));

        hospital.forEach((dept, doctors) -> {
            System.out.println("Department: " + dept);
            doctors.stream()
                   .filter(d -> d.specialization.contains("Neuro"))
                   .forEach(d -> System.out.println("Doctor: " + d.name));
        });
    }
}
