package com.onequest.graph;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
 
public class Help extends Activity {
 
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help);
    }
 
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;
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
	        case R.id.help:  startActivity(new Intent(this, Help.class)); finish(); return true;
	        case R.id.exit:  System.exit(0); return true;
	        default: return super.onOptionsItemSelected(item);
    	}
    }
}