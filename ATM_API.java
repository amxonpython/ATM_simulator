import java.util.Scanner;

public class ATM_API {

    static int balance = 0;
    public static void replenish(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("сколько хотите полажить на счёт?");
        int sym = scanner.nextInt();
        balance = (balance + sym);
        System.out.println("ваша текущий баланс: " + balance);

    }

    public static void take_off(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("сколько хотите снять?");
        int sym = scanner.nextInt();
        if (sym > balance){
            System.out.println("недостаточно денег");
        }else {
            balance = (balance - sym);
            System.out.println("на вашем балансе: " + balance);
        }
    }
    public static void find_out_the_balance(){
        System.out.println("на вашем баналсе: " + balance);
    }
    public static void help(){
        System.out.println("replenish - пополнить баланс");
        System.out.println("take off - снять бананс");
        System.out.println("find out the balance - узнать баланс");
        System.out.println(); //разделитель
    }
}