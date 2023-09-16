/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.HashMap;
public class Abbreviations {
    private HashMap<String,String> directory;

    public Abbreviations(){
        this.directory=new HashMap<>();
    }
    
    //add new abbreviations
    public void addAbbreviation(String abbreviation,String explanation){
        // if the abbreviatins is already exists
        if (this.hasAbbreviation(abbreviation)){
            System.out.println("The abbreviations has already been added");
        }else{
            directory.put(abbreviation,explanation);
        }
    }
    
    //checks if an abbreviation has already been added;
    public boolean hasAbbreviation(String abbreviation){
        return this.directory.containsKey(abbreviation);
    }
    
    //finds the explanation for an abbreviation;
    public String findExplanationFor(String abbreviation){
        // find the explanation if exits
        if(this.hasAbbreviation(abbreviation)){
            return this.directory.get(abbreviation);
        }else {
            return null;
        }
    }

}


