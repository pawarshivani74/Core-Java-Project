package accessspecifiers;

import java.util.Scanner;

public class salarycalculator {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter employment type (Permanent/Contract/Hourly):");
        String employmentType = scanner.nextLine();

        double sal = 0.0; // Basic salary

        if (employmentType.equalsIgnoreCase("Permanent")) {
            System.out.println("Enter Basic Salary:");
            double basicSalary = scanner.nextDouble();
            sal = calculatePermanentSalary(basicSalary);
        } else if (employmentType.equalsIgnoreCase("Contract")) {
            sal = 20000;
        } else if (employmentType.equalsIgnoreCase("Hourly")) {
            System.out.println("Enter hours worked:");
            int hoursWorked = scanner.nextInt();
            sal = calculateHourlySalary(hoursWorked);
        }

        System.out.println("Net Salary: " + sal);

        scanner.close();
    }

    // Function to calculate net salary for Permanent employees
    private static double calculatePermanentSalary(double basicSalary) {
        double HRA = 0.1 * basicSalary;
        double DA = 0.05 * basicSalary;
        double TA = 0.02 * basicSalary;
        return basicSalary + HRA + DA + TA;
    }

    // Function to calculate net salary for Hourly employees
    private static double calculateHourlySalary(int hoursWorked) {
        double hourlyRate = 500.0;
        return hourlyRate * hoursWorked;
    }
}