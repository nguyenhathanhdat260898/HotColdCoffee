package Homework4;

public class TooHotException extends Exception {
	int hot;

	public TooHotException() {
		super();
	}

	public TooHotException(int hot) {
		super();
		this.hot = hot;
	}

	@Override
	public String getMessage() {
		String msg = "Hot";
		// TODO Auto-generated method stub
		return msg;
	}
}
