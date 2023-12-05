import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int value = 0;

        // Read input.txt
        Main main = new Main();
        List<String> strings = main.readFile("input.txt");

        // Calculate answer
        for (String s : strings) {
            String replacedString = s.replaceAll("[^\\d.]", "");
            String firstDigit = Character.toString(replacedString.charAt(0));
            String secondDigit = replacedString.substring(replacedString.length() - 1);
            int number = Integer.parseInt(firstDigit + secondDigit);
            value += number;
        }

        System.out.println(value);

    }

    public List<String> readFile(String fileName) {
        File file = new File(getClass().getResource(fileName).getPath());
        List<String> lines = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return lines;
    }

}