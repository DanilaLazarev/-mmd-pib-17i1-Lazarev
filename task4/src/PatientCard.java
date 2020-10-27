import java.util.Scanner;
public class PatientCard implements Human {
    /*
    ФИО - хуман
    Посещение - посещние[]
     */
    public PatientCard(String name, Visits[] visits){
        this.name = name;
        this.visits = visits;
    }

    Scanner in = new Scanner(System.in);

    private String name;
    Visits[] visits;

    public String getFIO()
    {
        return name;
    }

//    public static void Show()
//    {
//        int a = 0;
//        while(a == 0) {
//            System.out.println("\n Выберите дальнейшие действия:\n1.Заполнить карточку\n2.Посмотреть карточки\n3.Выход ");
//            int b = in.nextInt();
//            switch (b){
//                case 1:
//                    System.out.println("Введите Фио:");
//                    String name = in.next();
//                    Create(name);
//                    System.out.println("Карта создана");
//                case 2:
//                    for(int i = 0;i < PatientCard.length;i++){
//                        System.out.println(PatientCard[i] + ", ");
//                    };
//                case 3:
//                    a++;
//                default:
//                    System.out.println("Выберите из предложенных вариантов!");
//            }
//        }
//    }

//    public static PatientCard Create(String name){
//        this.name = name;
//        return new PatientCard(name,null);
//    }
    

}
