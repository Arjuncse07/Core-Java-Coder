package oops.encapsulation;
//Encapsulation: 1.Java Bean 
/*Java Bean: 1. Getter and Setter
 *           2.private data members
 *           3.implements serializable interface
 *           4.class should be public
 *           5.should have public default constructor
 *           6.this class should not extend any specific class or implements any interface(but must implement Serialiazable interface)
 */  
public class Login {

	private String name;
	private String pass;
	public Login(String name2, String pass2) {
		this.name=name2;
        this.pass=pass2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
