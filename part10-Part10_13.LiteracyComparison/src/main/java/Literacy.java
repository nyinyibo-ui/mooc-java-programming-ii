/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class Literacy {
    private String country;
    private int year;
    private String gender;
    private float pct;
    
    public Literacy(String country,int year,String gender, float pct){
        this.country=country;
        this.gender=gender;
        this.year=year;
        this.pct=pct;
                
    }
    
    public float getPct(){
        return this.pct;
    }
    
    @Override 
    public String toString(){
        return this.country+" ("+this.year+"), "+String.format(this.gender.trim().split("\\s+")[0])+", "+this.pct;
    }
            
}
