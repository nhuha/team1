import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(new FileReader("src/main/resources/songs.txt"));
        ArrayList<String> listOfLines = new ArrayList();
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            listOfLines.add(str);
        }
        System.out.println(listOfLines);
        scanner.close();


    }
}
