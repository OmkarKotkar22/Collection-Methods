import java.util.*;

public class Collection_Methods{

/*
	public static void main(String x[]){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);

		System.out.print("Size of ArrayList: "+ al.size());
	}

*/

/*
	public static void main(String x[]){
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);

		Iterator i = al.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}
	}

*/

/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print("Enter the how many Elements you want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			al.add(sc.nextInt());
			
		}

		if(al.isEmpty()){
			System.out.print("Element not found");
		}
		else{
			System.out.print("Element found");
		}
	}

*/

/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print("Enter the how many Elements you want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			al.add(sc.nextInt());
		}

		if(al.contains(20)){
			System.out.print("Element Contain");
		}
		else{
			System.out.print("Not Element Contain");
		}
	}
*/


/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print  ("Enter the how many elements you want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			al.add(sc.nextInt());
		}

		System.out.print("Display Arraylist before: "+ al + "\n");

		System.out.print("Enter the Number what you want remove: ");
		int no = sc.nextInt();

		boolean b = al.remove(Integer.valueOf(no));
		if(b){
			System.out.print(no+" Element Removed\n");
		}
		else{
			System.out.print("Element not removed\n");
		}

		System.out.print("Display Arraylist After: \n"+ al);
	}

*/


/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print  ("Enter the how many elements you want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			al.add(sc.nextInt());
		}

		Collection c = new ArrayList();
		c.add(100);
		c.add(300);

		boolean b =  al.containsAll(c);
		if(b){
			System.out.print(c + " ");
		}
		else{
			System.out.print("Value not found");
		}

		System.out.print("Contains all Elements: "+ al);
	}

*/
/*
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print  ("Enter the how many elements you want: ");
		int n = sc.nextInt();

		System.out.print("Enter Elements: ");
		for(int i = 0; i < n; i++){
			al.add(sc.nextInt());
		}

		System.out.print("Enter the how many Add new Elements: ");
		int n1= sc.nextInt();
		System.out.print("Enter elements: ");
		Collection c = new ArrayList();
		for(int i = 0; i < n1; i++){
			c.add(sc.nextInt());
		}

		boolean b = al.addAll(c);
		if(b){
			System.out.print("Added");
		}
		else{
			System.out.print("Not added");
		}

		System.out.print("Added Elements: "+ al);
	}

*/

	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();

		System.out.print("Enter the how many elements you want added: ");
		int n = sc.nextInt();

		System.out.print("Enter elements: ");
		for(int i = 0; i < n; i++){
			al.add(sc.nextInt());
		}

		System.out.print("Display before Delete: "+ al+"\n");

		Collection c = new ArrayList();
		
		System.out.print("Enter number of elements to remove: ");
        	int n2 = sc.nextInt();

        	System.out.println("Enter elements to remove:");
        	for (int i = 0; i < n2; i++) {
            		c.add(sc.nextInt());
        	}

		boolean b = al.removeAll(c);
		if(b){
			System.out.print("Matching elements removed successfullyl\n");
		}
		else{
			System.out.print("No matching elements found");
		}

		System.out.print("Display after Delete: "+ al);
	}
	
}



