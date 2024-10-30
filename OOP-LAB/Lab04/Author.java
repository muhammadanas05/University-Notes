public class Author {
    // Assignment#3 Q.2

    String name;
    String email;
    char gender;
    String books;
    static int numAuthors = 0;

    static {
        numAuthors = 0;
    }
    Author(String name, String email, char gender, String books ){

        this.name = name;
        this.email = email;
        this.gender = gender;
        this.books = books;
        numAuthors++;

    }

    void display(){
        System.out.println("Author Information");
        System.out.println("Author Name: "+ name);
        System.out.println("Author Email: "+ email);
        System.out.println("Gender: "+ gender);
        System.out.println("Book: "+ books);
    }

    public static int getNumAuthors() {
        return numAuthors;
    }

    public static void main(String[] args) {

        Author a1 = new Author("Usaid","usaid@gmail.com",'M',"Harry Potter");

        a1.display();

    }
}
