public class exArraySum{
	public static void main(String[] args){
		int[] listas = {1 ,2 ,3 ,4 ,5 };
		int suma = 0, i=0;
		
		for(i=0; i<listas.length; i++){
		//for(i=0; i<5; i++){
			suma += listas[i];
		}			
		System.out.println(suma);
	}
}