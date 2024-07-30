package JavaBeginners.JavaFiles;

public class Loop {

	public static void main(String[] args) {
		//while loop
		int i = 0;
		while (i<5) {
			System.out.println(i);
			i++;
		}
		
		//do-while loop
		int a = 0;
		do {
			System.out.println(a);
			a++;
		}
		while(a<10);

		int countDown = 3;
		while (countDown >= 0){
			System.out.println(countDown);
			countDown--;
		}
		System.out.println("Happy New Year");

	}

}
