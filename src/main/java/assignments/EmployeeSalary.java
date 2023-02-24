package assignments;

import java.util.Scanner;

public class EmployeeSalary {

	int basepay;
	int boa;
	int bonus;

	public EmployeeSalary(int basepay, int boa, int bonus) {
		// TODO Auto-generated constructor stub
		this.basepay = basepay;
		this.boa = boa;
		this.bonus = bonus;
	}

	public int calculate_salary() {

		int base_sal_after_pf = calculate_base_salary_after_pf(12, basepay);
		int month_salary = base_sal_after_pf + boa + bonus;
		// System.out.println("Monthly Salary After PF :" + month_salary);

		int year_salary = month_salary * 12;
		// System.out.println("Salary per Annum is :" + year_salary);

		int final_monthly_salary = 0;

		if (year_salary < 250000) {
			final_monthly_salary = final_monthly_salary + month_salary;
		}

		else if (year_salary > 250000) {
			int deduction_per_year = calculate_tax_annum(year_salary);
			int deduction_per_month = (deduction_per_year / 12);
			// System.out.println("Tax deduction per month is :" + deduction_per_month);

			final_monthly_salary = month_salary - deduction_per_month;

		}

		return final_monthly_salary;

	}

	public int calculate_base_salary_after_pf(int percentage, int baseSalary) {

		int pf_amount = ((baseSalary * percentage) / 100);
		int base_sal_after_pf = baseSalary - pf_amount;
		return base_sal_after_pf;

	}

	public int calculate_tax_annum(int year_salary) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Tax rate : ");
		int percentage = scanner.nextInt();
		int deduction_per_year = 0;

		if (year_salary > 250000 && year_salary < 5000000) {
			deduction_per_year = (percentage * year_salary) / 100;

		}

		else if (year_salary > 500000 && year_salary < 750000) {
			deduction_per_year = (percentage * year_salary) / 100;
		}

		else if (year_salary > 750000 && year_salary < 1000000) {
			deduction_per_year = (percentage * year_salary) / 100;

		} else if (year_salary > 1000000 && year_salary < 1250000) {
			deduction_per_year = (percentage * year_salary) / 100;

		} else if (year_salary > 1250000 && year_salary < 1500000) {
			deduction_per_year = (percentage * year_salary) / 100;

		}

		// System.out.println("Tax deduction per year :" + deduction_per_year);
		return deduction_per_year;

	}

	public static void main(String[] args) {
		EmployeeSalary sal_level1 = new EmployeeSalary(7000, 5000, 2000);
		int salary_per_month_level1 = sal_level1.calculate_salary();
		System.out.println("Monthly Take Home Salary for Level 1 :" + salary_per_month_level1);

		EmployeeSalary sal_level2 = new EmployeeSalary(10000, 7000, 2500);
		int salary_per_month_level2 = sal_level2.calculate_salary();
		System.out.println("Monthly Take Home Salary for Level 2 :" + salary_per_month_level2);

		EmployeeSalary sal_level3 = new EmployeeSalary(12000, 9000, 3000);
		int salary_per_month_level3 = sal_level3.calculate_salary();
		System.out.println("Monthly Take Home Salary for Level 3 :" + salary_per_month_level3);

		EmployeeSalary sal_level4 = new EmployeeSalary(15000, 10000, 3500);
		int salary_per_month_level4 = sal_level4.calculate_salary();
		System.out.println("Monthly Take Home Salary for Level 4 :" + salary_per_month_level4);
	}

}
