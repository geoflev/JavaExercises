import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class URLs {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "/Users/geoflev/IdeaProjects/URL.txt";
        File file = new File(filename);
        readFromFile(file);
    }

    public static void readFromFile(File file) throws FileNotFoundException {
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            String line = input.nextLine();
            int index = line.indexOf(".com");
            if (line.contains("www")) {
                System.out.println(line.substring(12, index));
            } else if (line.contains("docs")) {
                System.out.println(line.substring(8, index));
            }
        }
        input.close();
    }
}
