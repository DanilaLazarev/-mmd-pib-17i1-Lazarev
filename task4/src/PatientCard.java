import java.util.ArrayList;
import java.util.List;

public class PatientCard implements Human {

    private final String name;
    private final List<Visit> visits;

    public PatientCard(String name) {
        this.name = name;
        this.visits = new ArrayList<>();
    }

    public List<Visit> getVisits() {
        return visits;
    }

    public String getFIO() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
