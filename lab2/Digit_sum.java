
import java.util

public class Digit_sum
{ 

	
	static void printVector(Vector<Integer> result) 
	{ 
		for (int i : result) 
		{ 
			System.out.print(i + " "); 
		} 
	} 

	 
	static void split_number(int num, Vector<Integer> result) 
	{ 
		if (num > 0) 
		{ 
			split_number(num / 10, result); 
			result.add(num % 10); 
		} 
	} 

	
	static void add(Vector<Integer> a, Vector<Integer> b) 
	{ 
	
		Vector<Integer> result = new Vector<Integer>(); 
		int m = a.size(), n = b.size(); 

	
		int i = 0; 
		while (i < m && i < n) 
		{ 

			int sum = a.get(i) + b.get(i); 
			split_number(sum, result); 
			i++; 
		} 
		while (i < m) 
		{ 
			split_number(a.get(i++), result); 
		} 
		while (i < n) 
		{ 
			split_number(b.get(i++), result); 
		} 

		printVector(result); 
	} 

	public static void main(String[] args) 
	{ 
		// input vectors 
		int[] arr1 = {23, 5, 2, 7, 87}; 
		Vector<Integer> a = new Vector<>(); 
		for(Integer i:arr1) 
			a.add(i); 
			
		int[] arr2 = {4, 67, 2, 8}; 
		Vector<Integer> b = new Vector<Integer>(); 
		for(Integer i:arr2) 
			b.add(i); 

		add(a, b); 
	} 
} 


