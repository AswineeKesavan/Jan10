package task;

public class Question9 {

	public static boolean isSeniorCitizenAge(int age) {
		// TODO Auto-generated method stub
		final int seniorCitizenAge=65;
		return (age)>=seniorCitizenAge;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=65;
		
		if(isSeniorCitizenAge(age)) {
			System.out.println(age+" is an senior citizen");
		} else {
			System.out.println(age+" is not an senior citizen");
		}
	}
}
