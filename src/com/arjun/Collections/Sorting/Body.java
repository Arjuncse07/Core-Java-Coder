package com.arjun.Collections.Sorting;

public class Body {
	int hands;
	int legs;
	String bodyType;
	String genderType;
	String bodyName;
	
	public Body(int hands, int legs, String bodyType, String genderType,String bodyName) {
		super();
		this.hands = hands;
		this.legs = legs;
		this.bodyType = bodyType;
		this.genderType = genderType;
		this.bodyName=bodyName;
	}
//	@Override
//	public int compareTo(Body o) {
//		
//		return this.legs-o.legs;
//	}
	public int getHands() {
		return hands;
	}
	public int getLegs() {
		return legs;
	}
	public String getBodyType() {
		return bodyType;
	}
	public String getGenderType() {
		return genderType;
	}
	public String getBodyName() {
		return bodyName;
	}
	@Override
	public String toString() {
		return "Body [hands=" + hands + ", legs=" + legs + ", bodyType=" + bodyType + ", genderType=" + genderType
				+ ", bodyName=" + bodyName + "]";
	}
	
}
