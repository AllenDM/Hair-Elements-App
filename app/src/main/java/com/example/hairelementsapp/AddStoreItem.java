package com.example.hairelementsapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import com.parse.Parse;

public class AddStoreItem extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_store_item);


        Button buttonOne =(Button)findViewById(R.id.buttonPostItem);
        Button buttonTwo =(Button)findViewById(R.id.buttonCancelPost);

        buttonOne.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(getApplicationContext(), HomeFeedActivity.class);
                startActivity(intent);
            }
        });


        buttonTwo.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0){
                Intent intent = new Intent(getApplicationContext(), MerchantFeed.class);
                startActivity(intent);
            }
        });

    }
}