package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set=new HashSet<String>();
		set.add("Himnai");
		set.add("Suraj");
		set.add("Saritha");
		set.add("Neetha");
		set.add("Suraj");
		
		System.out.println(set);
		
//		for(int i=0;i<set.size();i++) {
//			
//		}
		
		for(Object i:set) {
			System.out.println(i);
			
		}
		
//		Iterator<String> itr = set.iterator();
//		while(itr.hasNext()) {
//			String name = itr.next();
//			if(name.equals("Saritha")){
//				System.out.println(name);
//			}
//			
//		}
//		
//		set.remove("Saritha");
//		System.out.println(set);
		
		
		
		

	}

}
