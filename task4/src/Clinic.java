import java.util.ArrayList;
import java.util.List;

public class Clinic {

    private final List<Visits> visits = new ArrayList<>();
    private final List<PatientCard> patients = new ArrayList<>();
    private final List<Doctor> doctors = new ArrayList<>();

    public Clinic() {

    }

    public List<Visits> getVisits() {
        return visits;
    }

    public List<PatientCard> getPatients() {
        return patients;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}
