package collections.optionalTask;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String path = "src/main/java/collections/optionalTask/task1.txt";
        List<String> listOfStrings = Files.readAllLines(Paths.get(path));
        System.out.println(listOfStrings);
        FileWriter writer = new FileWriter(path, false);
        for (int i = listOfStrings.size()-1; i >= 0; i--) {
            writer.write(listOfStrings.get(i) + '\n');
        }
        writer.close();
    }


}
