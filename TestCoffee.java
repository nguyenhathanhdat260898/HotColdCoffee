package Homework4;

public class TestCoffee {
	public static void main(String[] args) {
		VirPerson cup = new VirPerson();
		
		try {
			try {
				cup.drinkCoffee(cup);
			} catch (TooColdException e) {
				// TODO Auto-generated catch block
				e.getMessage();
			}
		} catch (TooHotException e) {
			e.getMessage();
			// TODO Auto-generated catch block
		}
	}
}
