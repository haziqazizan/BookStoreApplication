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
public class Stationaries extends Product {
   protected String StationariesBrand ;

    public Stationaries(String StationariesBrand, int ID, Description desc, double Price, int Quantity) {
        super(ID, desc, Price, Quantity);
        this.StationariesBrand = StationariesBrand;
    }

    public Stationaries() {
        
    }

    public String getStationariesBrand() {
        return StationariesBrand;
    }

    public void setStationariesBrand(String StationariesBrand) {
        this.StationariesBrand = StationariesBrand;
    }

    @Override
    public String toString() {
        return  " StationariesBrand = " + StationariesBrand + "\n"+super.toString();
    }
   
   
   
}
