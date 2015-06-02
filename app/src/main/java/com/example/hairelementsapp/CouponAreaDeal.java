package com.example.hairelementsapp;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;  

public class CouponAreaDeal extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coupon_area_deal);
    
    
        
        
    Button buttonOne =(Button)findViewById(R.id.button1);
    
    buttonOne.setOnClickListener(new OnClickListener() {
    	
    	@Override
    	public void onClick(View arg0){
    		Intent intent = new Intent(getApplicationContext(), BuyCouponAreaDeal.class);
    		startActivity(intent);
    	}
    });
    	
  }
}
