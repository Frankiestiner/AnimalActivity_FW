package com.fwhite.animalactivity;

import java.util.ArrayList;
import java.util.Random;

public class Fox extends Animal {

    public String say(){
        ArrayList<String> foxSays = new ArrayList<String>();
        foxSays.add("Ring-ding-ding-ding-dingeringeding!\n" +
                "Gering-ding-ding-ding-dingeringeding!");
        foxSays.add("Wa-pa-pa-pa-pa-pa-pow!\n" +
                "Wa-pa-pa-pa-pa-pa-pow!");
        foxSays.add("Hatee-hatee-hatee-ho!\n" +
                "Hatee-hatee-hatee-ho!");
        foxSays.add("Joff-tchoff-tchoffo-tchoffo-tchoff!\n" +
                "Tchoff-tchoff-tchoffo-tchoffo-tchoff!");
        foxSays.add("Morse Code?");
        foxSays.add("Jacha-chacha-chacha-chow!\n" +
                "Chacha-chacha-chacha-chow!");
        foxSays.add("Fraka-kaka-kaka-kaka-kow!\n" +
                "Fraka-kaka-kaka-kaka-kow!");
        foxSays.add("A-hee-ahee ha-hee!\n" +
                "A-hee-ahee ha-hee!");
        foxSays.add("A-oo-oo-oo-ooo!\n" +
                "Woo-oo-oo-ooo!");
        foxSays.add("Wa-wa-way-do, wub-wid-bid-dum-way-do");
        foxSays.add("Bay-budabud-dum-bam");
        foxSays.add("Mama-dum-day-do");
        foxSays.add("Abay-ba-da bum-bum bay-do");

        Random rand = new Random();
        String result = foxSays.get(rand.nextInt(foxSays.size()));

        return result;
    }
    public String play(){
        return "The fox chases mice and digs holes!";
    }
    public Fox() {
    }
}
