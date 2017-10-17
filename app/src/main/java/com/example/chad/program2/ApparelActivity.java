package com.example.chad.program2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ApparelActivity extends Activity {
    public static final String EXTRA_APPARELID = "apparelId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apparel);

        //Get the shoe from the intent
        int apparelId = (Integer)getIntent().getExtras().get(EXTRA_APPARELID);
        Apparel apparel = Apparel.APPARELs[apparelId];

        //Populate the shoe name
        TextView name = (TextView)findViewById(R.id.name);
        name.setText(apparel.getName());

        //Populate the shoe description
        TextView description = (TextView)findViewById(R.id.description);
        description.setText(apparel.getDescription());

        //Populate the shoe image
        ImageView photo = (ImageView)findViewById(R.id.photo);
        photo.setImageResource(apparel.getImageResourceId());
        photo.setContentDescription(apparel.getName());
    }
}
