public class GetSet {
  /*public static void main(String[] args) {		//No funciona al no tener acceso a la clase privada Person y no utilizar Get y Set
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error 
  }*/
  public static void main(String[] args) {		//Funciona al utilizar getName y setName de la clase Person
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}