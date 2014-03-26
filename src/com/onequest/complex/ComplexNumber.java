package com.onequest.complex;

public class ComplexNumber 
{
	private double a;
	private double b;
	
	/**
	 * @param a
	 * @param b
	 */
	public ComplexNumber(double a, double b) 
	{
		this.a = a;
		this.b = b;
	}
	
	public ComplexNumber(double a) 
	{
		this.a = a;
		this.b = 0;
	}
	
	public ComplexNumber()
	{
		this.a = 0;
		this.b = 0;
	}

	/**
	 * @return the a
	 */
	public double getA() 
	{
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(double a) 
	{
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public double getB() 
	{
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(double b) 
	{
		this.b = b;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() 
	{
		if(b > 0)
		{
			return a + "+" + b + "i";
		}else if(b < 0)
		{
			return a + "" + b + "i";
		}else
		{
			return a + "";
		}	
	}
	
	public double toDouble()
	{
		if(b != 0)
		{
			return Math.sqrt(-1);
		}else
		{
			return a;
		}
	}
	
	
}
