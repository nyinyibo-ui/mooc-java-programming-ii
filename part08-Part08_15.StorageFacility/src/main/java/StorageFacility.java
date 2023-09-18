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

public class StorageFacility {

    HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String storageItem) {
        // emplty list is created 
        this.storage.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> store = this.storage.get(unit);
        store.add(storageItem);

    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.get(storageUnit) == null) {
            return new ArrayList<>();
        } else {
            return this.storage.get(storageUnit);
        }
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> store = this.storage.get(storageUnit);

        store.remove(item);
        if (store.isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storesList = new ArrayList<>();
        for (String unit : this.storage.keySet()) {
            storesList.add(unit);
        }
        return storesList;
    }
}
