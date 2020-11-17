package Homework4;

public class VirPerson extends CoffeeCup {
	final int tooCold = 65;
	final int tooHot = 65;

	public void drinkCoffee(CoffeeCup cup) throws TooHotException, TooColdException {
		try {
			if (cup.getTemperature() > 65) {
				throw new TooHotException();
			}
			if (cup.getTemperature() < 65) {
				throw new TooColdException();
			}
		} catch (TooHotException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		} catch (TooColdException e) {
			e.getMessage();
		}
	}
}
