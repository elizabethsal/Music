package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static final String[] MUSICAL_COMPOSITIONS = {"The Origins of Slash", "Face in the Crowd", "Instantly Turned On", "The Sound of LA", "Sore Thumb", "Right in Your Face", "Breaking In", "The Phoenix Incident", "Bad Gigs", "The Jiggalo", "How Metal", "The Sweet Lick", "The Brown Stone", "Down for the Count", "Stressed Out",
            "Heathens", "Chlorine", "Ride", "Nico and the Niners", "Hometown", "Heavydirtysoul", "Jumpsuit", "Я так соскучился", "la di die", "Seven Nation Army"};

    public static final List<String> MUSICAL_GENRE = Arrays.stream(new String[]{"Hard rock", "Pop", "Indie", "Rock"}).toList();
    public static final int MIN_DURATION = 1;
    public static final int MAX_DURATION = 7;
    public static final int MIN_NUMBER_OF_SONG = 3;
    public static final int MAX_NUMBER_OF_SONG = 10;


    public static void main(String[] args) {

        Random random = new Random();
        int randomCompositionCount = random.nextInt(MAX_NUMBER_OF_SONG - MIN_NUMBER_OF_SONG) + MIN_NUMBER_OF_SONG;

        ArrayList<Composition> compositions = new ArrayList<>();

        for (int i = 0; i <= randomCompositionCount; i++) {
            int composition_duration = random.nextInt(MAX_DURATION - MIN_DURATION) + MIN_DURATION;
            String randomName = MUSICAL_COMPOSITIONS[random.nextInt(MUSICAL_COMPOSITIONS.length)];
            String randomStyle = MUSICAL_GENRE.get(random.nextInt(MUSICAL_GENRE.size()));

            compositions.add(new Composition(randomStyle, randomName, composition_duration));
        }

        Disk diskOne = new Disk(compositions, "Disk One");

        for (Composition composition : diskOne.getSorted()) {
            System.out.println(composition);
        }
    }
}
