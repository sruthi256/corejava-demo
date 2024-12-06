package packagedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
* Author : Kopparapu.Sruthi
* Date   : 8 Nov 2024
* Time   : 10:31:08 am
* Email  : Kopparapu.Sruthi@coforge.com
*/

public class DateFunctionsDemo {

	public static void main(String[] args) {
		
		
		//get the current date
        Date currentDate = new Date();
        System.out.println("Current Date: " + currentDate);

        // Format date using SimpleDateFormat
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Formatted Date: " + formattedDate);

        // Add days to the current date
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        Date dateAfterTenDays = calendar.getTime();
        System.out.println("Date after 10 days: " + dateFormat.format(dateAfterTenDays));

        // Subtract days from the current date
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_MONTH, -5);
        Date dateFiveDaysAgo = calendar.getTime();
        System.out.println("Date 5 days ago: " + dateFormat.format(dateFiveDaysAgo));

        // Set a specific date
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        Date specificDate = calendar.getTime();
        System.out.println("Specific Date (25th Dec 2023): " + dateFormat.format(specificDate));
        //int dob,age;
     // Set a birthday date
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter the date of birth: ");
        dob = scan.nextInt();
        calendar.set(Calendar.YEAR, dob);
        age = 
        */
        
        /*bmonth= scan.nextInt();
        calendar.set(Calendar.MONTH, bmonth);
        bdate = scan.nextInt();
        calendar.set(Calendar.DAY_OF_MONTH, bdate);
        Date bday = calendar.getTime();
        calendar.add(Calendar.DAY_OF_MONTH, );*/
       

        // Get various date components
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;  // January is 0
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        // Check if a date is before or after another date
        if (specificDate.before(currentDate)) {
            System.out.println("The specific date is before the current date.");
        } else if (specificDate.after(currentDate)) {
            System.out.println("The specific date is after the current date.");
        } else {
            System.out.println("The specific date is the same as the current date.");
        }
        
        System.out.println("************************************************************");
		
    	
        Scanner scanner = new Scanner(System.in);

        // Input date of birth
        System.out.print("Enter your date of birth (dd/MM/yyyy): ");
        String dobInput = scanner.nextLine();
        scanner.close();

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dob = null;

        try {
            dob = dateFormat1.parse(dobInput);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use dd/MM/yyyy.");
            return;
        }

        // Get current date
        Calendar currentDate1 = Calendar.getInstance();

        // Get date of birth
        Calendar birthDate = Calendar.getInstance();
        birthDate.setTime(dob);

        // Calculate age
        int years = currentDate1.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        int months = currentDate1.get(Calendar.MONTH) - birthDate.get(Calendar.MONTH);
        int days = currentDate1.get(Calendar.DAY_OF_MONTH) - birthDate.get(Calendar.DAY_OF_MONTH);

        // Adjust months and years if needed
        if (days < 0) {
            months -= 1;
            days += currentDate1.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        if (months < 0) {
            years -= 1;
            months += 12;
        }

        // Output age
        System.out.println("Age: " + years + " years, " + months + " months, " + days + " days.");

	}

}
