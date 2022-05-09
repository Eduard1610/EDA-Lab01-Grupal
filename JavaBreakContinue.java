public class JavaBreakContinue {
  public static void main (String [] args){
    //BREAK : Al igual que en SWITCH, en los bucles permite salir de ellos.
    int i = 0;
    while (i < 10) {//el bucle esta diseñado para repetirse mientras "i" sea menor a 10
      System.out.println(i);
      i++;
      if (i == 4) {//Sin embargo en caso de que "i" tenga el valor de 4 se detendra el bucle
        break;
      }
    }

    //CONTINUE : Cuando se ejecuta, detiene la ejecucion total del bloque y pasa a la siguiente iteracion
    int k = 0;
    while (k < 10) {
      if (k == 4) {
        k++;
        continue;
        //Cuando se llegue a la linea de codigo superior (luego de que k == 4 llege a ser TRUE)
        //no se ejecutara el resto del bloque pasando a la siguiente iteracion
      }
      System.out.println(i);
      k++;
    }
  }
}
