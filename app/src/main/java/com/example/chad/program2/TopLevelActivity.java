package com.example.chad.program2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class TopLevelActivity extends Activity {

    private ShareActionProvider shareActionProvider;

    public TopLevelActivity(ShareActionProvider shareActionProvider) {
        this.shareActionProvider = shareActionProvider;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_level);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //Create an OnItemClickListener
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> listView,
                                            View itemView,
                                            int position,
                                            long id) {
                        if (position == 0) {
                            Intent intent = new Intent(TopLevelActivity.this,
                                    ShoeCategoryActivity.class);
                            startActivity(intent);
                        }if (position == 1) {
                            Intent intent = new Intent(TopLevelActivity.this,
                                    ApparelCategoryActivity.class);
                            startActivity(intent);
                        }if (position == 2) {
                            Intent intent = new Intent(TopLevelActivity.this,
                                    AccessoriesCategoryActivity.class);
                            startActivity(intent);
                        }

                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView) findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
    }

    private void setShareActionIntent(String text) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, text);
        shareActionProvider.setShareIntent(intent);
    }

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_create_order:
                Intent intent = new Intent(this, OrderActivity.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
*/
}
