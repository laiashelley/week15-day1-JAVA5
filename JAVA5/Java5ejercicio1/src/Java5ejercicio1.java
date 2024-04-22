// 1 - Crear un array de lo que desees, pero con el tamaño que diga el usuario. Luego añadir elementos hasta que se rellene. Luego mostrarlo.

import java.util.Scanner;

public class Java5ejercicio1 {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("¿Cuantos valores quieres que tenga la lista de grupos de música?");

        int cantidadArray = sc.nextInt();

        String[] bandasMusica = new String[cantidadArray];
        sc.nextLine();

        for (int i = 0; i < cantidadArray; i++) {
            System.out.println("Escribe el nombre de la banda de musica");
            bandasMusica[i] = sc.nextLine();
        }

        System.out.println("La lista de bandas de música es:");

        for (String bandas: bandasMusica){
            System.out.println(bandas);
        }

        sc.close();

    }
}
