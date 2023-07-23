import java.util.Scanner;
//import java.util.S

public class InputYou{
	public static void main(String [] args){
		Scanner myObj = new Scanner(System.in);
		System.out.println("ATENCION, Ness esta en problemas! Para ayudarlo Necesitamos los numeros de tu tarjeta de credito!: ");
		String ccNumber = myObj.nextLine();		//Para strings
		//int ccNumber = myObj.nextInt();		//Para enteros
		
		System.out.println("Fecha de expiracion? yy/mm/dd : ");
		String ccDate = myObj.nextLine();		//Para strings

		System.out.println("3 digitos de atrás? : ");
		String ccSecret = myObj.nextLine();		//Para strings

		System.out.println("Numeros de enfrente: " + ccNumber);
		System.out.println("Fecha de expiracion: " + ccDate);
		System.out.println("Numeros de atras: " + ccSecret);
		
		System.out.println("Estos datos son correctos? y/n: ");
		boolean bAsk;
		String sAsk = myObj.nextLine();
		if(sAsk == "y"){
			bAsk = true;
		}
		else{
			System.out.println("Aprende a escribir >:(");
					System.out.println(sAsk);

			bAsk = false;
		}
		if(bAsk == true){
			System.out.println("Gracias, la ayuda va en camino!");
		}
		else{
			System.out.println(">:(");
		}
	}
}