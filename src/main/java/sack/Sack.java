package sack;

import java.util.Arrays;

public class Sack {
    private int[] array;
    private int size = 0;

    public Sack(){
        array = new int[size];
    }

    public void add(int element) {
        size++;
        int[] newArray = Arrays.copyOf(array,size);
        newArray[newArray.length-1] = element;
        array = newArray;
    }

    public int get(int index) {
        return array[index];
    }

    public void removeLast() {
        size--;
        array = Arrays.copyOf(array,size);
    }

    public void removeByIndex(int index) {
        for (int i = index; i < array.length-1; i++) {
            array[i] = array[i+1];
        }
        size--;
        array = Arrays.copyOf(array,size);
    }

    public boolean contains(int element) {
        for (int el : array) {
            if (el == element) {
                return true;
            }
        }
        return false;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "Sack{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
