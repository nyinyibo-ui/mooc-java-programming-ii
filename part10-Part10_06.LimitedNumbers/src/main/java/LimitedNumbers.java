
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            Integer number = Integer.valueOf(scanner.nextLine());

            if (number == -1) {
                break;
            }

            numbers.add(number);
        }

        numbers.stream()
                .filter(n -> n >= 1 & n <= 5)
                .forEach(num -> System.out.println(num));
    }
}
