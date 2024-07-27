package JavaBeginners.JavaFiles;

public class Main{
	public static void main(String[] agrs){
		System.out.println("I am Ankit");
		int myNum;
		myNum = 23;
		System.out.println(myNum);
		//change the value from 23
		myNum = 32;
		System.out.println(myNum);
		/*if you don't want the value of the variable to be changes then we can declare the variable
		as final using final keyword*/
		final int myNumb = 20;
		System.out.println(myNumb);
		float myfloatNum = 2.44f;
		char myletter = 'A';
		boolean myBool = true;
		String myText = "Ankit";
		System.out.println("Hello " + myText);
		String firstName = "Ankit";
		String lastName = "Debnath";
		String fullName = firstName + " " +lastName;
		System.out.println(fullName);
		int x = 5;
		int y = 7;
		System.out.println(x+y);
		String studentName = "Ankit Debnath";
		int studentId = 212;
		int studentAge = 12;
		float studentFee = 600.00f;
		char studentGrade = 'A';

		System.out.println(studentName);
		System.out.println(studentId);
		System.out.println(studentAge);
		System.out.println(studentFee);
		System.out.println(studentGrade);
	}
}