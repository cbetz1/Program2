package com.example.chad.program2;

/**
 * Created by davidg on 30/04/2017.
 */

public class Shoe {
    private String name; private String description; private int imageResourceId;
    //shoes is an array of Shoes
    public static final Shoe[] SHOEs = {
            new Shoe("Nike Air VaporMax Flyknit", "Over 7 years in the making, the Men's Nike Air" +
                    " VaporMax Flyknit Running Shoes are a transcendent revolution. Completely " +
                    "transforming the standard Air Max, the VaporMax beautifully blends a Flyknit" +
                    " upper with responsive cushioning for the lightest, most flexible Air Max ever" +
                    ".", R.drawable.flynit),
            new Shoe("Nike Kyrie 3", "Designed to match the razor-sharp game of one of the league's" +
                    " best, the Men's Nike Kyrie 3 Basketball Shoes will have you slicing through" +
                    " opposing defenses with ease.", R.drawable.kyrie),
            new Shoe("adidas NMD Runner", "A fusion of the best adidas technologies and progressive" +
                    " street style collide for the Men's adidas NMD Runner R1 Casual Shoes. If you" +
                    " are looking for the perfect kicks to stand up to your wardrobe look no " +
                    "further than the adidas NMD R1 Casual Shoes", R.drawable.nmd)
    };

    //Each Drink has a name, description, and an image resource
    private Shoe(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
