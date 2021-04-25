
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Object compared) {

        // if variables they are equals
        if (this == compared) {
            return true;
        }

        // if object is note type of book
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert the object to book Object
        Book ObjBook = (Book) compared;

        return this.name.equals(ObjBook.name) && this.publicationYear == ObjBook.publicationYear;

    }

}
