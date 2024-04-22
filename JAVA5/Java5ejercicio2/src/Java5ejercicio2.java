
// 2 - Tienes un array de 20 números enteros: decir cuales son pares e impares.

// +EXTRA: irlos añadiendo a nuevos arrays: 'arrayPares' y 'arrayImpares', y al final mostrar los tres arrays. En este caso, deberias saber por adelantado el length de cada uno (que hay 3 pares y 5 impares), o bien hacer arrays más grandes y dejar los últimos en null.


public class Java5ejercicio2 {
    public static void main(String[] args) throws Exception {
        
        int [] numerosEnteros = {20,30,45,50,55,6,3,7,8,9,10,11,12,13,14,55,100,19,189,202};

        int[] arrayPares = new int[numerosEnteros.length];
        int[] arrayImpares = new int[numerosEnteros.length];

        int contadorPares = 0;
        int contadorImpares = 0;

        System.out.println("Numeros pares");
        for (int i=0; i<numerosEnteros.length;i++){
            if (numerosEnteros[i] % 2 == 0) {
                System.out.println(numerosEnteros[i]);
                arrayPares[contadorPares] = numerosEnteros[i];
                contadorPares++;
            }
        }

        // % 2 = 0

        System.out.println("Numeros impares");
        for (int i=0; i<numerosEnteros.length;i++){
            if (numerosEnteros[i] % 2 != 0) {
                System.out.println(numerosEnteros[i]);
                arrayImpares[contadorImpares] = numerosEnteros[i];
                contadorImpares++;
            }
        }

        // % 2 != 0 


    }
}
