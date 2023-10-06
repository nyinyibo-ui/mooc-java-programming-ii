/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Map;
import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author alexe
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private File file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.file = new File(file);
    }

    public boolean load() {
        try {
            Scanner scanner = new Scanner(Paths.get(file.getName()));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character

                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file.getName());
            for (String item : this.dictionary.keySet()) {
                writer.println(item + ":" + this.dictionary.get(item));
            }

            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error" + e);
            return false;
        }

    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
    }

    public String translate(String word) {
        for (String item : this.dictionary.keySet()) {
            if (this.dictionary.get(item).equals(word)) {
                return item;
            } else if (this.dictionary.get(word) != null) {
                return this.dictionary.get(word);
            }
        }

        return null;
    }

    public void delete(String word) {
        String itemToRemove = "";
        for (String item : this.dictionary.keySet()) {
            if (this.dictionary.get(item).equals(word)) {
                itemToRemove = item;
            } else if (this.dictionary.get(word) != null) {
                itemToRemove = word;
            }

        }

        this.dictionary.remove(itemToRemove);
    }
}
