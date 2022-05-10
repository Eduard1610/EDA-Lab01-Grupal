public class JavaMethods {
    //Declarar un metodo en una clase
    static void metodoUno(){    //metodoUno es el nombre del metodo, static significa que pertenece a la clase Main
     //Todo el codigo del metodo
    }


    //Llamada a un método
    static void metodoSaludo(){
        System.out.println("Hola esto es el lab 1 de Eda");
    }

  
    public static void main(String[] args) {    
        metodoSaludo();          //El output dira "Hola esto es el lab 1 de Eda"

        //No hay un límite de llamados
        for (int i=0; i<10; i++){
            metodoSaludo();
        }
    }
    

    




}