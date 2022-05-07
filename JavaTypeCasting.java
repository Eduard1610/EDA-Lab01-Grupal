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
    }
}
