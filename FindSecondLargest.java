package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> lis = new ArrayList<Integer>();
		
		lis.add(3);
		lis.add(2);
		lis.add(11);
		lis.add(4);
		lis.add(6);
		lis.add(7);
		
		Collections.sort(lis);
		
		
		int size = lis.size();
		
		System.out.println("The second largest value: "+lis.get(size-2));
		
		
		for(int i=0; i<size; i++) {
			
			
			System.out.println(lis.get(i)+" ");
			
		}
		
		
	}

}
