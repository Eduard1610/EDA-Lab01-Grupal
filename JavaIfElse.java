public class JavaIfElse {
  public static void main (String [] args) {
      //IF STATEMENT : permite la ejecucion de un bloque de codigo cuando la condicion es TRUE
      int a = 12, b = 15;
      if (a < b) //Se compara si a es menor que b
        System.out.println(a + " es menor que " + b); //caso de que sea verdad, el mensaje es mostrado

      //ELSE STATEMENT : permite la ejecucion de un bloque de codigo cuando la condicion es FALSE
      int hora = 10;
      if (hora < 12) //Compara la hora actual con el medio dia
        System.out.println("Buenos Dias!!!!"); //Si es menor entonces es de dia. Muestra el saludo indicado
      else
        System.out.println("Buenas Tardes!!!");//Caso contrario es de tarde. Muestra el saludo indicado

      //ELSE IF STATEMENT : Especifica una nueva condicion en caso de que la primera (o anterior) es FALSE
      int edad = 17;
      if (edad < 10)
        System.out.println("Soy un niño");
      else if (edad < 21)
        System.out.println("Soy un adolescente");
      else
        System.out.println("Soy un joven");

      //OPERADOR TERNARIO : Es usado para simplificar el codigo usando solo 3 operadores
      //Sintaxis : variable = (condition) ? expressionTrue :  expressionFalse;
      hora = 15;
      String mensaje = (hora < 12) ? "Buenos Dias!!!" : "Buenas Tardes!!!";
      System.out.println(mensaje);
  }
}
