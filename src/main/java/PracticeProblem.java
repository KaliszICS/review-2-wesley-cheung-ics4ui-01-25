import java.util.Scanner; 

public class PracticeProblem {
	static Scanner input = new Scanner(System.in);
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		input.close();
	}

	public static void q1() {
		System.out.print("In: ");
		String response = input.nextLine();
		System.out.println(response);
		
	}

	public static void q2() {
		System.out.print("In: ");
		int number1 = input.nextInt();
		input.nextLine();
		int number2 = input.nextInt();
		input.nextLine();
		System.out.println(number1/number2);
		System.out.println(number1%number2);
		
	}

	public static void q3() {
		System.out.print("In: ");
		String response = input.nextLine();
		System.out.println(response + " was the text you wrote");
	}

	public static void q4() {
		System.out.print("In: ");
		int number1 = input.nextInt();
		input.nextLine();
		System.out.println(number1*5);
	}

	public static void q5() {
		System.out.print("In: ");
		boolean response = input.nextBoolean();
		input.nextLine();
		System.out.println(response + " is a boolean");
		
	}

	public static void q6() {
		System.out.print("In: ");
		double number1 = input.nextDouble();
		input.nextLine();
		System.out.println(number1-3.2);
		
	}

}
