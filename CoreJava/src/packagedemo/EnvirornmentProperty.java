package packagedemo;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 4 Nov 2024
 * Time   : 4:22:28 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class EnvirornmentProperty {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.specification.vendor"));
		System.out.println(System.getProperty("java.specification.version"));
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.version"));
		System.out.println(System.getProperty("java.vm.name"));

		// using runtime class methods
		
		Runtime objRun = Runtime.getRuntime();
		Process objProcess = null;
		try {
			objProcess = objRun.exec("mspaint.exe");
			
		}catch(Exception e) {
			System.out.println("Error executing Calculator");
		}
	}

}
