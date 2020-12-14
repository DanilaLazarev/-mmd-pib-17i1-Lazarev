import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Clinic implements Serializable {

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

    public void addPatient(PatientCard patientCard) {
        patients.add(patientCard);
    }

    public void addVisit(Visit newVisit) throws Exception {
        for (Visit visit : visits) {
            if (visit.getDoctor() == newVisit.getDoctor() && visit.getDate().equals(newVisit.getDate())) {
                throw new Exception("Доктор занят");
            }
        }
        visits.add(newVisit);
    }

    public void addDoc(Doctor newDoc){
        doctors.add(newDoc);
    }
}
