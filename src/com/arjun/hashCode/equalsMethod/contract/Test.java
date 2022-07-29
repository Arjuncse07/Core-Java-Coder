package com.arjun.hashCode.equalsMethod.contract;

public class Test {
public static void main(String[] args) {
	/*
	 * Hash code will generate a unique number for an object.
	 */
	
    Aircraft mig= new Aircraft(14515,"MIG-21");
	int hashCodeValueOfMigObject= mig.hashCode();
	System.out.println("mig hash code:"+hashCodeValueOfMigObject);
	
	Aircraft fsixteen= new Aircraft(52421, "F-16");
	int hashcodeValueOfFsixteen= fsixteen.hashCode();
	System.out.println("fsixteen hash code:"+hashcodeValueOfFsixteen);
	
	Aircraft mirage= new Aircraft(85464, "Dassault-Bregut Mirage");
	int hashcodeOfMirage= mirage.hashCode();
	System.out.println("mirage hash code value:"+hashcodeOfMirage);
	
	/*String mig= new String("Mig-21");
	int hashCodeValueOfMigObject= mig.hashCode();
	System.out.println("mig hash code:"+hashCodeValueOfMigObject);
	
	String fsixteen= new String("F-16");
	int hashcodeValueOfFsixteen= fsixteen.hashCode();
	System.out.println("fsixteen hash code:"+hashcodeValueOfFsixteen);
	
	String mirage= new String("Mirage");
	int hashcodeOfMirage= mirage.hashCode();
	System.out.println("mirage hash code value:"+hashcodeOfMirage);
	
	//Here hash code of two objects can be same , we can't trust hash code methods that it will return distinct values.
	String str1="Mig-21";
	String str2="F-16";
	System.out.println(str1.hashCode()+ " "+str2.hashCode());
	
	*/
}
}
