package week3.assignment;

public class LoginTestData extends TestData{
	 public void enterUsername() {
		 System.out.println("Username is entered");
	 }

	 public void enterPassword() {
		 	System.out.println("Password is entered");
	}
	public static void main(String[] args) {
			LoginTestData loginFunction=new LoginTestData();
			loginFunction.navigateToHomePage();
			loginFunction.enterCredentials();
			loginFunction.enterUsername();
			loginFunction.enterPassword();
	}

}
