
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }


    public String getName(){
        return this.name;
}    
    public SimpleDate getBirthday() {
        return this.birthday;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    // our method  equals to compare similarity of people

    public boolean equals(Object compared) {
        
        if(this == compared) {
            return true;
        }
        
        if(!(compared instanceof Person)) {
            return false;
        }
        
        Person personToCompare = (Person) compared;
        
        if(this.name == personToCompare.name 
          && this.birthday.equals(personToCompare.birthday) 
          && this.height == personToCompare.height 
          && this.weight == personToCompare.weight) {
            
          return true;
            
        }
        return false;
    }
    public String ToString(){
        return this.name + "." + this.birthday + "." + this.height + "." + this.weight;
    }
}
