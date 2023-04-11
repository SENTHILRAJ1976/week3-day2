package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	List<Integer> lis = new ArrayList<Integer>();
		
		lis.add(1);
		lis.add(2);
		lis.add(3);
		lis.add(4);
		lis.add(7);
		lis.add(6);
		lis.add(8);
		
		Collections.sort(lis);
	
		
		for(int i=0; i<lis.size(); i++) {
			
			int j=i+1;
			if(lis.get(i)!=j) {
				System.out.println("Missing element is: "+j);
				break;
			}
			
		}
		
		
		
		
		
		
		
	}

}
