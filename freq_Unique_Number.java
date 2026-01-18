/*Q4. Take an integer array with repeated values. Store it in an ArrayList and print the frequency of each unique number.
What you practice:
Traversing ArrayList
Using another ArrayList to track visited elements
Logical counting
*/

import java.util.*;
public class freq_Unique_Number{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the how many elements you want to add size: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		int count;

		for(int i = 0 ; i < a.length; i++){
			a[i] = sc.nextInt();
		}
		
		boolean arr[] = new boolean[a.length];

		for(int i = 0; i < a.length; i++){
			count = 1;
			for(int j = 0; j < a.length; j++){
				if(a[i] == a[j] &&  i!=j){
					arr[j] = true;
					count++;
				}
			}
			if(!arr[i])
				System.out.printf("Index%d Count %d\n", a[i], count);
		}
	}
}