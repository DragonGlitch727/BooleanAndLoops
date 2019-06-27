
public class Loops {

	public static void main(String[] args) {
		
		int i = -2;
		while (i < 100) {
			i = i + 2;
			System.out.println("all even numbers: " + i);
			}
		
		int a = 100;
		while (a > 0) {
			a = a - 3;
			if (a % 3 == 1) {
			System.out.println("every third number: " + a);	
			}
			
		}
		
		for (int b = -1; b < 100; b ++ ) {
			b += 2;
			System.out.println("every other number: " + b);
		}
		
		for (int c = 0; c  < 100; c ++) {
		 if (c % 3 == 0 && c % 5 == 0) {
			System.out.println("Hello World");
			}else if (c % 3 == 0) {
				System.out.println("Hello");			
			}else if ( c % 5 == 0) {
				System.out.println("World");
			}else{ System.out.println(c);
		}
	}
} 
	
}



