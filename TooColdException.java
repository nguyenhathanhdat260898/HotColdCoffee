package Homework4;

public class TooColdException extends Exception {
	int tooCold;

	public TooColdException(int tooCold) {
		super();
		this.tooCold = tooCold;
	}

	public TooColdException() {
		super();
	}

	@Override
	public String getMessage() {
		String msg = "Cold";
		// TODO Auto-generated method stub
		return msg;
	}
}
