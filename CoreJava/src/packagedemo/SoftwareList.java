package packagedemo;

import com.coforge.training.microsoft.OperatingSystem;
/**
* Author : Kopparapu.Sruthi
* Date   : 4 Nov 2024
* Time   : 3:13:30 pm
* Email  : Kopparapu.Sruthi@coforge.com
*/
import com.coforge.training.oracle.*;
public class SoftwareList {

	public static void main(String[] args) {
		Database db1 = new Database();
		OperatingSystem os1= new OperatingSystem();	
		
		System.out.println("********Database Softwares*********");
		db1.printSoftware();
		System.out.println("********Operating System*********");
		os1.listSoftware();
	}

}
