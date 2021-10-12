package com.company;

import java.util.ArrayList;

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

    public int getDuration(){
        int duration = 0;
        for(Composition composition: compositions){
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
