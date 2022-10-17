// Student Name 	: Dean Pegman Browne
// Student Id Number: C00272087
// Date 			: 13/10/2022
// Purpose 			: Continuous Assessment exercise 1

public class Book{

    //Variables
    private int ISBN;
    private String author;
    private String name;
    private String genre;
    private char status;
    private static int noOfBooks;
    private static int nextISBN = 1;

    //Constructors
    public Book(String name,String author, String genre){
        super();
        setName(name);
        setAuthor(author);
        setGenre(genre);
        setStatus('A');
    }

    //Getters & Setters
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public Int getISBN(){
        return ISBN;
    }

    public void setISBN(int ISBN){
        ISBN = ISBN;
    }

    public String getGenre(){
        return genre;
    }

    public void setGenre(String Genre){
        this.genre = genre;
    }

    public char getStatus(){
        return status;
    }

    public void setStatus(char status){
        this.status = status;
    }


    //toString


}