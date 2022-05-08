public class JavaIfElse {
  public static void main (String [] args) {
      //IF STATEMENT : permite la ejecucion de un bloque de codigo cuando la condicion es TRUE
      int a = 12, b = 15;
      if (a < b) //Se compara si a es menor que b
        System.out.println(a + " es menor que " + b); //caso de que sea verdad, el mensaje es mostrado

      //ELSE STATEMENT : permite la ejecucion de un bloque de codigo cuando la condicion es false
      int hora = 10;
      if (hora < 12) //Compara la hora actual con el medio dia
        System.out.println("Buenos Dias!!!!"); //Si es menor entonces es de dia. Muestra el saludo indicado
      else
        System.out.println("Buenas Tardes!!!");//Caso contrario es de tarde. Muestra el saludo indicado
        
  }
}
