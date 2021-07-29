package salaryCalculator;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;

	Employee(String name, double salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	double tax() {
		if (this.salary < 1000) {
			return 0.0;
		} else {
			return (this.salary * 0.03);
		}
	}

	double bonus() {
		if (this.workHours > 40) {
			return (this.workHours - 40) * 30.0;
		} else {
			return 0.0;
		}
	}

	double raiseSalary() {
		int currentYear = 2021;

		if (currentYear - this.hireYear < 10) {
			return (this.salary * 0.05);
		} else if ((10 <= currentYear - this.hireYear) && (currentYear - this.hireYear < 20)) {
			return (this.salary * 0.1);
		} else if (20 <= currentYear - this.hireYear) {
			return (this.salary * 0.15);
		} else {
			return 0.0;
		}
	}

	public String toString() {
		return "Ad� : " + this.name + "\nMaa�� : " + this.salary + "\n�al��ma Saati : " + this.workHours
				+ "\nBa�lang�� Y�l� : " + this.hireYear + "\nVergi : " + this.tax() + "\nBonus : " + this.bonus()
				+ "\nMaa� Art��� : " + this.raiseSalary() + "\nVergi ve Bonuslar ile birlikte maa� : "
				+ (this.salary + this.bonus() - this.tax()) + "\nToplam Maa� : " + (this.salary + this.raiseSalary());
	}
}
