package com.example.hairelementsapp;


import android.app.Application;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import com.parse.Parse;
import com.parse.ParseObject;

public class TitleScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.title_screen);


        
        
    Button buttonOne =(Button)findViewById(R.id.merchantLoginButton);
    Button buttonTwo =(Button)findViewById(R.id.userLoginButton);
    
    buttonOne.setOnClickListener(new OnClickListener() {
    	
    	@Override
    	public void onClick(View arg0){
    		Intent intent = new Intent(getApplicationContext(), MerchantLoginScreen.class);
    		startActivity(intent);
    	}
    });
    	
    
buttonTwo.setOnClickListener(new OnClickListener() {
    	
    	@Override
    	public void onClick(View arg0){
    		Intent intent = new Intent(getApplicationContext(), UserLoginScreen.class);
    		startActivity(intent);
    	}
    });
    
    
    
    
    
    
    
  }
}
