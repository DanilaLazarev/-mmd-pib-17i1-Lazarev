import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Clinic clinic = new Clinic();
        Scanner in = new Scanner(System.in);
        String userInput;
        do {
            System.out.println("Выберите дальнейшее действие:" +
                    "\n1.Работа с карточками." +
                    "\n2.Работа с врачами" +
                    "\n3.Работа с посищениями" +
                    "\n4.Выход");
            userInput = in.nextLine();
            switch (userInput) {
                case "1":
                    System.out.println(clinic.getPatients());
                    break;
                case "2":
                    System.out.println("Список врачей:");
                    for (Doctor doctor : clinic.getDoctors()) {
                        System.out.println(doctor);
                    }
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
}

