public class JavaRecursion {
    //La recursividad es una técnica que tiene Java para llamarse un método a si mismo
    //Sirve para desglosar la dificultad de algún problema complejos
    //Divide y vencerás

    //Entendiendo la idea de factorial es un claro ejemplo de recursividad porque !n= n-1!*n
    
        public static int Factorial(int num){
            if (num<2){
                return num;                   //Se tiene un caso base donde el método tiene su fin
            }
            else {
                return num=Factorial(num-1)*num;    //Se hace la llamada al mismo método (recursividad)
            }
        }

    public static void main(String[] args) {
        //Factorial de 6
        int num_Factorial=Factorial(6);
        System.out.println(num_Factorial);         //Hay que tener cuidado con la recursividad dada su complejidad y evitar que se llame asi misma infinitamente
    }
}