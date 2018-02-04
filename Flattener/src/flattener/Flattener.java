package flattener;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class to perform the flattening of an arbitrarily nested array of integers (e.g. [1,[2,3],4[5]]).
 * Provides methods to return and/or print flattened array.
 */
public class Flattener 
{
	
	/**Explores the Array from 0 to n-1 in an iterative manner, collecting integers and
	 * calling itself recursively when reaching Arrays to produce an ArrayList of the relevant values.
	 * 
	 * @param input Array of Objects to flatten.
	 * @return ArrayList containing Integer objects representing numbers in the flattened Array.
	 */
	private ArrayList<Integer> pullValues(Object[] input)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (Object o : input)
		{
			if (o instanceof Object[])
			{
				numbers.addAll(pullValues((Object[])o));
			}
			else
			{
				numbers.add((Integer)o);
			}
		}
		return numbers;
	}
	
	/**
	 * Converts an ArrayList of Integer objects to an Array of primitive int values.
	 * 
	 * @param values ArrayList of Integer objects to convert to an Array of primitive int values.
	 * @return Array of primitive int values.
	 */
	private int[] toArray(ArrayList<Integer> values)
	{
		int[] out = new int[values.size()];
		
		for (int i = 0; i < values.size(); i ++)
		{
			out[i] = values.get(i);
		}
		
		return out;
	}
	
	/**
	 * Utilises the pullValues and createArray methods to produce and print desired result.
	 * Public method intended for the user to utilise/test with.
	 * 
	 * @param input Array of Objects to flatten and print.
	 */
	public void printFlatten(Object[] input)
	{
		System.out.println(Arrays.toString(toArray(pullValues(input))));
	}
	
}
