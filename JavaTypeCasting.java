public class JavaTypeCasting {
    public static void main (String[] args){

	//La conversión de tipos es cuando se asigna un valor de un tipo de datos primitivo a otro tipo
	//Existen dos tipos de conversiones
	
	//Widening Casting - (automáticamente) : Convierte un tipo de dato más pequeño a un tipo más grande
	//byte < short < char < int < long < float < double
	
	byte cajonChico = 8;
	int cajonGrande = cajonChico;

	System.out.println("Valor del cajoncito pequeño (ocupa menos espacio): " + cajonChico);
	System.out.println("Valor del cajon grande (ocupa más espacio): " + cajonGrande);


	//Narrowing Casting - (manualmente) : Convierte un tipo de dato a otro indicándolo entre paréntesis
	
	double valorDecimal = 16.15;
	int valorEntero = (int) valorDecimal; // Casting manual: double a int

	System.out.println(valorDecimal);     // Salida 16.15
	System.out.println(valorEntero);      // Salida 16
    }
}
