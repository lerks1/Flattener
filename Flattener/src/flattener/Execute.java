package flattener;

import java.util.Arrays;

/**
 * Test class created for the purpose of demonstrating the functionality of the Flattener class. Includes various 
 * pre-configured nested Arrays.
 */
public class Execute {

	public static void main(String[] args) 
	{
		Flattener flattener = new Flattener();
		
		//[] to []
		flattener.printFlatten(new Object[]{});
		System.out.println("--------");
		
		//[[1,2], 3, 4] to [1,2,3,4]
		flattener.printFlatten(new Object[]{new Object[]{1, 2}, 3, 4});
		System.out.println("--------");
		
		//[[1,2,[3]],4] to [1,2,3,4]
		flattener.printFlatten(new Object[]{new Object[]{1, 2, new Object[]{3}}, 4});
		System.out.println("--------");
		
		//[[],[],[[],[],1],[]] to [1]
		flattener.printFlatten(new Object[]{new Object[]{}, new Object[]{}, new Object[]{new Object[]{}, new Object[]{}, 1}, new Object[]{}});
		System.out.println("--------");
		
		//[[1,2],3,4,[5,6,[],[7, 8,[9,10,11]]]] to [1,2,3,4,5,6,7,8,9,10,11]
		flattener.printFlatten(new Object[]{new Object[]{1, 2}, 3, 4, new Object[]{5,6, new Object[]{}, new Object[]{7, 8, new Object[]{9, 10, 11}}}});
	
	}

}
