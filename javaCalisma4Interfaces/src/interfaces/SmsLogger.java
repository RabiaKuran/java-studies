package interfaces;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Sucessfully sent sms log " + message);
		
	}

}
