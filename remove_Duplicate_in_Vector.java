/*Q6. Create a Vector with repeated integers. Remove duplicates without disturbing the original order.
What you practice:
Checking previous occurrences
Creating a new Vector for results
Order-preserving logic
*/

import java.util.*;
import java.util.Vector;
public class remove_Duplicate_in_Vector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size in Vector: ");
		int size = sc.nextInt();

		Vector<Integer> v = new Vector<>();
		for(int i = 0; i < size; i++){
			int value = sc.nextInt();
			v.add(value);
		}
		
		Vector<Integer> result = new Vector<>();

		for (int i = 0; i < v.size(); i++) {
            		int current = v.get(i);

            		if (!result.contains(current)) {
                		result.add(current);
            		}
        	}

		System.out.print("Removing Duplicate Elements: "+ v);
	}
}