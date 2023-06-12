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
public class Electronics extends Product{
    protected String ProductBrand ;
    protected String ProductCategory ; 

    public Electronics(String ProductBrand, String ProductCategory, int ID, Description desc, double Price, int Quantity) {
        super (ID, desc,Price,Quantity); 
        this.ProductBrand = ProductBrand;
        this.ProductCategory = ProductCategory;
    }

    public Electronics() {
     
    }

    public String getProductBrand() {
        return ProductBrand;
    }

    public void setProductBrand(String ProductBrand) {
        this.ProductBrand = ProductBrand;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String ProductCategory) {
        this.ProductCategory = ProductCategory;
    }

    @Override
    public String toString() {
        return "Electronics :" 
                + "\nProductBrand  = " + ProductBrand +
                "\nProductCategory = " + ProductCategory + "\n"+super.toString();
    }

   
    
}

