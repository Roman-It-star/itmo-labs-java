package labs.java.lab5;
import java.util.Scanner;

public class InputReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static String readLine(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }
}
