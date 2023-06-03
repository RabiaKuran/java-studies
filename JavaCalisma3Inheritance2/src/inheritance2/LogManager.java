package inheritance2;

public class LogManager {

	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Succesfull - database");
		}else if(logType == 2) {
			System.out.println("Succesfull - file");
		}else {
			System.out.println("Succesfull - email");
		}
	}
}

//1 - Database
//2 - File
//3 - Email