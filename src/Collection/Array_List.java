package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List
{
public static void main(String[] args)
{
	ArrayList al=new ArrayList();
	al.add("Dipali");
	al.add(100);
	al.add('H');
	al.add(null);
	al.add("Navnath");
	al.add(null);
	
	//i need to print entire data inside the collection
	System.out.println(al);
	
	//check the size
	System.out.println(al.size());
	
	//check wheather it is empty
	System.out.println(al.isEmpty());
	
	System.out.println("Print the data inside the Arraylist using iterator cursor");
	
	Iterator it=al.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
