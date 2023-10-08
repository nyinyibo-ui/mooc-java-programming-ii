/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.List;
import java.util.ArrayList;

public class Hideout <T>{
    private T hideout;
    
    public Hideout(){
        this.hideout=null;
    }
    
    public void putIntoHideout (T toHide){
        if (this.hideout==toHide){
            this.hideout=null;
        }else{
            this.hideout=toHide;
        }
    }
    
    public T takeFromHideout(){
        T hiden=this.hideout;
        this.hideout=null;
        return hiden;
    }
    
    public boolean isInHideout(){
        if(this.hideout==null){
            return false;
        }else{
            return true;
        }
    }
    
}
