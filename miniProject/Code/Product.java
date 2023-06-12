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
public class Product {
    protected int ID;
    protected Description desc;
    protected double Price ;
    protected int Quantity ; 
    
    public Product(int ID, Description desc, double Price, int Quantity) {
        this.ID = ID;
        this.desc = desc;
        this.Price = Price;
        this.Quantity = Quantity;
    }

    public Product() {//default constructor
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Description getDesc() {
        return desc;
    }

    public void setDesc(Description desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return Price;
        }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    @Override
    public String toString() {
        return  " ID        = " + ID + 
                "\ndesc     = " + desc + 
                "\nPrice    = " + Price + 
                "\nQuantity = " + Quantity ;
    }
    
    
    
}


