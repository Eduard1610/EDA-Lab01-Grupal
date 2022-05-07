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
    }
}
