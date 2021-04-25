public class Archive {
 
    private String identifier;
    private String name;
    
    public Archive(String identifier, String name){
        this.identifier = identifier;
        this.name=name;
        
    }
    
    public String toString(){
        return this.identifier +": "+ this.name;
    }
      
    // our method equals to create object
 
    public boolean equals(Object compared){
        
        if(this == compared){
            return true;
        }
        
        if(!(compared instanceof Archive )){
            return false;
    }
    
    Archive ObjArchive = (Archive) compared;
    return this.identifier.equals(ObjArchive.identifier);
    }
}