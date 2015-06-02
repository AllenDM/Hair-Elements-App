package com.example.hairelementsapp;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;  

public class MerchantFeed extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merchant_feed);
    
    
        
        
    Button buttonOne =(Button)findViewById(R.id.buttonEditStoreItem);
    Button buttonTwo =(Button)findViewById(R.id.buttonEditFlashSale);
    Button buttonThree =(Button)findViewById(R.id.buttonEditCouponOffer);
    
    
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
    		Intent intent = new Intent(getApplicationContext(), HomeFeedActivity.class);
    		startActivity(intent);
    	}
    });
  
  buttonThree.setOnClickListener(new OnClickListener() {
  	
  	@Override
  	public void onClick(View arg0){
  		Intent intent = new Intent(getApplicationContext(), HomeFeedActivity.class);
  		startActivity(intent);
  	}
  });
  
    
    	
  }
}
