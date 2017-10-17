package com.example.chad.program2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShoeActivity extends Activity {
    public static final String EXTRA_SHOEID = "shoeId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoe);

        //Get the shoe from the intent
        int shoeId = (Integer)getIntent().getExtras().get(EXTRA_SHOEID);
        Shoe shoe = Shoe.SHOEs[shoeId];

        //Populate the shoe name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(shoe.getName());

        //Populate the shoe description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(shoe.getDescription());

        //Populate the shoe image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(shoe.getImageResourceId());
        photo.setContentDescription(shoe.getName());
    }
}
