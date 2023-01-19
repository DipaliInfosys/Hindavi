package Collection;

import java.util.Iterator;
import java.util.Vector;



public class Vector_class
{
public static void main(String[] args)
{
	Vector v=new Vector();
	v.add("Dipali");
	v.add('h');
	v.add(100);
	v.add(null);
	v.add("Hindiavi");
	
	System.out.println(v);
	//check the capacity
	System.out.println(v.capacity());
	
	//size data
	System.out.println(v.size());
	
	//right shift
	v.add(0,"Dipa");
	System.out.println(v);
	
	//left shift
	v.remove(0);
	System.out.println(v);
	
	System.out.println("Print the data inside the Vector using iterator cursor");
	
   Iterator it = v.iterator();
   while(it.hasNext())
   {
	   System.out.println(it.next());
   }
}
}
