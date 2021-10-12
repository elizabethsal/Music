package com.company;

public class Composition {

    private String style;
    private String name;
    private int duration;

    public Composition(String style, String name, int duration) {
        this.style = style;
        this.name = name;
        this.duration = duration;
    }


    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Composition{" +
                "style='" + style + '\'' +
                ", name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
