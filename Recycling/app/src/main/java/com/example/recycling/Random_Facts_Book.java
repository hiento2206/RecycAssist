package com.example.recycling;
import java.util.Random;
public class Random_Facts_Book {

    public String[] mFacts = {"27,000 trees are cut down each day so we can have Toilet Paper!",
            "Aluminum can be recycled continuously, as in forever!",
            "Recycling 1 aluminum can save enough energy to run our TVs for at least 3 hours!",
            "American companies alone use enough Paper to encircle the Earth 3x!",
            "We can save 75,000 trees if we recycled the paper used on the daily run of the New York Times alone!",
            "When you throw plastic bags and other plastic materials in the ocean, it kills as many as 1 million sea creatures annually!",
            "A glass bottle made in our time will take more than 4,000 years to decompose!",
            "Only 1% of our planet’s water supply can be used. 97% is ocean water and 2% is frozen solid in the Arctic, for now!",
            "Our planet gains inhabitants numbering to 77 million people a year!",
            "An estimated 50,000 species inhabiting our tropical forests become extinct annually. That’s an average of 137 species a day!",
            "Rainforests are cut down at a rate of 100 acres per minute!",
            "The world’s oldest trees are more than 4,600 years old!",
            "Landfills are composed of 35% packaging materials!",
            "Plastic number 5 is the best for microwaving, 1 2 4 are sometimes safe, and 3 6 7 are not safe!",
            "Enough Plastic Bottles are Tossed Each Year to Circle the Planet Four Times!",
            "Americans Throw Away Enough Trash in an Average Year to Circle Earth 24 times!",
            "It Takes Centuries for a Disposable Diaper to Break Down in a Landfill!",
            "25 Billion Styrofoam Cups are Trashed Each Year!",
            "Recycling Aluminum Cans Saves 95% of the Energy Used to Make New Cans!",
            "In a Recent Year, Americans Recovered, Reused, or Recycled 34% of Waste Generated!",

    };
    public String getFact() {
        String fact = "";
        Random rm = new Random();
        int rn = rm.nextInt(mFacts.length);
        fact = mFacts[rn];
        return fact;

    }
}
