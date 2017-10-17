package com.example.chad.program2;

/**
 * Created by davidg on 30/04/2017.
 */

public class Accessories {
    private String name; private String description; private int imageResourceId;
    //shoes is an array of Shoes
    public static final Accessories[] ACCESSORIEs = {
            new Accessories("Nike Vapor Energy Training Backpack", "You work hard enough at the " +
                    "gym. You don't need anything else weighing you down. Hold gear without adding" +
                    " extra bulk with the Nike Max Air Vapor Energy Backpack.\n" +
                    "\n" +
                    "Lightweight, Max Air cushioned shoulder straps deliver comfort and premium " +
                    "protection for essential equipment, while durable, water-resistant tarpaulin " +
                    "fabric keeps gear dry and protected in bad weather, locker rooms, or on wet " +
                    "fields.", R.drawable.backpack),
            new Accessories("Under Armour Stars & Stripes Unrivaled Crew Socks", "Patriotic pride" +
                    " reigns supreme on the Men's Under Armour Stars & Stripes Unrivaled Crew " +
                    "Socks.", R.drawable.socks),
            new Accessories("Jason Markk Premium Shoe Cleaner Starter Kit", "Get everything you " +
                    "need to keep your favorite sneakers in impeccable shape with the Jason Markk" +
                    " Premium Shoe Cleaner Starter Kit. This kit includes a 2 ounce bottle of " +
                    "premium sneaker cleaning solution and Jason Markk standard brush.\n" +
                    "\n" +
                    "Safe and 98.3% natural and biodegradable, the Premium Sneaker Solution " +
                    "effectively conditions and cleans all materials. Free from harsh chemicals " +
                    "and abrasives, you can be sure your sneakers are protected as you're cleaning" +
                    " them. The easy-to-use brush features synthetic bristles and a handcrafted" +
                    " wood handle with Jason Markk logo stamp. Great for all-around cleaning, " +
                    "this brush tackles tough stains and dirt.", R.drawable.cleaner)
    };

    //Each Drink has a name, description, and an image resource
    private Accessories(String name, String description, int imageResourceId) {
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
