import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean working = true;

        while (working){
            System.out.println("выберите действие: ");
            String action = scanner.nextLine();
            switch (action){
                case "replenish":
                    ATM_API.replenish();
                    break;
                case "take off":
                    ATM_API.take_off();
                    break;
                case "find out the balance":
                    ATM_API.find_out_the_balance();
                    break;
                case "exit":
                    working = false;
                    break;
                case "help":

                default:
                    System.out.println("Error: неизвестная комманда");
            }
        }
    }
}