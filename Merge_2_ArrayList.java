/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/

import java.util.*;
public class Merge_2_ArrayList{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the How many Elements you want to add 1st ArrayList: ");
		int n1 = sc.nextInt();
		ArrayList<Integer> al1 = new ArrayList<>();
		for(int i = 0; i < n1; i++){
			int value = sc.nextInt();
			al1.add(value);
		}
		System.out.print("Enter the How many Elements you want to add 1st ArrayList: ");
		int n2 = sc.nextInt();
		ArrayList<Integer> al2 = new ArrayList<>();
		for(int i = 0; i < n2; i++){
			int value = sc.nextInt();
			al2.add(value);
		}
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i = 0; i < al1.size(); i++){
			result.add(al1.get(i));
		}

		for(int i = 0; i < al2.size(); i++){
			if(!result.contains(al2.get(i))){
				result.add(al2.get(i));
			}
		}
		
		System.out.print(result);
	}
}