
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        Random random = new Random();
        // the method containsNumber is probably useful
        while(true){
            if (numbers.size()>6){
                break;
            }
            int randNum=random.nextInt(40)+1;
            if (this.containsNumber(randNum)){
                continue;
            }else{
                numbers.add(randNum);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        for (int num : numbers) {
            if (num == number) {
                return true;
            }
        }
        return false;
    }
}
