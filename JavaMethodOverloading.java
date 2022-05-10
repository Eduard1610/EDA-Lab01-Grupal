public class JavaMethodOverloading {

    //Con la sobrecarga de metodos varios de estos se pueden llamar igual diferenciandose de los parametros que contienen
    static void division(int a, int b){
        System.out.println(a/b);
    }

    static void division(double a, double b){
        System.out.println(a/b);
    }

    
    public static void main(String[] args) {
        int a=5, b=2;
        double c=5, d=2;

        division(a,b);      //En vez de definir dos metodos con diferente nombre podemos sobrecargarlo

        division(c,d);      //Según que tipo de argumento que ingresemos se eligira un metodo u otro

                            //En este caso la primera division nos dará un valor int en cambio la segunda será un valor double
    }
}