package com.example.chad.program2;


public class Apparel {
    private String name; private String description; private int imageResourceId;
    //apparels is an array of Apparels
    public static final Apparel[] APPARELs = {
            new Apparel("Nike Equality Basketball T-Shirt", "Work on your game and support a great" +
                    " cause. The Men's Nike Equality Basketball T-Shirt is inspired by Nike's " +
                    "dedication to promoting diversity and inclusion.", R.drawable.shirt),
            new Apparel("Under Armour Sportstyle Short-Sleeve Hoodie", "The Men's Under Armour " +
                    "Sportstyle Short-Sleeve Hoodie is far from the average hoodie.", R.drawable.sweatshirt),
            new Apparel("adidas Tiro Training Pants", "Achieve classic adi style with the Men's " +
                    "adidas Tiro Training Pants. Ventilated climacool technology keeps you cool" +
                    " and dry, while the mesh insert below the back waist provides additional" +
                    " breathability. Front zip pockets provide the perfect storage for all of" +
                    " your daily essentials. Tonal 3-stripes on the sides of the pants gives " +
                    "these pants the iconic adi look. The adidas Tiro Training Pants allow you" +
                    " to take your training to the next level without overheating.", R.drawable.pants)
    };

    //Each Drink has a name, description, and an image resource
    private Apparel(String name, String description, int imageResourceId) {
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
