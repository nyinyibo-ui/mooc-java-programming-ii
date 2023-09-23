
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(-9);
        numbers.add(5);
        numbers.add(4);
        
        System.out.println(positive(numbers));
        
    }

    public static List<Integer> positive(List<Integer> numbers) {
        List<Integer> values = numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toCollection((ArrayList::new)));

        return values;
    }

}
