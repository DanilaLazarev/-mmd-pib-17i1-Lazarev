import java.io.Serializable;
import java.time.LocalDate;

public class Visit implements Serializable {

    private final PatientCard patient;
    private final Doctor doctor;
    private final LocalDate date;

    public Visit(PatientCard patient, Doctor doctor, LocalDate date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public PatientCard getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return date + ":" +
                " Пациент - " + patient +
                ", Лечащий врач - " + doctor.getFIO();
    }
}
