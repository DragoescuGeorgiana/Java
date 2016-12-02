package instructiunea_for;

// Sa se calculeze n! unde n este initializat in program
//Exemplu 4! = 4*3*2*1 = 24 SAU 6! = 6*5*4*3*2*1
//Formula factorial: N!=N*(N-1)!

public class Factorial {

	public static void main(String[] args) {

		long f = 1;
		int n = 15;
		int i;

		for (i = 0; i <= n; i++);
		// f=f*i;

		System.out.println(n + "!=" + f);
	}

}
