/*Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/

import java.util.*;
public class Sort_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the How many Elements you want to add ArrayList: ");
		int n1 = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < n1; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		Vector<Integer> v = new Vector<>(al);
		System.out.print("Before Sorting Vactor: ");
		System.out.print(v);

		int n = v.size();
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n-i-1; j++){
				if(v.get(j) > v.get(j+1)){
					int temp = v.get(j);
					v.set(j, v.get(j+1));
					v.set((j+1), temp);
				}
			}
		}

		System.out.print("After Sorting Vector: ");
		System.out.print(v);

	}
}