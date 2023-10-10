/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
public class List<Type> {

    private Type[] values;
    private int freeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.freeIndex = 0;
    }

    private void grow() {
        int newIndex = this.values.length + this.values.length / 2;
        Type[] newValues = (Type[]) new Object[newIndex];
        for (int i = 0; i < this.freeIndex; i++) {
            newValues[i] = this.values[i];
        }

        this.values = newValues;
    }

    public void add(Type value) {
        if (this.freeIndex == this.values.length) {
            this.grow();
        }
        this.values[freeIndex] = value;
        this.freeIndex++;
    }

    public boolean contains(Type value) {
        return this.indexOfValue(value) >= 0;
    }

    public int indexOfValue(Type value) {
        for (int i = 0; i < this.freeIndex; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < this.freeIndex - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }

    public void remove(Type value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }

        moveToTheLeft(indexOfValue);
        this.freeIndex--;
    }

    public Type value(int index) {
        if (index < 0 || index >= this.freeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.freeIndex + "]");
        }

        return this.values[index];
    }

    public int size(){
        return this.freeIndex;
    }
}
