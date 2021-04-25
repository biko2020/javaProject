
public class Main {

    public static void main(String[] args) {
        
        SimpleDate firstDate = new SimpleDate(17, 02, 1974);
        SimpleDate secondDate = new SimpleDate(19, 10, 1987);
        
        Person firstPerson = new Person("ait oufkir", firstDate,178,80);
        Person secondPerson = new Person("abderrahmani",secondDate,176,58);
        
        
        if(firstPerson.equals(secondPerson)){
            System.out.println("identical twins");
        }
        if(!firstPerson.equals(secondPerson)){
            System.out.println("not identical twins");
        }
        // you can write code here to try out your program

        
    }
}
