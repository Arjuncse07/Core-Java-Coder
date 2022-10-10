package com.arjun.hashCode.equalsMethod.contract;

import java.util.Objects;

public class Aircraft {
	int uniqueAcrNumber;
    String aircraftName;
    
    public Aircraft(int uniqueAcrNumber, String aircraftName) {
	  this.uniqueAcrNumber=uniqueAcrNumber;
	  this.aircraftName= aircraftName;
	}
    
	@Override
	public String toString() {
		return "Aircraft [uniqueAcrNumber=" + uniqueAcrNumber + ", aircraftName=" + aircraftName + "]";
	}

	@Override
	public int hashCode() {
		return uniqueAcrNumber;
	}

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Aircraft other = (Aircraft) obj; return uniqueAcrNumber ==
	 * other.uniqueAcrNumber; }
	 */
    
	
	
    
}
