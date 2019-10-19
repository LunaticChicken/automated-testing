package collections.optionalTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Task6 {
    public static void main(String[] args) throws IOException {
        String path = "src/main/java/collections/optionalTask/task6.txt";
        List<String> listOfStrings = Files.readAllLines(Paths.get(path));
        Collections.sort(listOfStrings);
        System.out.println(listOfStrings);
    }
}
