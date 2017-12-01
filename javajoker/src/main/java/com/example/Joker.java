package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Joker {

    public String tellJoke() {
        Random r = new Random();

        return jokes[r.nextInt(jokes.length)];
    }

    private static final String[] jokes = {
        "Microsoft gives you Windows, Linux gives you a home!",
        "If con is the opposite of pro, then isn’t Congress the opposite of progress?",
        "My sister-in-law was teaching Sunday school class. The topic for the day: Easter Sunday and the \u2028resurrection of Christ.",
    };



}
