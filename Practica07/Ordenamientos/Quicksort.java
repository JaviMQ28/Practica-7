// Importar la biblioteca Random para introducir numeros aleatorios
import java.util.Random;

/**
 * Clase Quicksort que representa un tipo de ordenamiento de valores aleatorios 
 * 
 * @version 1.0 
 * @author Javier Alejandro Mancera Quiroz 
 * */
public class Quicksort{

    /**
     * Metodo principal main para poder ejecutar la clase Quicksort
     *  
     * @param args Los argumentos
     * */
    public static void main(String[] args){

	// Objeto llamado 'rmd' de la clase Random
	Random rnd = new Random();
	// Un arreglo de tipo entero con tamaño de 100,000
	int [] arr = new int[100000];

	// Ciclo for que declara una variable i de valor a 0 que aumenta hasta el limite del tamaño del arreglo
	for (int i = 0; i < arr.length; i++){
	    // Asignar un valor aleatorio del rango de 0 - 100,000 a la posicion i del arreglo
	    arr[i] = rnd.nextInt(100000);
	}

	// Imprime Desordenado
	System.out.println("******* Desordenado *******");
	
	// Ciclo for que declara una variable i de valor a 0 que aumenta hasta el limite del tamaño del arreglo
	for (int i = 0; i < arr.length; i++){
	    // Imprime el valor de la posicion i del arreglo
	    System.out.print(arr[i] + ", ");
	}

	// Imprime una linea vacia
	System.out.println();
	// Aplicar el metodo quicksort que recibe un arreglo y los tamaños del arreglo pero de tipo entero 
	quicksort(arr, 0, 99999);

	// Imprime Ordenado
	System.out.println("******* Ordenado *******");
	
	// Ciclo for que declara una variable i de valor a 0 que aumenta hasta el limite del tamaño del arreglo
	for (int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ", ");
	}  
    }

    /**
     * Metodo que realiza la comparacion entre valores del arreglo con la tecnica del divide y venceras, declarando al pivote siendo el primer elemento y demas variables para su funcionamiento ordenando los valores de menor a mayor 
     */
    public static void quicksort(int A[], int izq, int der){

	// Representa el pivote, siendo el primer valor del arreglo
	int pivote = A[izq];
	// Representa valores que comienzan por el primero 
	int i = izq;
	// Representa valores que comienzan por el ultimo
	int j = der;
	// Se crea una variable temporal para realizar el intercambio de valores
	int temp;

	// Condicional while comparando si i es menor que j
	while(i < j){
	    // Condicional while comparando si el arreglo en la posicion i es menor o igual que pivote y si i es menor que j
	    while(A[i] <= pivote && i < j){
		// Agrega un valor de 1 a i
		i++;
	    }

	    // Condicional while comparando si el arreglo en la posicion j es mayor que pivote
	    while(A[j] > pivote){
		// Resta un valor de 1 a j
		j--;
	    }

	    // Condicional if que compara el valor que tiene i con j 
	    if(i < j){
		// Se intercambia valores del arreglo en la posicion i con la posicion j
		temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	    }
	}

	// Asigna el valor que tiene la posicion izq del arreglo en la posicion j
	A[izq] = A[j];
	// Asigna el nuevo pivote a usar ocupando la posicion j
	A[j] = pivote;

	// Condicional if que compara el valor que tiene izq con j-1
	if(izq < j-1){
	    // Vuelve a aplicar el metodo quicksort recibiendo como parametros ahora al arreglo y los valores que tienen izq y j-1
	    quicksort(A, izq, j-1);
	}

	// Condicional if que compara el valor que tiene j+1 con der
	if(j+1 < der){
	    // Vuelve a aplicar el metodo quicksort recibiendo como parametros ahora al arreglo y los valores que tienen j+1 y der
	    quicksort(A, j+1, der);
	}
    }
}
