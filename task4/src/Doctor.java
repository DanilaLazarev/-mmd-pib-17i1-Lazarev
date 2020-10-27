public class Doctor implements Human {

    private String name;
    private Specialization specialization;

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


    public Doctor Create(String name, Specialization specialization) {

        return new Doctor(name, specialization);
    }
}
