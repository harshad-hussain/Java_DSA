package LibraryManagementSystem;

public class Book {

    private int BookId;

    private String BookName;

    static int totalBooks;
    private String BookAuthor;

    public int getBookId(){
        return BookId;
    }

    public void setBookId(int BookId){
        this.BookId = BookId;
    }

    public String getBookName(){
        return BookName;
    }

    public void setBookName(String BookName){
        this.BookName = BookName;
    }

    public String getBookAuthor(){
        return BookAuthor;
    }

    public void setBookAuthor(String BookAuthor){
        this.BookAuthor = BookAuthor;
    }
    
}
