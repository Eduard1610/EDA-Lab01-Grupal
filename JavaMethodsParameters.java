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
      metodoSaludo("Edmundo");          //El output será un saludo personalizado con nuestros nombres

      metodoEjemplo("Luis", 15,'m');
    }

    //Se puede llamar a varios párametros a la vez
    static void metodoEjemplo(String name, int age, char gender){
        System.out.println("Nombre: "+name+"\nEdad: "+age+"\nGénero: "+gender);
    }

    //Se puede elegir el tipo de retorno del método con un tipo de dato
    static double division(int a, int b){
    double num=a/b;
    return num;
    }

    //O solo usar void si se quiere sin retorno
    static void division2(int a, int b){
        double num2=a/b;
        System.out.println(num2);
    }
    
  }