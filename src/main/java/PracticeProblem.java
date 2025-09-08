import java.util.Scanner; 

public class PracticeProblem {
	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String response = input.nextLine();
		System.out.println(response);
		input.close();
		
	}

	public static void q2() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int number1 = input.nextInt();
		input.nextLine();
		System.out.print("In: ");
		int number2 = input.nextInt();
		input.nextLine();
		System.out.println(number1/number2);
		System.out.println(number1%number2);
		input.close();
		
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		String response = input.nextLine();
		System.out.println(response + " was the text you wrote");
		input.close();
	}

	public static void q4() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		int number1 = input.nextInt();
		input.nextLine();
		System.out.println(number1*5);
		input.close();
	}

	public static void q5() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		boolean response = input.nextBoolean();
		input.nextLine();
		System.out.println(response + " is a boolean");
		input.close();
		
	}

	public static void q6() {
		Scanner input = new Scanner(System.in);
		System.out.print("In: ");
		double number1 = input.nextDouble();
		input.nextLine();
		System.out.println(number1-3.2);
		input.close();
		
	}

}
