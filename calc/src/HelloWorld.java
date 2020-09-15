public class HelloWorld {
    /**
     * Main methods which is executed by JVM and prints the message.
     *
     * @param arg command line arguments
     */
    public static void main(String[] arg) {
        String s = " 0.5 / 2";
        String[] args = s.split(" ");
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[2]);
        String z = args[1];
        /*if (args.length > 3)
        {
            throw;
        }
        else
            {

            }*/

    }

    public static double calc(double a, String z, double b) {
        switch (z){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                return a / b;
            case "*":
                return a * b;
        }
        return 0;
    }
}
