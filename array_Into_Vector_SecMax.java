/*Q5. Take an integer array, store it in a Vector, and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
*/

import java.util.*;
public class array_Into_Vector_SecMax{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.print("Enter the Elements in array: ");
		for(int i = 0; i < a.length; i++){
			a[i] = sc.nextInt();
		}

		Vector<Integer> v = new Vector<>();

		for(int i = 0; i < a.length; i++){
			v.add(a[i]);
		}

		//System.out.print("Vector: "+ v);
		int max = Integer.MIN_VALUE;
		int s_6Dax = Integer.MIN_VALUE;	

		for(int i = 0; i < v.size(); i++){
			int current = v.get(i);

			if(current > max){
				s_max = max;
				max = current;
			}
			else if(current > s_max && s_max < max){
				s_max = current;
			}
		}
		System.out.print("Second Highest Number is Vector: "+ s_max);
	}
}