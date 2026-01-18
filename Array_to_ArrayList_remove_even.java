/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer*/


import java.util.*;
public class Array_to_ArrayList_remove_even{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> al = new ArrayList<>();
		int a[] = {1, 2, 3, 4, 5, 6};
		for(int i = 0; i < a.length; i++){
			al.add(a[i]);
		}
		Iterator i = al.iterator();	
		while(i.hasNext()){
			int num = i.next();
			if(num % 2 == 0){
				i.remove();
			}
		}
		System.out.print("Udated List: "+ al);
	}
}