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
public class Book extends Product {
    protected String BookGenre ;
    protected String BookPublisher ; 
    protected String BookAuthor ;
    protected String Title ;

    public Book(String BookGenre, String BookPublisher, String BookAuthor,String Title, int ID, Description desc, double Price, int Quantity) {
        super (ID, desc, Price, Quantity);
        this.BookGenre = BookGenre;
        this.BookPublisher = BookPublisher;
        this.BookAuthor = BookAuthor;
        this.Title = Title;
    }

    public Book() {
        
    }

    public String getBookGenre() {
        return BookGenre;
    }

    public void setBookGenre(String BookGenre) {
        this.BookGenre = BookGenre;
    }

    public String getBookPublisher() {
        return BookPublisher;
    }

    public void setBookPublisher(String BookPublisher) {
        this.BookPublisher = BookPublisher;
    }

    public String getBookAuthor() {
        return BookAuthor;
    }

    public void setBookAuthor(String BookAuthor) {
        this.BookAuthor = BookAuthor;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    @Override
    public String toString() {
        return "BookGenre       = " + BookGenre + 
               "\nBookPublisher = " + BookPublisher + 
               "\nBookAuthor    = " + BookAuthor + 
               "\nTitle         = " + Title +
               "\n"+super.toString();
    }
    
    
    
}

