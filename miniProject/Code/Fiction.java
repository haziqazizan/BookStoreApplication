package miniProject.Code;

/**
 *
 * @author nisaa
 */
public class Fiction extends Book{
   protected int BookAgeAppropriate;

    public Fiction(int BookAgeAppropriate, String BookGenre, String BookPublisher, String BookAuthor, String Title, int ID, Description desc, double Price, int Quantity) {
        super(BookGenre, BookPublisher, BookAuthor, Title, ID, desc, Price, Quantity);
        this.BookAgeAppropriate = BookAgeAppropriate;
    }

    public Fiction() {
      
    }

    public int getBookAgeAppropriate() {
        return BookAgeAppropriate;
    }

    public void setBookAgeAppropriate(int BookAgeAppropriate) {
        this.BookAgeAppropriate = BookAgeAppropriate;
    }

    @Override
    public String toString() {
        return "Fiction : " + "\nBookAgeAppropriate = " + BookAgeAppropriate + "\n"+super.toString();
    }
   
    
}
