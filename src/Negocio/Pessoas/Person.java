
package Negocio.Pessoas;

public class Person{
    
	protected String name, login, pswd;
	
	public Person(String name,String pswd){
		this.name = name;
		this.pswd = pswd;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
      
}