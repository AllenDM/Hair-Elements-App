package com.example.hairelementsapp;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;  

public class MerchantLoginScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.merchant_login_screen);
    
    
        
        
    Button buttonOne =(Button)findViewById(R.id.merchantRegistrationButton);
    Button buttonTwo =(Button)findViewById(R.id.merchantFeedButton);
    
    buttonOne.setOnClickListener(new OnClickListener() {
    	
    	@Override
    	public void onClick(View arg0){
    		Intent intent = new Intent(getApplicationContext(), MerchantRegistration.class);
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
