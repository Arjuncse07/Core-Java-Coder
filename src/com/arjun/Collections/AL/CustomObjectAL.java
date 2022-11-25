package com.arjun.Collections.AL;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomObjectAL {
	public static void main(String[] args) {
		List<Polition> ll= new ArrayList<>();
		ll.add(new Polition("Rinku Gahlot",25,"BJP",new Address("A26AS", "New Delhi", "Delhi", "India")));
		ll.add(new Polition("Shyam Manohar",25,"Congress",new Address("Soman", "New Delhi", "Delhi", "India")));
		ll.add(new Polition("Dolly Sharma",25,"BJP",new Address("A26AS", "New Delhi", "Delhi", "India")));
		ll.add(new Polition("Suman Sharma",29,"Aam Admi Party",new Address("A26AS", "New Delhi", "Delhi", "India")));
		
		//System.out.println(ll);
		//System.out.println(ll.get(0));
		//Polition polition=ll.get(0);
		
       Iterator<Polition> itr= ll.iterator();
       while(itr.hasNext()) {
			//ll.add(new Polition(null, 0, null, null));

    	   Polition polition2=itr.next();
    	   polition2.setPolitianName("AMITTTT");
    	   System.out.println(
          "politianName="+polition2.getPolitianName()
    	   +"politianAge="+polition2.getPolitianAge()
    	   +"politionParty="+polition2.getPolitionParty()
    	   +"address="+polition2.getAddress().getCity()
    	   +"state="+polition2.getAddress().getState()

    	   
    			   );
       }
       
       
		for (Polition polition2 : ll) {
			//ll.add(new Polition(null, 0, null, null));
			polition2.setPolitianName("AMITTTT");
			System.out.println("politianName=" + polition2.getPolitianName() + "politianAge="
					+ polition2.getPolitianAge() + "politionParty=" + polition2.getPolitionParty() + "address="
					+ polition2.getAddress().getCity() + "state=" + polition2.getAddress().getState());

		}
		
		
		// treaditional for loop
		for(int i=0 ; i<=ll.size(); i++) {
			
			System.out.println(ll.size());
			Polition polition2 = ll.get(i);
			
			ll.add(new Polition("Rinku Gahlot",25,"BJP",new Address("A26AS", "New Delhi", "Delhi", "India")));
			
			
			polition2.setPolitianName("AMITTTT");
			System.out.println("politianName=" + polition2.getPolitianName() + "politianAge="
					+ polition2.getPolitianAge() + "politionParty=" + polition2.getPolitionParty() + "address="
					+ polition2.getAddress().getCity() + "state=" + polition2.getAddress().getState());

		
		
			System.out.println(ll.size());

		}

	}

}
