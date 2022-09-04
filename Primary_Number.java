package week1.day1;

public class Primary_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 13;
		int count = 0;

		for (int i = 2; i <= num - 1; i++) {
			if (num % i == 0) {
				count++;
				System.out.println(count);
			}
		}
		if (count == 0) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("It is not a prime number");
		}
	}
}
