/**
 * Aditya Ponnapalli
 * CSE 360 Wed 
 * Class ID 525
 * Assignment 2
 * This file contain a calculator class which
 * contains methods for adding, subtracting, 
 * multiplying, and dividing int total and int value
 * It also contains a method which will produce
 * a history of all actions as a string 
 */
package cse360assign2;

/**
 * Creating the calculator class
 */

public class Calculator {
	
	private int total;
	private String history = " ";
	
	public Calculator ()
	{
		total = 0;  
		history = history + Integer.toString(total);
	}
	
	public int getTotal ()
	{
		return total;
	}
	
/**
 * This method will add value to total
 * @param value
 */
	
	public void add (int value)
	{
		total = total + value;
		String addit = Integer.toString(value);
		history = history + " + ";
		history = history + addit;

	}
	
/**
 * This method will subtract value from total
 * @param value
 */
	
	public void subtract (int value)
	{
		total = total - value;
		String addit = Integer.toString(value);
		history = history + " - ";
		history = history + addit;

	}
	
/**
 * This method will multiply value and total	
 * @param value
 */
	
	public void multiply (int value)
	{
		total = total * value;
		String addit = Integer.toString(value);
		history = history + " * ";
		history = history + addit;

	}
	
/**
 * This method will divide total by value
 * @param value
 */
	
	public void divide (int value)
	{
		if(value == 0) 
		{
			total = 0;
		} 
		else 
		{
			total = total / value;
		}
		
		String addit = Integer.toString(value);
		history = history + " / ";
		history = history + addit;

	}

/**
 * This method will print the history of all
 * actions as a string
 */
	public void getHistory ()
	{
		System.out.println(history);
	}	
}

