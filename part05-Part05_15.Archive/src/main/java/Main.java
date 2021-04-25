import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            // ask user to input identifier
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            // test if identifier is empty
            if (identifier.isEmpty()) {
                break;
            }
            // ask user to input name  
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            // test if the name is empty
            if (name.isEmpty()) {
                break;
            }
            // create and use object
            Archive archive = new Archive(identifier, name);

            // add archie in archives
            if (!(archives.contains(archive))) {
                archives.add(archive);
            }
        }// end while
        System.out.println("==Items==");
        // print all archives
        for (Archive Element : archives) {
            System.out.println(Element);
        }
    }
}