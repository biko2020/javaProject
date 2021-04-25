
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {

        this.elements.add(element);

    }

    public ArrayList<String> getElements() {

        return this.elements;
    }

    public String toString() {

        String lstcaracter = "";
        String element = "element:";
        int count = 0;

        if (elements.isEmpty()) {

            return lstcaracter + "The collection " + this.name + " is empty.";
        }

        for (String caracter : elements) {

            count++;
            lstcaracter = lstcaracter + " \n " + caracter;
            if (count > 1) {
                element = "elements:";
            }
        }

        return "The collection " + this.name + " has " + count + " " + element + "\n " + lstcaracter + " \n ";
    }

}
