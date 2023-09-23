
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs=new ArrayList<>();
        // Write your program here
        
        while (true){
            String row =scanner.nextLine();
            if (row.equals("end")){
                break;
            }
            
            inputs.add(row);
        }
        
        double average=inputs.stream()
                .mapToInt(s-> Integer.valueOf(s))
                .average()
                .getAsDouble();
                
        System.out.println("average of the numbers: "+average);
    }
}
