package codingame;

public class TimeConversion {
	public static void main(String[] args){
		long milliseconds = 100000000;
		int seconds = (int)milliseconds / 1000;
		int days = seconds / 60 / 60 / 24;
		int hours = seconds / 60 / 60 - days * 24;
		int minutes = seconds / 60 - days * 60 * 24 - hours * 60;
		seconds = seconds - days * 60 * 60 * 24 - hours * 60 * 60 - minutes * 60;
		
		System.out.println("days:" + days + " hours:" + hours + " minutes:" + minutes + " seconds:" + seconds);
	}
}
