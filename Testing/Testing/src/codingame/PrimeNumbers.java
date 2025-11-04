package codingame;

public class PrimeNumbers {

	public static void main(String[] args) {
		int x = 5;
		
		for(int a = 2; a <= 5; a++) {
			boolean prime = true;
			for(int b = 2; b <= a/2; b++) {
				if(a % b == 0) {
					prime = false;
				}
			}
			System.out.println(prime ? a : "");
		}

	}

}
