import java.util.Scanner;

public class ATM_API {

    static int balance = 0;
    static String itog = "null";

    public static void replenish(int sym){
        Scanner scanner = new Scanner(System.in);

        balance = (balance + sym);

    }

    public static void take_off(int sym){
        if (sym > balance){
            itog = "false";
        }else {
            balance = (balance - sym);
            itog = "true";
        }
    }
}
