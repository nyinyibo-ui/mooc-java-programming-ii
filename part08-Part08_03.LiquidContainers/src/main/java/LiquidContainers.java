
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first.getAmount() + "/100");
            System.out.println("Second: " + second.getAmount() + "/100");

            String input = scan.nextLine();
            // split the command
            String[] parts = input.split(" ");
            String command = parts[0];

            if (input.equals("quit")) {
                break;
            }

            if (command.equals("add")) {
                int amount = Integer.valueOf(parts[1]);
                // if the amount is negative do nothing
                if (amount < 0) {
                    first.add(0);
                } else {
                    first.add(amount);

                }
            }
            if (command.equals("move")) {
                int amount = Integer.valueOf(parts[1]);
                // if the amount is negative do nothing
                if (amount < 0) {
                    continue;
                } else {
                    first.move(amount, second);

                }
            }
            if (command.equals("remove")) {
                int amount = Integer.valueOf(parts[1]);
                // if the amount is negative do nothing
                if (amount < 0) {
                    continue;
                } else {
                    second.remove(amount);

                }

            }
        }

    }
}
