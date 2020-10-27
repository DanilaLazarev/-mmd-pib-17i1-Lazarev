import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

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
                    //PatientCard.Show();
                    break;
                case "2":
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("!");
                    break;
                case "4":
                    System.out.println("Спасибо за работу!");
                    break;
                default:
                    System.out.println("Выберите из предложенных вариантов!");
                    break;
            }
            in.close();
        } while (!"4".equals(userInput));
    }
}

