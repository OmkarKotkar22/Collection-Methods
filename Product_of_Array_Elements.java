/*4. Product of Array Except Self
Description:
Return a list output where each element is the product of all other elements. No division allowed.
Example:
Input: [1,2,3,4]
Output: [24,12,8,6]*/

import java.util.*;
public class Product_of_Array_Elements{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of ArrayList: ");
		int size = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<>();

		for(int i = 0; i < size; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		ArrayList<Integer> left = new ArrayList<>();
		int prod = 1;
		for(int i = 0; i < size; i++)
		{
			left.add(prod);
			prod = prod * al.get(i);			
		}

		ArrayList<Integer> right = new ArrayList<>();
		prod=1;
		for(int i=size-1; i >= 0; i--){
			right.add(0, prod);
			prod = prod * al.get(i);
		}

		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 0; i < size; i++){
			result.add(left.get(i) * right.get(i));
		}
		System.out.print("Product of: "+ result);
	}
}