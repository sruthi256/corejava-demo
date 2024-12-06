package java8features;

import static java.lang.System.*;
import static java.lang.Math.*;
/**
 * Author : Kopparapu.Sruthi
 * Date   : 9 Nov 2024
 * Time   : 3:44:28 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

/*
 * In Java, static import concept is introduced in 1.5 version. 
 * With the help of static import, we can access the static members 
 * of a class directly without class name or any object. 
 * For Example: we always use sqrt() method of Math class by 
 * using Math class i.e. Math.sqrt(), 
 * but by using static import we can access sqrt() method directly. 
 */

public class StaticImportDemo {

	public static void main(String[] args) {
		// calling of predefined methods without static import
		System.out.println(Math.sqrt(4));
		System.out.println(Math.pow(2, 2));
		System.out.println(Math.abs(6.3));

		// calling of predefined methods with static import
		out.println(sqrt(4));
		out.println(pow(2, 2));
		out.println(abs(6.3));


	}

}
