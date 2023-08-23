package sdet_Assignments;

public class Assignments {

	public static void main(String[] args) {

		SavingsAccount Savings = new SavingsAccount();
		CurrentAccount Current = new CurrentAccount();
		System.out.println("SavingsAccount rate of Interest: " + Savings.interest());
		System.out.println("CurrentAccount rate of Interest: " + Current.interest());

	}
}

class Account {
	long intrst;
	double interest(int p, double r, int t) {
		intrst = (long) (p * r * t);
		return intrst;
	}
}

class SavingsAccount extends Account {
	double interest() {
		double d = interest(1000, 0.08, 4);
		return d;
	}
}

class CurrentAccount extends Account {
	double interest() {
		double Cal = interest(1000, 0.1, 4);
		return Cal;
	}
}
