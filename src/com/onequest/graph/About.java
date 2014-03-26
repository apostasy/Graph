package com.onequest.graph;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
 
public class About extends Activity {
 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
    }
 
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;
    }
    
    public void goToSo (View view) {
        goToUrl ( "http://www.stackoverflow.com/");
    }

    public void goToGo (View view) {
        goToUrl ( "http://www.google.com/");
    }
    
    public void goToNB (View view) {
        goToUrl ( "http://www.thenewboston.org/");
    }
    
    public void goToDarius (View view) {
        goToUrl ( "https://github.com/darius");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
    
    public void onPause()
    {
    	super.onPause();
    	finish();
    }
 
    public boolean onOptionsItemSelected(MenuItem item) 
    {
        
        //respond to menu item selection
    	switch (item.getItemId()) 
    	{
    		case R.id.graph: finish(); return true;
	        case R.id.about: startActivity(new Intent(this, About.class)); finish(); return true;
	        case R.id.help:  startActivity(new Intent(this, Help.class));  finish(); return true;
	        case R.id.exit:  System.exit(0); return true;
	        default: return super.onOptionsItemSelected(item);
    	}
    }
}