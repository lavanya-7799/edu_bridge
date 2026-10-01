package myprojectcitnc;

abstract class Atm0{
	abstract void withdraw();
	}
abstract class Atm1 extends Atm0{
	abstract void deposite();
}

public class Atm extends Atm0{
	void withdraw( ) {
		System.out.println("withdraw");
	}
	void deposite() {
		System.out.println("deposite");
	}
	public static void main(String[]args) {
		Atm ff = new Atm();
		ff.withdraw();
		ff.deposite();
		
	}
}
