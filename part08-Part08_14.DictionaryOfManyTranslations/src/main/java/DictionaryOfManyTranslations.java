/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String,ArrayList<String>> dictionary;
    
    public DictionaryOfManyTranslations(){
        this.dictionary=new HashMap<>();
        
    }
    
    public void add(String word, String translation){
        // an empty ist has to be added for a new word 
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        // add the new transatin if the translation didn't exists 
        if (!this.dictionary.get(word).contains(translation)){
            this.dictionary.get(word).add(translation);
        }
    }
    
    public ArrayList<String> translate(String word){
        ArrayList<String> result=this.dictionary.get(word);
        if (this.dictionary.get(word)==null){
            result=new ArrayList<>();
        }
        return result;
    }
    
    public void remove(String word){
        this.dictionary.remove(word);
    }
}
