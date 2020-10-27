import java.time.LocalDate;
import java.util.Scanner;

public class Program {

    private static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        String userInput;
        do {
            System.out.println("Выберите дальнейшее действие:" +
                    "\n1.Работа с карточками." +
                    "\n2.Работа с врачами" +
                    "\n3.Работа с посищениями" +
                    "\n4.Выход");
            userInput = IN.nextLine();
            switch (userInput) {
                case "1":
                    createPatient(clinic);
                    printPatients(clinic);
                    break;
                case "2":
                    printDoctors(clinic);
                    break;
                case "3":
                    createVisit(clinic);
                    printVisit(clinic);
                    break;
                case "4":
                    System.out.println("Спасибо за работу!");
                    break;
                default:
                    System.out.println("Выберите из предложенных вариантов!");
                    break;
            }
        } while (!"4".equals(userInput));
    }

    private static void printPatients(Clinic clinic) {
        System.out.println("Список пациентов:");
        for (int i = 0; i < clinic.getPatients().size(); ++i) {
            PatientCard patientCard = clinic.getPatients().get(i);
            System.out.println(i + ". " + patientCard);
        }
    }

    private static void createPatient(Clinic clinic) {
        System.out.println("Введите имя нового пациента");
        String patientName = IN.nextLine();
        PatientCard newPatientCard = new PatientCard(patientName);
        clinic.addPatient(newPatientCard);
    }

    private static void printDoctors(Clinic clinic) {
        System.out.println("Список врачей:");
        for (int i = 0; i < clinic.getDoctors().size(); ++i) {
            Doctor doctor = clinic.getDoctors().get(i);
            System.out.println(i + ". " + doctor);
        }
    }

    private static void createVisit(Clinic clinic) {
        System.out.println("Выберите врача:");
        printDoctors(clinic);
        String doctorIndexAsString = IN.nextLine();
        int doctorIndex = Integer.parseInt(doctorIndexAsString);
        System.out.println("Выберите пациента:");
        printPatients(clinic);
        String patientIndexAsString = IN.nextLine();
        int patientIndex = Integer.parseInt(patientIndexAsString);
        System.out.println("Введите дату посещения в формате гггг-мм-дд");
        String dateAsString = IN.nextLine();
        LocalDate date = LocalDate.parse(dateAsString);
        Doctor doctor = clinic.getDoctors().get(doctorIndex);
        PatientCard patient = clinic.getPatients().get(patientIndex);
        Visit visit = new Visit(patient, doctor, date);
        try {
            clinic.addVisit(visit);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void printVisit(Clinic clinic) {
        System.out.println("Список посещений:");
        for (Visit visit : clinic.getVisits()) {
            System.out.println(visit);
        }
    }
}

