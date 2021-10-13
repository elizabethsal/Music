package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Disk {

    private ArrayList<Composition> compositions;
    private String name;

    public Disk(ArrayList<Composition> compositions, String name) {
        this.compositions = compositions;
        this.name = name;
    }

    public ArrayList<Composition> getCompositions() {
        return compositions;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Composition> getSorted() {
        Collections.sort(compositions);
        return compositions;
    }

    public int getDuration() {
        int duration = 0;
        for (Composition composition : compositions) {
            duration += composition.getDuration();
        }
        return duration;
    }


    @Override
    public String toString() {
        return "Disk{" +
                "compositions=" + compositions +
                ", name='" + name + '\'' +
                '}';
    }
}
