// 3- Premio vacaciones en Ibiza: tienes un listado de nombres de personas en un array. Aleatoriamente, seleccionar el ganador y mostrarlo. Entonces preguntar: "otra vez? (S/N)", y si es que sí, volver a generar nuevo ganador y mostrarlo. Seguir preguntando hasta que el usuario diga que no.

import java.util.Scanner;

public class Java5ejercicio3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in);
       
        String[] nombres = {"Eric","Laia","Cooper","Pol","Martí","Guille"};

        String respuestaUsuario = "";

      

        do{
            int nombreAleatorio = (int) Math.floor(Math.random() * nombres.length);
            System.out.println("El ganador es " + nombres[nombreAleatorio]);
            System.out.println("Otra vez? Si/No");
            respuestaUsuario = sc.nextLine();

        } while (!respuestaUsuario.equalsIgnoreCase("no"));

        if (respuestaUsuario.equals("no")){
            System.out.println("OK, bye bye");
        }

        sc.close();

    }
}
