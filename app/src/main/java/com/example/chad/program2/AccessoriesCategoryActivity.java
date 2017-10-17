package com.example.chad.program2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AccessoriesCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessories_category);
        ArrayAdapter<Accessories> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Accessories.ACCESSORIEs);
        ListView listAccessories = (ListView) findViewById(R.id.list_accessories);
        listAccessories.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the shoe the user clicks on to ShoeActivity
                        Intent intent = new Intent(AccessoriesCategoryActivity.this,
                                AccessoriesActivity.class);
                        intent.putExtra(AccessoriesActivity.EXTRA_ACCESSORIESID, (int) id);
                        startActivity(intent);
                    }
                };

        //Assign the listener to the list view
        listAccessories.setOnItemClickListener(itemClickListener);
    }
}
