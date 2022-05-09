public class Comments {
    public static void main(String[]args){

        System.out.println("Comentarios en Java");
        System.out.println("Los comentarios se usan para explicar el código en Java, y hacerlo más leible. También puede ser usado para prevenir la ejecución de una porción de código específico.");
        System.out.println("\nComentarios de una sola línea.");
        System.out.println("Para esto debes agregar dos slashes (las barritas que vemos mucho en las URLs) al comienzo de la línea para que esta sea ignorada por Java.");
        //lo cierto es que no encontré modo alguno de escribir slashes en en un string pero sí los backwards \\ eso imprime un \, datazo.
        System.out.println("\nComentarios multilínea en Java");
        System.out.println("Para agregar un comentario multilíne necesitas añdir, en este orden, un slash y un * al inidio de la línea donde va a dar comienzo tu comentario y , en este estricto orden, un * y un slash al final de la línea hasta donde tu comentario finalizará.");
        /*
        También los puedes agregar antes de la línea y después de la línea, de este modo esta parte del código será ignorado por Java.
        Bastante útil cuando quieres deshabilitar por el motivo que sea cualquier método de varias líneas.
        Saludos profe Richard.
        */

    }
}
