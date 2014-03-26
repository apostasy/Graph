package com.onequest.complex;

public class Expression 
{
	private double a;
	private double n;
	
	
	
	/**
	 * 
	 */
	public Expression() 
	{
		a = 1;
		n = 0;
	}
	/**
	 * @param a
	 * @param n
	 */
	public Expression(double a, double n) 
	{
		this.a = a;
		this.n = n;
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
	 * @return the n
	 */
	public double getN() 
	{
		return n;
	}
	/**
	 * @param n the n to set
	 */
	public void setN(double n) 
	{
		this.n = n;
	}
}
