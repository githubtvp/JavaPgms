import java.util.Scanner;

public class BankAccount {

	private double bal;
	private double inRate;
	private double in;

	public BankAccount(double stBal, double inR) {
		bal = stBal;
		inRate = inR;
		in = 0.0;
	}

	double getBal() {
		return bal;
	}

	double getIntRate() {
		return inRate;
	}

	double getInt() {
		return in;
	}

	void deposit(double amt) {
		bal += amt;
	}

	void withdraw(double amt) {
		bal -= amt;
	}

	void addInt() {
		in = bal * inRate / 100;
		bal += in;
	}

}
