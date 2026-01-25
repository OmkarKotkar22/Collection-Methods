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

		ArrayList<Integer> result = new ArrayList<>();
		int prod;
		for(int i = 0; i < size; i++)
		{
			prod = 1;
			for(int j = i+1; j < size; j++){
				prod = prod * al.get(j);
			}
			result.add(prod);
		}

		System.out.print(result);
	}
}