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
import java.util.Map;

public class IOU {

    private HashMap<String, Double> iouMap = new HashMap<>();

    public IOU() {
    }

    public void setSum(String toWhom, double amount) {
        iouMap.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for (Map.Entry<String, Double> iouMap : iouMap.entrySet()) {
            if (iouMap.getKey().equalsIgnoreCase(toWhom)) {
                return iouMap.getValue();
            }
        }
        return 0;
    }

}