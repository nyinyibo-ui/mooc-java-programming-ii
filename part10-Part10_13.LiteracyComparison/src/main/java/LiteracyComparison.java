
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<Literacy> literacy=readFile("literacy.csv");
        
        literacy.stream().sorted((l1,l2)->{
            return Float.compare(l1.getPct(), l2.getPct());
    })
                .forEach(l-> System.out.println(l));
    }
    
    public static ArrayList<Literacy> readFile(String fileName){
                ArrayList<Literacy> list = new ArrayList<>();

        try {
            Files.lines((Paths.get(fileName)))
                    .map(row -> row.split(",")) //splits the row on the comma
                    
                    .map(parts -> new Literacy(parts[3], Integer.valueOf(parts[4]), parts[2], Float.valueOf(parts[5])))   //creates a book 
                    .forEach(literacy -> list.add(literacy)); //loops and adds Book to arrayList books

            // .forEach(row -> rows.add(row));
        } catch (Exception e) {

            System.out.println("Error reading file" + e.getMessage());
        }

        return list;
    }
}
