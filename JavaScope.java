public class JavaScope {

    //Vamos a ver el alcance de las variables dentro de una clase


    //Aqui no se puede usar nombre

    String nombre ="";

    //Aquí ya se podrá reconocer la variable nombre


    //Si una variable es delcarada recién dentro de un bloque sólo se podra usar dentro del mismo

    static void EjemploScope(){
        int numero=5;   

        //Aquí se podrá usar la variable numero
    }

    //Aqui ya no se puede usar la variable numero
    public static void main(String[] args) {
        System.out.println("Hello World");
        //Aquí tampoco
    }

    //Esto funciona para todos los bloques con llavez como métodos, condicionales, bucles
}