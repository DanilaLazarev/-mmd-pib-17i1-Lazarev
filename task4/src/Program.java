import java.time.LocalDate;
import java.util.Scanner;

public class Program {

    private static final Scanner IN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Clinic clinic = new Clinic();
        String userInput;
        do {
            System.out.println("Выберите дальнейшее действие:" +
                    "\n1.Работа с карточками." +
                    "\n2.Работа с врачами" +
                    "\n3.Работа с посещениями" +
                    "\n4.Записать данные в файл" +
                    "\n5.Выгрузить данные из файла" +
                    "\n6.Выход");
            userInput = IN.nextLine();
            switch (userInput) {
                case "1":
                    System.out.println("Что именно вы хотите сделать?" +
                            "\n1.Добавить пациента" +
                            "\n2.Посмотрть список пациентов");
                    String case1Switch = IN.nextLine();
                    switch (case1Switch) {
                        case "1":
                            createPatient(clinic);
                            printPatients(clinic);
                            break;
                        case "2":
                            printPatients(clinic);
                            break;
                        default:
                            System.out.println("Выберите из предложенных вариантов!");
                    }
                    break;
                case "2":
                    System.out.println("Что именно вы хотите сделать?" +
                            "\n1.Добавить доктора" +
                            "\n2.Посмотрть список докторов");
                    String case2Switch = IN.nextLine();
                    switch (case2Switch) {
                        case "1":
                            createDoctors(clinic);
                            printDoctors(clinic);
                            break;
                        case "2":
                            printDoctors(clinic);
                            break;
                        default:
                            System.out.println("Выберите из предложенных вариантов!");
                    }
                    break;
                case "3":
                    System.out.println("Что именно вы хотите сделать?" +
                            "\n1.Добавить посещение" +
                            "\n2.Посмотрть список посещений");
                    String case3Switch = IN.nextLine();
                    switch (case3Switch) {
                        case "1":
                            createVisit(clinic);
                            printVisit(clinic);
                            break;
                        case "2":
                            printVisit(clinic);
                            break;
                        default:
                            System.out.println("Выберите из предложенных вариантов!");
                    }
                    break;
                case "4":
                    Service.write(clinic);
                    System.out.println("Данные записаны");
                    break;
                case "5":
                    System.out.println("Осторожно, не сохраненные данные будут удалены!" +
                            "\nХотите продолжить?" +
                            "\n1.Да" +
                            "\n2.Нет");
                    String case5Switch = IN.nextLine();
                    switch (case5Switch) {
                        case "1":
                            clinic = Service.reader();
                            System.out.println("Данные успешно выгружены");
                            break;
                        case "2":
                            break;
                        default:
                            System.out.println("Выберите из предложенных вариантов!");
                    }
                    break;
                case "6":
                    System.out.println("Спасибо за работу!");
                    break;
                default:
                    System.out.println("Выберите из предложенных вариантов!");
                    break;
            }
        } while (!"6".equals(userInput));

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

    private static void createDoctors(Clinic clinic) {
        System.out.println("Введите имя доктора");
        String docName = IN.nextLine();
        System.out.println("Выберите специализацию в медицине");
        Specialization[] specialization = Specialization.values();
        for (int i = 0; i < Specialization.values().length; ++i) {
            System.out.println(i + ". " + specialization[i]);
        }
        String specChoice = IN.nextLine();
        int specChoiceInt = Integer.parseInt(specChoice);
        Doctor newDoctor = new Doctor(docName, specialization[specChoiceInt]);
        clinic.addDoc(newDoctor);
    }

}

