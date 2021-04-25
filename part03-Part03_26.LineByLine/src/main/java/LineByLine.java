
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String[] text = string.split(" ");
        
        if (!string.isEmpty()) {

            for (int i = 0; i < text.length; i++) {
                System.out.println(text[i]);
            }
        }
    }
}
