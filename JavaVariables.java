public class JavaVariables {
    public static void main (String[] args){

	//Tipos de variables en Java
	
	String text = "Hello";    //almacena cadenas de texto entre comillas
	int number = 1;           //almacena valores numéricos enteros
	double decimal = 1.5;     //almacena valores numéricos decimales
	char caracter = 'a';      //almacena caracteres, usa comillas simples
	boolean estado = true;    //almacena valores con dos estados (verdadero o falso)

	//Declaración y asignación de variables
	
	//Declaración
	int n1;
	//Asignación
	n1 = 5;

	//También se puede declarar e inicializar directamente (como los primeros ejemplos)
	int n2 = 10; 
	
	//**********VARIABLES FINALES***********
	//Agregando la palabra "final" antes del tipo de variable
	
	final String palabra = "Eterno";//Esta variable no puede cambiar de valores
	//Si escribieramos : palabra = "cambio"; provocaría un error
	
	
	//Imprimir variables
	//El método println() se usa a menudo para mostrar variables. Para combinar texto y una variable, use el carácter +:
	
	String nombre = "Enrique";
	String apellido = "Gutierrez";
	String nombreCompleto = nombre + " " + apellido;

	System.out.println("Nombre y apellido: " + nombreCompleto);

	//Para declarar e inicializar muchas variables podemos usar una lista separada por comillas
	
	int a = 15, b = 20, c = 30;

	//También se puede asignar el mismo valor a múltiples variables en una línea
	int v1, v2, v3;
	v1 = v2 = v3 = 60;
	System.out.println("v1: " + v1 + "\nv2: " + v2 + "\nv3: " + v3);

    }
}
