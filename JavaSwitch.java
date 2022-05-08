public class JavaSwitch {
  public static void main (String [] args) {
    /*SWITCH STATEMENT : El valor ingresado es comparado con cada caso,
    si ocurre un match ejecuta el bloque de codigo asociado*/
    int day = 6;
    System.out.print("Hoy es ");
    switch (day) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miercoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sabado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
    }

    /*KEYWORD - BREAK : Permite la salida del switch luego de que se logro el match
    y el bloque de codigo correspondiente se haya ejecutado.*/
    //KEYWORD - DEFAULT: Ejecuta un bloque de codigo en caso de no existir match
    day = 1;
    switch (day) {
      case 6:
        System.out.println("Hoy es Sabado, vamos a divertirnos");
        break;
      case 7:
        System.out.println("Hoy es Domingo, a descansar");
        break;
      default:
        System.out.println("Que flojera ir a trabajar");
    }
  }
}
