package com.onequest.graph;

import android.app.*;
import android.content.Intent;
import android.os.*;
import android.view.*;
import android.view.View.OnTouchListener;
import android.widget.*;
import java.util.ArrayList;

public class Calculator extends Activity implements OnTouchListener
{
	private String fx;
	private String remove = "[\\[\\]\\, ]";
	private TextView function;
	private ArrayList<Button> buttons = new ArrayList<Button>();
	private ArrayList<String> functionList = new ArrayList<String>();
	private Graph graph;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        function = (TextView)findViewById(R.id.function);
        fx = function.getText().toString();
        graph = (Graph)findViewById(R.id.canvas);
        
        addButtons();
        handleButtons();
        
    }
    
    public boolean onTouch(View view, MotionEvent event)
    {
    	int x = (int) event.getX();
		graph.getF(x);
		return false;
	}
    
    private void addButtons()
    {
    	buttons.add((Button)findViewById(R.id.zeroBtn));	//0
    	buttons.add((Button)findViewById(R.id.oneBtn));		//1
    	buttons.add((Button)findViewById(R.id.twoBtn));		//2
    	buttons.add((Button)findViewById(R.id.threeBtn));	//3
    	buttons.add((Button)findViewById(R.id.fourBtn));	//4
    	buttons.add((Button)findViewById(R.id.fiveBtn));	//5
    	buttons.add((Button)findViewById(R.id.sixBtn));		//6
    	buttons.add((Button)findViewById(R.id.sevenBtn));	//7
    	buttons.add((Button)findViewById(R.id.eightBtn));	//8
    	buttons.add((Button)findViewById(R.id.nineBtn));	//9
    	buttons.add((Button)findViewById(R.id.piBtn));		//10
    	buttons.add((Button)findViewById(R.id.expBtn));		//11
    	buttons.add((Button)findViewById(R.id.sqrtBtn));	//12
    	buttons.add((Button)findViewById(R.id.opnParenBtn));//13
    	buttons.add((Button)findViewById(R.id.clsParenBtn));//14
    	buttons.add((Button)findViewById(R.id.sinBtn));		//15
    	buttons.add((Button)findViewById(R.id.cosBtn));		//16
    	buttons.add((Button)findViewById(R.id.tanBtn));		//17
    	buttons.add((Button)findViewById(R.id.decBtn));		//18
    	buttons.add((Button)findViewById(R.id.multBtn));	//19
    	buttons.add((Button)findViewById(R.id.divBtn));		//20
    	buttons.add((Button)findViewById(R.id.addBtn));		//21
    	buttons.add((Button)findViewById(R.id.subBtn));		//22
    	buttons.add((Button)findViewById(R.id.xBtn));		//23
    	buttons.add((Button)findViewById(R.id.delBtn));    	//24
    	buttons.add((Button)findViewById(R.id.graphBtn));   //25
    }
    
    private void handleButtons()
    {
    	graph.setOnTouchListener(this);
    	
    	buttons.get(0).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("0");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(1).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("1");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(2).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("2");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(3).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("3");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(4).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("4");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(5).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("5");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(6).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("6");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(7).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("7");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(8).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("8");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(9).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("9");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(10).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
            	addMult();
                functionList.add("pi");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(11).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("^");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(12).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
            	addMult();
                functionList.add("sqrt(");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(13).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
            	addMult();
                functionList.add("(");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(14).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add(")");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(15).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
            	addMult();
                functionList.add("sin(");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(16).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
            	addMult();
                functionList.add("cos(");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(17).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
            	addMult();
                functionList.add("tan(");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(18).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add(".");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(19).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("*");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(20).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("/");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(21).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("+");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(22).setOnClickListener( new View.OnClickListener()
        {
            public void onClick(View view)
            {
                functionList.add("-");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(23).setOnClickListener( new View.OnClickListener()
        {
    		//remove all
            public void onClick(View view)
            {
            	addMult();
            	functionList.add("x");
                function.setText(functionList.toString().replaceAll(remove, ""));
            }
        });
    	buttons.get(24).setOnClickListener( new View.OnClickListener()
        {
    		//remove last
            public void onClick(View view)
            {
            	try
            	{
            		functionList.remove(functionList.size() - 1);
            	}catch(ArrayIndexOutOfBoundsException AIOBE)
            	{
            		graph.setError("Nothing left to delete.");
            	}
                function.setText(functionList.toString().replaceAll(remove, ""));
                
            } 
        });
    	buttons.get(25).setOnClickListener( new View.OnClickListener()
        {
    		//send to Graph canvas
            public void onClick(View view)
            {
            	fx = function.getText().toString();
                com.onequest.graph.Graph graph = ((Graph)findViewById(R.id.canvas));
                graph.setFX(fx);
            }
        });
    	
    }
    
    private void addMult()
    {
    	if(functionList.size() != 0)
    	{
    		 String x = functionList.get(functionList.size() - 1);
    		 
    		 if(!x.equals("-") && !x.equals("+") && !x.equals("*") && !x.equals("/") && !x.contains("(") && !x.equals("^"))
    		 {
    			 functionList.add("*");
    		 }
    	}
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
    		case R.id.graph: System.exit(0); return true;
	        case R.id.about: startActivity(new Intent(this, About.class)); return true;
	        case R.id.help:  startActivity(new Intent(this, Help.class));  return true;
	        case R.id.exit:  System.exit(0); return false;
	        default: return super.onOptionsItemSelected(item);
    	}
    }
    
    
}
