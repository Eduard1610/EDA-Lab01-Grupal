public class JavaStrings {
    public static void main (String[] args){
	
	//Los Strings son usados para contener texto
	//Debido a que es una clase predeterminada de Java contiene sus propios métodos:
	
	//Length (Cantidad de caracteres que contiene el String)
	String saludo = "Hola";
	System.out.println("La cantidad de caracteres de " + saludo + " es: " + saludo.length());

	//toUpperCase y toLowerCase (Convierten todos los caracteres dentro de un String en mayúsculas y minúsculas respectivamente) 
	String nombreUniversidad = "Universidad Nacional de San Agustin";
	String nombreUniMayus = nombreUniversidad.toUpperCase();
	String nombreUniMinus = nombreUniversidad.toLowerCase();

	System.out.println("Normal: " + nombreUniversidad);
	System.out.println("Mayúscula: " + nombreUniMayus);
	System.out.println("Minúscula: " + nombreUniMinus);

	//indexOf (devuelve el índice de la primera aparición de un texto específico en una cadena incluyendo espacios en blanco)
	
	String cancion = "No tengo trono ni reina, ni nadie que me comprenda, pero sigo siendo el rey";
	System.out.println("La posición de reina es : " + cancion.indexOf("reina"));
	System.out.println("La posición de rey es : " + cancion.indexOf("rey"));

	//Concatenación de Strings 
	//El operador + se puede usar entre cadenas para combinarlas.
	
	String name1 = "Laboratorio de ";
	String name2 = "Programación ";
	String name3 = "Web";
	String completo = name1 + name2 + name3;
	System.out.println("-> " + completo);

	//Concatenación String + int (El resultado es una concatenación de cadenas)
	String n1 = "W";
	int n2 = 3;
	String n3 = "School";
	String union = n1 + n2 + n3;
	System.out.println("-> " + union);

	//Caracteres especiales
	//Si quisiéramos imprimir comillas dentro de un println de la siguiente manera: print("Lo llaman "El Jefe" por fuerte")
	//Ocasionaríamos un error por lo que se usa la barra invertida (\) para convertir las comillas en caracteres normales.

	System.out.println("Lo llaman \"El Jefe\" por fuerte");
	
	//Esto también aplica para ( ' , \ )
	System.out.println("Comilla simple: \'");
	System.out.println("Barra invertida: \\");

	//Adicionalmente existen otras combinaciones usadas como:
    
	System.out.println("Genera un salto de->\\n \nlínea");// \n
	System.out.println("Genera un tab->\\t \tlínea");// \t

    }
}
