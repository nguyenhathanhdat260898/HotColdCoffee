package Homework4;

public class DeltaExceptionByZero extends Exception {
	int delta;

	public DeltaExceptionByZero(int delta) {
		super();
		this.delta = delta;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "The equation has no solution ";
	}

}
