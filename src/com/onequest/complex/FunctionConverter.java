package com.onequest.complex;

import java.util.ArrayList;

public class FunctionConverter 
{
	private String expression = "";
	
	public FunctionConverter()
	{
		 
	}
	
	public FunctionConverter(String expression)
	{
		this.expression = expression;
	}
	
	public void setExpression(String expression)
	{
		this.expression = expression;
	}
	
   public String toString()
   {
      return expression;
   }
   
public String MathAnalysis()
   {      
      String equation = "";
      
      ArrayList<String> exp = new ArrayList<String>();
      exp.add(null);
      int aryPos = 0;
      
      for(int i = 0; i < expression.length(); i++)
      {
         if(Character.isDigit(expression.charAt(i)))
         {
        	 if(exp.get(aryPos) == null)
        	 {
                 exp.set(aryPos, expression.charAt(i) + "");        		 
        	 } else
        	 {
        		 exp.set(aryPos, exp.get(aryPos) + expression.charAt(i));
        	 }
         }else
         {
            aryPos++;
    	    exp.add(expression.charAt(i) + "");
         }
      }
      
      for(int i = 0; i < exp.size(); i++)
      {
         if(exp.get(i).charAt(0) == '^')
         {
            exp.set(i, exp.get(i).replace("^", ""));
            int exponent = Integer.parseInt(exp.get(i));
            String base = exp.get(i - 1);
            exp.set(i - 1, "*Math.pow(" + base + ", " + exponent + ")");
            exp.remove(i); 
         }
      }
      
      try
      {
         exp.set(exp.indexOf("x"), "*x");
      }catch(ArrayIndexOutOfBoundsException aioobe){}
      
      
      for(int i = 0; i < exp.size(); i++)
      {
         equation += exp.get(i);
      }
      
      return equation;
      
   }
}
