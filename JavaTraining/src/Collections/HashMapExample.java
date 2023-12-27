package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("firstname", "Himani");
		map.put("rollno", "1");
		map.put("subject", "Selenium");
		map.put("marks", "100");
		map.put("firstname", "Himani1111");
//		
//		System.out.println(map);
//		System.out.println(map.size());
//		
//		System.out.println(map.get("firstname"));
//		
		Set<String> keys = map.keySet();
		
		for(String key:keys) {
			System.out.println(key+"="+map.get(key));
			
		}
		
		Map<String, List<String>> usernames = new HashMap<String, List<String>>();
		
		List<String> listofusers = new ArrayList<String>();
		listofusers.add("Himani");
		listofusers.add("Suraj");
		listofusers.add("Saritha");
		listofusers.add("Neetha");
		listofusers.add("Bharti");
		
		usernames.put("users", listofusers);
		
		System.out.println(usernames);
		
		
		
		
		
		

	}

}
