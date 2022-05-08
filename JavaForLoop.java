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
    
  }
}
