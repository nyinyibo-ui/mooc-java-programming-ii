
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first=new Container();
        Container second=new Container();


        while (true) {
            System.out.println("First: "+first);
            System.out.println("Second: "+second);

            String input = scan.nextLine();
            String[] parts=input.split(" ");
            String command=parts[0];
            if (input.equals("quit")) {
                break;
            }else if(command.equals("add")){
                int amount=Integer.valueOf(parts[1]);
                first.add(amount);
            }else if(command.equals("move")){
                int amount=Integer.valueOf(parts[1]);
                first.move(amount, second);
            }else if(command.equals("remove")){
                int amount=Integer.valueOf(parts[1]);
                second.remove(amount);
            }
            

        }

    }

}
