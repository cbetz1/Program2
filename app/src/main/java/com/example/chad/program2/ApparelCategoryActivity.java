package com.example.chad.program2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ApparelCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apparel_category);
        ArrayAdapter<Apparel> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Apparel.APPARELs);
        ListView listApparels = (ListView) findViewById(R.id.list_apparel);
        listApparels.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the apparel the user clicks on to ApparelActivity
                        Intent intent = new Intent(ApparelCategoryActivity.this,
                                ApparelActivity.class);
                        intent.putExtra(ApparelActivity.EXTRA_APPARELID, (int) id);
                        startActivity(intent);
                    }
                };

        //Assign the listener to the list view
        listApparels.setOnItemClickListener(itemClickListener);
    }
}
