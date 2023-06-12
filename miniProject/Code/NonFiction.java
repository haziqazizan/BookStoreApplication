/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniProject.Code;

/**
 *
 * @author nisaa
 */
public class NonFiction extends Book {
   protected String BookCategory;

    public NonFiction(String BookCategory, String BookGenre, String BookPublisher, String BookAuthor, String Title, int ID, Description desc, double Price, int Quantity) {
        super(BookGenre, BookPublisher, BookAuthor, Title, ID, desc, Price, Quantity);
        this.BookCategory = BookCategory;
    }

    public NonFiction() {
        
    }

    public String getBookCategory() {
        return BookCategory;
    }

    public void setBookCategory(String BookCategory) {
        this.BookCategory = BookCategory;
    }

    @Override
    public String toString() {
        return  "NonFiction : " + "\nBookCategory = " + BookCategory + "\n"+super.toString();
    }
    
   
}
