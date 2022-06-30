package com.arjun.Design_Patterns.Prototype_DP;
/*
 * 
 * Protoype DP: Patterns refers to creating duplicate object while keeping performance in mind.
 *           It Involves implementing a prototype interface which tells to create a clone of the current object.
 *           This pattern is used when creation of the object directly is costly.
 *           For ex: It requires database calls or required too much of processing that will take a lot of memory.
 *    
 *    What can be done? we can cache the object, returns its clone on next request.
 *   
 *    Steps: 1.create main class which call CacheImpl class
 *           2.CacheImpl class has 2 mthods :1st to load the key value in map and create the cache,
 *                                           2nd to return the required clone object.
 *           3.The main class, parent of all the required concrete class contains cloning technique.
 *             Rest concrete class are normal POJO's, nothing special. 
 */
public class Main {
 public static void main(String[] args) {
	
	 ProfessionCache.loadProfessionCache();
	 
	 Profession docProfession=ProfessionCache.getCloneNewProfession(1);
	 System.out.println(docProfession);
	 
	 Profession engProfession=ProfessionCache.getCloneNewProfession(2);
	 System.out.println(engProfession);
	 
	 Profession teachProfession=ProfessionCache.getCloneNewProfession(3);
	 System.out.println(teachProfession);
	 
	 Profession docProfession2 =ProfessionCache.getCloneNewProfession(1);
	 System.out.println(docProfession2);
	 
}

}
