public class Doctor implements Human {

    private final String name;
    private final Specialization specialization;

    public Doctor(String name, Specialization specialization) {
        this.name = name;
        this.specialization = specialization;
    }

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
