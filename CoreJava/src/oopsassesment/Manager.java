package oopsassesment;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 30 Oct 2024
 * Time   : 9:24:22 am
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class Manager extends Employee {
	private Developer[] developers;
	private int developerCount = 0;

	// Constructor for Manager with maximum number of developers
	public Manager(String name, double salary, int maxDevelopers) {
		super(name, salary);
		developers = new Developer[maxDevelopers];
	}

	// Method to add a developer to the manager's team
	public void addDeveloper(Developer developer) {
		if (developerCount < developers.length) {
			developers[developerCount++] = developer;
		} else {
			System.out.println("Cannot add more developers. Max limit reached.");
		}
	}

	// Overridden method to include managed developers in the details
	@Override
	public String getDetails() {
		StringBuilder details = new StringBuilder(super.getDetails() + ", Managing Developers:");
		for (int i = 0; i < developerCount; i++) {
			details.append("\n  ").append(developers[i].getDetails());
		}
		return details.toString();
	}
}

// Derived class: Developer
class Developer extends Employee {
	private String programmingLanguage;

	// Constructor for Developer
	public Developer(String name, double salary, String programmingLanguage) {
		super(name, salary);
		this.programmingLanguage = programmingLanguage;
	}

	// Getter for programming language
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	// Overridden method to include programming language in the details
	@Override
	public String getDetails() {
		return super.getDetails() + ", Programming Language: " + programmingLanguage;
	}
}

