import java.util.Scanner;
public class Doctor implements Human{

    private String name;
    Specialization specialization;

    public Doctor(String name, Specialization specialization) {

    }

    public String getFIO()
    {
        return  name;
    }

    Scanner in = new Scanner(System.in);

//    public void Show()
//    {
//        int a = 0;
//        while(a == 0) {
//            System.out.println("\n Выберите дальнейшие действия:\n1.Заполнить врача\n2.Посмотреть врачей\n3.Выход ");
//            int b = in.nextInt();
//            switch (b){
//                case 1:
//                    System.out.println("Введите ФИО врача");
//                    String name = in.next();
//                    System.out.println("Выберите специализацию");
//                    for(int i = 0;i<specialization.length;i++){
//                        System.out.println("Выберите специализацию");
//                    }
//                    int spec = in.nextInt();
//                    Create(name,specialization[spec]);
//                    System.out.println("Врач добавлен");
//                case 2:
//                    for(int i = 0;i < Doctor.length;i++){
//                        System.out.println(Doctor[i] + ", ");
//                    };
//                case 3:
//                    a++;
//                default:
//                    System.out.println("Выберите из предложенных вариантов!");
//            }
//        }
//    }

    public Doctor Create(String name,Specialization specialization){

        return new Doctor(name,specialization);
    }
}
