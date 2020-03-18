package basics;

public class BasicsDemo {

	// Java is case sensitive
	void foo() {
	}

	void Foo() {
	}

	public static void main(String[] args) {

		// Class/Variable/Method name can start with $
		$ClassStartingWithDollarSign $t = new $ClassStartingWithDollarSign();
		$t.printSomething();

		// Java is case sensitive
		int id = 0;
		int Id = 0;
		int ID = 0;

		//
	}
}

class $ClassStartingWithDollarSign {

	int x = 20;

	int y = x = 99;

	public void printSomething() {
		System.out.println("Hello");
	}
}
