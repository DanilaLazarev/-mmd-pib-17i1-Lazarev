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
                    System.out.println(clinic.getVisits());
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
        for (PatientCard patientCard : clinic.getPatients()) {
            System.out.println(patientCard);
        }
    }

    private static void createPatient(Clinic clinic) {
        System.out.println("Введите имя нового пациента");
        String patientName = IN.nextLine();
        PatientCard newPatientCard = new PatientCard(patientName);
        clinic.addPatient(newPatientCard);
    }

    private static void printDoctors(Clinic clinic){
        System.out.println("Список врачей:");
        for (Doctor doctor : clinic.getDoctors()) {
            System.out.println(doctor);
        }
    }
}

