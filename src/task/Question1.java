package task;

/*1.write a java program that declared four integer variable a,b,c & d then, 
 * write an if statement that checks whether the sum of a and b is greater than the sum of c and d.
 * if the condition true.the program should output a message indicating that the sum of a and b is greater than
 * the sum of c and d.
*/
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 30;
		int b = 20;
		int c = 10;
		int d = 30;

		if ((a + b) > (c + d)) {
			System.out.println("the sum of 'a' and 'b' is greater than the sum of 'c' and 'd'");
		} else {
			System.out.println("the sum of 'a' and 'b' is not greater than the sum of 'c' and 'd'");
		}
	}
}
