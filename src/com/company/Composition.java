package com.company;

public class Composition implements Comparable {

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

    @Override
    public int compareTo(Object o) {
        //   int indexOfPop = Main.MUSICAL_GENRE.indexOf("Pop");
        if (!(o instanceof Composition)) return 0;
        Composition composition = (Composition) o;
        int indexCurrent = Main.MUSICAL_GENRE.indexOf(style);
        int indexNew = Main.MUSICAL_GENRE.indexOf(composition.style);
        if (indexCurrent < indexNew) {
            return -1;
        }
        if (indexCurrent > indexNew) {
            return 1;
        }
        return 0;
    }
}
