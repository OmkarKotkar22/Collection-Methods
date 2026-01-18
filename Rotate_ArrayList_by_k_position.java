/*Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation
*/

import java.util.*;
public class Rotate_ArrayList_by_k_position{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of ArrayList: ");
		int size = sc.nextInt();

		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the Elements in ArrayList: ");
		for(int i = 0; i < size; i++){
			int value = sc.nextInt();
			al.add(value);
		}

		System.out.print("Enter the k value: ");
		int k = sc.nextInt();

		ArrayList<Integer> result = new ArrayList<>();

		for(int i = size-k; i < al.size(); i++){
			result.add(al.get(i));
		}

		for(int i = 0; i < size-k; i++){
			result.add(al.get(i));
		}

		System.out.print("Rotate ArrayList after result: "+ result);
	}
}