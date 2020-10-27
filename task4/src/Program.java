import java.util.Scanner;
public class Program {
    public static void main (String args[]) {

        Scanner in = new Scanner(System.in);
        int d = 0;
        while (d == 0) {
            System.out.println("Выберите дальнейшее действие:" +
                    "\n1.Работа с карточками." +
                    "\n2.Работа с врачами" +
                    "\n3.Работа с посищениями" +
                    "\n4.Выход");
            int z = in.nextInt();
            switch (z) {
                case 1:
                    //PatientCard.Show();

                case 2:
                    System.out.println("");
                case 3:
                    System.out.println("");
                case 4:
                    d++;
                default:
                    System.out.println("Выберите из предложенных вариантов!");
            }
            in.close();
        }
    }

    /*public void ShowMain(){
        !!!Возможное решение
    }*/
}
