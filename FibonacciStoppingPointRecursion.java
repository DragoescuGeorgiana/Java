package fibonacci;

public class FibonacciStoppingPointRecursion {

	private static int index = 0;
	private static int stoppingPoint = 40;

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;

		System.out.println("index:" + index + " -> " + n1);
		fibonacciSequence(n1, n2);
	}

	public static void fibonacciSequence(int n1, int n2) {
		System.out.println("index:" + index + " -> " + n2);

		if (index == stoppingPoint)	// ne asiguram ca avem un end point astfel incat
			return;			// recursivitatea sa nu mearga la nesfarsit

		index++;

		fibonacciSequence(n2, n1+n2);

	}

}
