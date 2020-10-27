

public class PatientCard implements Human {

    private final String name;

    public PatientCard(String name) {
        this.name = name;
    }

    public String getFIO() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
