package com.arjun.Collections.Sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafe_FailFast {
public static void main(String[] args) {
	//Map<String, Integer> map= new HashMap<String, Integer>();
//	ConcurrentHashMap<String, Integer> concurrentMap= new ConcurrentHashMap<String, Integer>();
//	concurrentMap.put("Arjun", 111);
//	concurrentMap.put("Sumit", 222);
//	concurrentMap.put("Ravi", 333);
//	
//	Iterator<Entry<String, Integer>> itr= concurrentMap.entrySet().iterator();
//	while(itr.hasNext()) {
//		Map.Entry<String, Integer> pair=(Map.Entry<String, Integer>)itr.next();
//		System.out.println(pair.getKey()+":"+pair.getValue());
//		
//		concurrentMap.put("DDD", 444); //concurrent modification Exception
//	}



ArrayList<String> cityList= new ArrayList<>();
cityList.add("Kolkata");
cityList.add("New Delhi");
cityList.add("Peshawar");
cityList.add("Faizabad");
cityList.add("Meeruth");
System.out.println("List size:"+cityList.size());

Iterator<String> itr= cityList.iterator();
while(itr.hasNext()) {
	if(itr.next()=="New Delhi") {
		//cityList.remove(1);
		itr.remove();
	}
	System.out.println("After Removing:"+cityList);
}

}
}
