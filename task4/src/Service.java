import java.io.*;

public class Service {

    public static void write(Clinic clinic) throws Exception {
        try (FileOutputStream fos = new FileOutputStream("inputClinic.txt");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)
        ) {
            oos.writeObject(clinic);
        }
    }

    public static Clinic reader() throws Exception {
        try (FileInputStream fis = new FileInputStream("inputClinic.txt");
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)
        ) {
            return (Clinic) ois.readObject();
        }

    }
}
