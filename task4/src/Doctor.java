import java.io.Serializable;

public class Doctor implements Human, Serializable {

    private final String name;
    private final Specialization specialization;

    public Doctor(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String getFIO() {
        return name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return getFIO() + " - " + specialization;
    }
}
