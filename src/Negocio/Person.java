
package Pessoas;

public class Person{
    
	protected String name, login, pswd;
	
	public Person(String name, String login, String pswd){
		this.name = name;
		this.login = login;
		this.pswd = pswd;
	}
	
	public String getName(){
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}
      
}