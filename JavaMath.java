public class JavaMath {
    public static void main (String[] args) {
	
	//La clase Math es una clase predeterminada de java que cuenta con muchos métodos útiles
	
	//Math.max(x,y) - Encuentra el valor máx entre dos variables
	int a = 5;
	int b = 8;
	int mayor = Math.max(a,b);
	System.out.println("El mayor entre " + a + " y " + b + " es: " + mayor);

	//Math.min(x,y) - Encuentra el valor mín entre dos variables
	int c = 5;
	int d = 8;
	int menor = Math.min(c,d);
	System.out.println("El menor entre " + c + " y " + d + " es: " + menor);

	System.out.println();

	//Math.abs - Devuelve el valor absoluto (positivo) de la variable
	double numNegativo = -15.3;
	System.out.println("Valor original: " + numNegativo);
	System.out.println("Usando Math.abs: " + Math.abs(numNegativo));

	//Math.random - Devuelve un valor entre 0.0 (incluido) y 1.0 (excluido) - valores decimales
	double valorRandom = Math.random();
	System.out.println("Valor random: " + valorRandom);

	//Si quisiéramos un rango mejor podríamos multiplicarlo por el número máx que queremos que sea el tope del rango
	//Y sumamos el rango mínmo
	
	int ranMax = 100;
	int ranMin = 50;//Se incluye el 50
	int randomControlado = (int) (Math.random() * 100 + 50);//casting de decimal a entero		
	System.out.println("Valor random controlado: " + randomControlado);
	

    }
}
