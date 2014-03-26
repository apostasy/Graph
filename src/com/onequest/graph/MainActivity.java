package com.onequest.graph;

import android.app.*;
import android.content.Intent;
import android.os.*;
import android.view.*;
import android.view.View.OnTouchListener;
import android.widget.*;

public class MainActivity extends Activity implements OnTouchListener
{
	private String fx;
	private EditText functionEdit;
	private Button functionBtn;
	private Graph graph;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        fx = "";
        graph = ((Graph)findViewById(R.id.canvas));
        
        functionBtn = (Button)findViewById(R.id.functionBtn);
        
        functionEdit = (EditText)findViewById(R.id.function);
        
        functionBtn.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        fx = functionEdit.getText().toString();
                        graph.setFX(fx);
                    }
                });
        graph.setOnTouchListener(this);
    }
    
    public boolean onCreateOptionsMenu(Menu menu) 
    {
        
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.options, menu);
        return true;
    }
    
    public boolean onOptionsItemSelected(MenuItem item) 
    {
        
        //respond to menu item selection
    	switch (item.getItemId()) 
    	{
    		case R.id.graph: return true;
    		case R.id.calc: startActivity(new Intent(this, Calculator.class)); return true;
	        case R.id.about: startActivity(new Intent(this, About.class)); return true;
	        case R.id.help:  startActivity(new Intent(this, Help.class));  return true;
	        case R.id.exit:  System.exit(0); return true;
	        default: return super.onOptionsItemSelected(item);
    	}
    }

    public boolean onTouch(View view, MotionEvent event)
    {
    	int x = (int) event.getX();
		graph.getF(x);
		return false;
	}
    
    
}
