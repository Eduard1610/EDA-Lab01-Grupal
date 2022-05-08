public class JavaForLoop {
  public static void main (String [] args){
    //BUCLE FOR : Es un tipo de bucle que se hace cuando se sabe cuantas veces se repetira el bucle
    /*
      SINTAXIS:
      for (statement 1; statement 2; statement 3) {
        ...(bloque de codigo)
      }
      Statement 1: Se ejecuta antes de iniciar el BUCLE
      Statement 2: Condicion que sera verificada para ejecutar el bloque de codigo
      Statement 3: Se ejecutara despues del bloque de codigo (por lo general es un incremento)
    */
    for (int i = 0; i <= 10; i += 2) {
      System.out.println(i);
    }

    //BUCLE FOR-EACH: Se usa cuando se esta trabajando con Arreglos (Arrays)
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) { //extrae cada elemento del array y lo asigna a la variable i
      System.out.println(i);//imprime el valor(cadena) de la variable i
    }
  }
}
