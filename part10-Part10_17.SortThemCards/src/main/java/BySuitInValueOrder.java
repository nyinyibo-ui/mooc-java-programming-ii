/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import java.util.Comparator;
public class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getSuit()==o2.getSuit()){
            return o1.getValue()-o2.getValue();
        }else{
            return o1.getSuit().ordinal()-o2.getSuit().ordinal();
        }
    }
    
}
