package OOP.incapsulation;


import collections.ListEllement;

import java.util.Iterator;

/**
 * Created by RMysholovka on 15.10.2015.
 */
public class ImprovedArray {
    private Comparable[] arrayList;
    private int counter;

    public ImprovedArray() {
        arrayList = new Comparable[4];
        counter = 0;
    }

    public void add(Comparable value) {
        if (counter == arrayList.length) {
            Comparable[] arrayAnother = new Comparable[arrayList.length * 2];
            for (int i = 0; i < arrayList.length; i++) {
                arrayAnother[i] = arrayList[i];
            }
            arrayList = arrayAnother;
        }
        arrayList[counter] = value;
        counter++;

    }


    public Comparable get(int index) {

        return arrayList[index];
    }

    public int size() {
        return counter;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (!(otherObject instanceof ImprovedArray)) return false;
        ImprovedArray other = (ImprovedArray) otherObject;
        if (this.arrayList.length != other.arrayList.length) return false;
        for (int i = 0; i > arrayList.length; i++) {
            if (!this.arrayList[i].equals(other.arrayList[i])) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < counter; i++) {
            string = string + arrayList[i] + ", ";
        }
        return string;
    }


    public boolean contains(Comparable object) {
        for (int i = 0; i < counter; i++) {
            if (arrayList[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        if (arrayList.length <= index) return;
        arrayList[index] = null;
        for (int i = index; i < counter - 1; i++) {
            arrayList[i] = arrayList[i + 1];
        }
        counter--;
    }

    public void substitution(Comparable trap, int i) {
        arrayList[i] = trap;

    }

    public void insert(Comparable comparable, int i) {
        Comparable time = arrayList[i + 1];
        Comparable time2 = null;
        arrayList[i + 1] = arrayList[i];
        arrayList[i] = comparable;
        for (i = i + 1; i < counter; i++) {
            time2 = arrayList[i + 1];
            arrayList[i + 1] = arrayList[i];


        }


    }

    public boolean checkIsempty() {
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i] != null) return false;
        }
        return true;
    }


    public void purification() {
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = null;
        }
        counter = 0;
    }

    public void remove(Comparable squ) {
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList[i].equals(squ)) {
                this.remove(i);
            }

        }

    }

    public void sort() {
        for (int i = 0; i < arrayList.length; i++) {
            for (int j = i + 1; j < arrayList.length; j++) {

                Comparable first = arrayList[i];
                Comparable second = arrayList[j];

                int g = first.compareTo(second);

                if (g > 0) {
                    Comparable temp = arrayList[i];
                    arrayList[i] = arrayList[j];
                    arrayList[j] = temp;
                }
            }
        }

    }



}

