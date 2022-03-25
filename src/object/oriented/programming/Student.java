package object.oriented.programming;
//Coupling: Defines dependency b/w classes..\
//Good Software Design should me loosely coupled two each other.
public class Student {
	private String rollno;
	private String std;
	private String division;
	
	public ContactInfo contactInfo;
	public StudentCard studentCard;
	
	public String Study()
	{
		return "All Student need to Study to crack OCJP";
	}

	public String getRollno()
	{
		return rollno;
	}
	public void setRollno(String rollno)
	{
		this.rollno=rollno;
	}
	public String getStd()
	{
		return std;
	}
	public void setStd(String std)
	{
		this.std=std;
	}
	public String getDiv()
	{
		return division;
	}
	public void setDiv(String division)
	{
		this.division=division;
	}
}
