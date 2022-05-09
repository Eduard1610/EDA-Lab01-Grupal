public class JavaWhileLoop {
  public static void main (String [] args){
    //BUCLE WHILE : Ejecuta un bloque de codigo mientras la condicion sea True
    int i = 5;
    while (i < 10) { //mientras que el valor de i sea menor a 10 se imprimira su valor
      System.out.println(i);
      i++;
    }

    //VARIANTE DO-WHILE : Ejecutara el bloque por lo menos una vez, repitiendolo mientras la condicion siga siendo TRUE
    int k = 10;
    do { // Ejecuta el bloque la primera vez
      System.out.println(i);
      k++;
    }
    while (k < 10);//verifica que la condicion se cumpla, caso contrario se termina el bucle
  }
}
