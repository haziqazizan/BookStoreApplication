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
public class Description {
   
    private String Name;
    private String Type;
    

    public Description(String Name, String Type) {
     
        this.Name = Name;
        this.Type = Type;
  
    }

    public Description() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    @Override
    public String toString() {
        return "Description : " 
               +"\nName   = " + Name + 
                "\nType   = " + Type ;
    }
    
}
