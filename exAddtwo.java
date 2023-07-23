import java.util.Scanner;

public class exAddtwo {
	public static void main (String[] args){
		int numba1 = 5;
		int numba2 = 10;
		
		System.out.println("Ingrese primer digito: ");
		Scanner myObj = new Scanner(System.in);			//Definimos objeto para el scanner
		
		numba1 = myObj.nextInt();
		
		System.out.println("Ingrese segundo digito: ");
		numba2 = myObj.nextInt();

		
		System.out.println(numba1 + numba2);
	}
}