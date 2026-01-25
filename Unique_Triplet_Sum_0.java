/*5. Sum
Description:
Find all unique triplets (a,b,c) such that a+b+c = 0 using sorting and ArrayList.
Example:
Input: [-1,0,1,2,-1,-4]
Output: [[-1,-1,2], [-1,0,1]]*/

import java.util.*;
public class Unique_Triplet_Sum_0{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of ArrayList: ");
		int size = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		System.out.print("Enter the Elements in Arraylist: ");
		for(int i = 0; i < size; i++){
			int value = sc.nextInt();
			al.add(value);
		}
	
		Collections.sort(al);
		ArrayList<String> visit = new ArrayList<>();
		int sum = 0;

		for(int i = 0; i < size-2; i++){
			for(int j = i+1; j < size-1; j++){
				for(int k = j+1; k < size; k++){					
					if(al.get(i) + al.get(j) + al.get(k) == 0)
					{
						String key = al.get(i) +" ,"+ al.get(j)+ " ," + al.get(k);

						if(!visit.contains(key)){
							visit.add(key);
							/*System.out.println/*("(" + al.get(i) + ", " + al.get(j) + ", " + al.get(k) + ")"*/);*/
						}
					}
				}
			}
		}
	}
}