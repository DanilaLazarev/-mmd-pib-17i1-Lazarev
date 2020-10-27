import java.util.ArrayList;
import java.util.List;

public class Clinic {

    private final List<Visit> visits = new ArrayList<>();
    private final List<PatientCard> patients = new ArrayList<>();
    private final List<Doctor> doctors = new ArrayList<>();

    public Clinic() {
        this.doctors.add(new Doctor("Владимир", Specialization.THERAPIST));
        this.doctors.add(new Doctor("Дмитрий", Specialization.THROAT));
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public List<PatientCard> getPatients() {
        return patients;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}
