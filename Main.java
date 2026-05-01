import java.util.Scanner;

public class Main {
    static int terminal_sym = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean working = true;

        while (working){
            System.out.println("выберите действие: ");
            String action = scanner.nextLine();
            switch (action){
                case "replenish":
                    System.out.println("сколько хотите полажить на счёт?");
                    int sym = scanner.nextInt();
                    ATM_API.replenish(sym);
                    System.out.println("ваша текущий баланс: " + ATM_API.balance);
                    String s = scanner.nextLine();
                    break;
                case "take off":
                    System.out.println("сколько хотите снять?");
                    sym = scanner.nextInt();
                    ATM_API.take_off(sym);
                    if (ATM_API.itog == "true"){
                        System.out.println("на вашем балансе: " + ATM_API.balance);
                    }else {
                        System.out.println("на вашем балансе недостаточно денег");
                    }
                    s = scanner.nextLine();
                    break;
                case "find out the balance":
                    System.out.println("на вашем баналсе: " + ATM_API.balance);
                    break;
                case "exit":
                    working = false;
                    break;
                case "help":
                    System.out.println("replenish - пополнить баланс");
                    System.out.println("take off - снять бананс");
                    System.out.println("find out the balance - узнать баланс");
                    System.out.println(); //разделитель
                    break;
                default:
                    System.out.println("Error: неизвестная комманда");
            }
        }
    }
}
