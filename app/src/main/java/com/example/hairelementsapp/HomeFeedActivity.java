package com.example.hairelementsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

import com.parse.ParseUser;


public class HomeFeedActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_feed_activity);
    

ImageButton buttonOne =(ImageButton)findViewById(R.id.imageButton1);
ImageButton buttonTwo =(ImageButton)findViewById(R.id.imageButton2);
ImageButton buttonThree =(ImageButton)findViewById(R.id.imageButton3);
Button buttonFour =(Button)findViewById(R.id.buttonToStoreFromHomeFeed);
Button buttonFive =(Button)findViewById(R.id.buttonLogoutFromHomeFeed);



    buttonTwo.setOnClickListener(new OnClickListener() {
    	
    	@Override
    	public void onClick(View arg0){
    		Intent intent = new Intent(getApplicationContext(), FlashSale.class);
    		startActivity(intent);
    	}
    });
    
    
 buttonOne.setOnClickListener(new OnClickListener() {
    	
    	@Override
    	public void onClick(View arg0){
    		Intent intent = new Intent(getApplicationContext(), StoreItem.class);
    		startActivity(intent);
    	}
    });
    
 buttonThree.setOnClickListener(new OnClickListener() {
 	
 	@Override
 	public void onClick(View arg0){
 		Intent intent = new Intent(getApplicationContext(), CouponAreaDeal.class);
 		startActivity(intent);
 	}
 });
 
 buttonFour.setOnClickListener(new OnClickListener() {
	 	
	 	@Override
	 	public void onClick(View arg0){
	 		Intent intent = new Intent(getApplicationContext(), StoreSelection.class);
	 		startActivity(intent);
	 	}
	 });
 
 
 buttonFive.setOnClickListener(new OnClickListener() {
	 	
	 	@Override
	 	public void onClick(View arg0){
	 		Intent intent = new Intent(getApplicationContext(), DispatchActivity.class);
            ParseUser.logOut();
            startActivity(intent);
	 	}
	 });
 
    
  }
}
