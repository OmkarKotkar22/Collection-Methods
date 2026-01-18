/*Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/

import java.util.*;
public class Freq_Count_Unique_Number{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Size of Array: ");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.print("Enter the elements in array: ");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i < a.length; i++){
			al.add(a[i]);
		}

		ArrayList<Integer> visit = new ArrayList<>();
		 for(int i = 0; i < al.size(); i++){
			int current = al.get(i);
						
			if(visit.contains(current))
				continue;

			int count = 0; 
			for(int j = 0; j < al.size(); j++){
				if(al.get(j) == current)
					count++;
			}

			System.out.println(current +" -> " + count + " times");

			visit.add(current);
		}
	}
}