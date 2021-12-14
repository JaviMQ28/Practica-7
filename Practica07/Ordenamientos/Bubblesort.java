// Importar la biblioteca Random para introducir numeros aleatorios
import java.util.Random;

/**
 * Clase Bubblesort que representa un tipo de ordenamiento de valores aleatorios 
 * 
 * @version 1.0 
 * @author Javier Alejandro Mancera Quiroz 
 * */
public class Bubblesort{

    /**
     * Metodo principal main para poder ejecutar la clase Bubblesort
     *  
     * @param args Los argumentos
     * */
    public static void main(String[] args){

	// Objeto llamado 'rmd' de la clase Random
	Random rmd = new Random();
	// Un arreglo de tipo entero con tamaño de 100,000 
	int[] arr = new int [100000];

	// Ciclo for que declara una variable i de valor a 0 que aumenta hasta el limite del tamaño del arreglo
	for(int i = 0; i < arr.length; i++){
	    // Asignar un valor aleatorio del rango de 0 - 100,000 a la posicion i del arreglo
	    arr[i] = rmd.nextInt(100000);
	}

	// Imprime Desordenado
	System.out.println("******* Desordenado *******");
	
	// Ciclo for que declara una variable i de valor a 0 que aumenta hasta el limite del tamaño del arreglo
	for(int i = 0; i < arr.length; i++){
	    // Imprime el valor de la posicion i del arreglo
	    System.out.print(arr[i] + ", ");
	}

	// Imprime una linea vacia
	System.out.println();
	// Aplicar el metodo bubblesort al arreglo arr
	bubblesort(arr);

	// Imprime Ordenado
	System.out.println("******* Ordenado *******");
	
	// Ciclo for que declara una variable i de valor a 0 que aumenta hasta el limite del tamaño del arreglo
	for(int i = 0; i < arr.length; i++){
	    // Imprime el valor de la posicion i del arreglo
	    System.out.print(arr[i] + ", ");
	}
    }

    /**
     * Metodo que realiza la comparacion entre valores del arreglo y los ordena de menor a mayor 
     */
    public static void bubblesort(int[] arr){

	// Ciclo for que declara una variable i de valor a 0 que aumenta hasta el limite del tamaño del arreglo
	for(int i = 0; i < arr.length; i++){

	    // Ciclo for que declara una variable j de valor a 0 que aumenta hasta el limite restandole un valor de 1 al tamaño arreglo
	    for(int j = 0; j < arr.length - 1; j++){

		// Condicional if que compara el valor que tiene el arreglo en la posicion j con la posicion j + 1
		if (arr[j] > arr[j + 1]){
		    // Se crea una variable temporal para realizar el intercambio de valores
		    int temp = arr[j];
		    arr[j] = arr[j + 1];
		    arr[j + 1] = temp;
		}
	    }
	}
    }
}
