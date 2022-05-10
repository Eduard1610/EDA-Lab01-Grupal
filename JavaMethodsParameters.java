public class JavaMethodsParameters {

    //Se pueden pasar variables dentro de un método lo que conocemos como parámetros al momento de definirlos a los métodos
    //Pueden ser de diferentes tipos de datos: int, double, String, arrays, objects, etc

    static void metodoSaludo(String name) { //Solicito un parametro String

      System.out.println("Bienvenido "+name+" al laboratorio 1 de EDA");  //Elaboro la funcion trabajando con esa variable recogida del parámetro
    }
  
    public static void main(String[] args) {

      metodoSaludo("Henry");            //Al momento de invocar al método coloco la variable del tipo de dato pedida
      metodoSaludo("Eduardo");          //Lo que se conoce como argumentos
      metodoSaludo("Kevin");
      metodoSaludo("Edmundo");                             //El output será un saludo personalizado con nuestros nombres
    }
  }