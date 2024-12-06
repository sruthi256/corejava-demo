package jdbcdemo;

/**
* Author : Kopparapu.Sruthi
* Date   : 7 Nov 2024
* Time   : 3:33:01 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class UpdateDemo {

	public static void main(String[] args) {
		Candidates c1 = new Candidates();
		
		try {
			c1.getConnections();
			c1.UpdateCandidate();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
