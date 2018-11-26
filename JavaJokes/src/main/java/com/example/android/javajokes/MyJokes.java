package com.example.android.javajokes;


import java.util.Random;

public class MyJokes {

    private String[] jokes;
    private Random random;

    public MyJokes() {

        jokes = new String[7];
        jokes[0] = "Thanks to autocorrect, 1 in 5 children will be getting a visit from Satan this Christmas.";
        jokes[1] = "What does a king computer do?\n Execute his programs!";
        jokes[2] = "I just got fired from my job at the keyboard factory. They told me I wasn\'t putting in enough shifts.";
        jokes[3] = "I saw a driver texting and driving.\nIt made me so mad I threw my beer at him.";
        jokes[4]= "Why is 6 afraid of 7? Because 7 is a registered 6 offender.";
        jokes[5]= "I told my doctor that I broke my arm in two places. He told me to stop going to those places.";
        jokes[6]="What do you call it when Batman skips church? Christian Bale.";
        random = new Random();
    }

    public String tellJoke() {
        return jokes[random.nextInt(jokes.length)];
    }
}

