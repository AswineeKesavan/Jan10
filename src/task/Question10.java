package task;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 123456;
		int digitCount = count(number);
		System.out.println("Number of digits in " + number + " is: " + digitCount);
	}

	public static int count(int number) {
		String numberString = Integer.toString(number);
		return numberString.length();
	}
}
