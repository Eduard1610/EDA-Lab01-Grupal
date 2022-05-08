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
    }
}
