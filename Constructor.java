public class Constructor{
	/*Clase constructor, tiene variables de fecha y nombre del modelo del auto*/
	int modelYear;
	String modelName;
	
	public Constructor(int year, String name){
		// Constructor que cuenta con los atributos year y name, aqui indicamos que las variables de la clase seran los atributos de este constructor
		modelYear = year;
		modelName = name;
	}

	public static void main (String[] name){ //metodo main
		Constructor myCar = new Constructor(1969, "Mustang");	//creacion del objeto myCar con el constructor
		System.out.println(myCar.modelYear + " " + myCar.modelName); //Imprime objeto myCar con metodo modelYear  y el metodo modelName
	}
}