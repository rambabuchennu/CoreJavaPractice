package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l1=new ArrayList<Integer>();
		l1.add(0);
		l1.add(34);
		l1.add(12);
		l1.add(60);
		l1.add(89);
		l1.add(6);
		l1.add(10);		
		System.out.println(l1);
		//print the even numbers by using filters		
		/*its name suggests, it filters elements based upon a condition you gave it.*/
		List<Integer> l2 = l1.stream().filter(i->(i%2==0)).collect(Collectors.toList());		
		System.out.println("Filer the Even Numbers : "+l2);	
		
		/*the map() is used to transform one object into other by applying a function.
		  That's the reason the Stream.map(Function mapper) takes a function as an argument. For example, 
		  by using the map() function, you can convert a list of String into a List of Integer by 
		  applying the Integer.valueOf() method to each String on the input list.
		*/	
		List<Integer> l3=l1.stream().map(i->(i+5)).collect(Collectors.toList());		
		System.out.println("Map functionality "+l3);

	}

}
