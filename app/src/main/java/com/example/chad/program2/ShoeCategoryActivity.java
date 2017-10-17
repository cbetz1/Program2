package com.example.chad.program2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShoeCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoe_category);
        ArrayAdapter<Shoe> listAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, Shoe.SHOEs);
        ListView listShoes = (ListView) findViewById(R.id.list_shoes);
        listShoes.setAdapter(listAdapter);

        //Create the listener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listDrinks,
                                            View itemView,
                                            int position,
                                            long id) {
                        //Pass the shoe the user clicks on to ShoeActivity
                        Intent intent = new Intent(ShoeCategoryActivity.this,
                                ShoeActivity.class);
                        intent.putExtra(com.example.chad.program2.ShoeActivity.EXTRA_SHOEID, (int) id);
                        startActivity(intent);
                    }
                };

        //Assign the listener to the list view
        listShoes.setOnItemClickListener(itemClickListener);
    }
}
