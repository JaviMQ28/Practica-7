import java.util.Random;

public class Quicksort{

    public static void main(String[] args){

	Random rnd = new Random();
	int [] datos = new int[10];
	System.out.println("Elemento aleatorio: " + rnd.nextInt(10));
	
	System.out.println();

	System.out.println("En desorden:");
	for (int k = 0; k < datos.length; k++){
	    datos[k] = rnd.nextInt(10);
	    System.out.print(datos[k] + ", ");
	}

	quickSort(datos,0,9);
	System.out.println("En orden:");
	System.out.println();
	
	/*
	  for (int k = 0; k < datos.length; k++){
	    datos[k] = rnd.nextInt(10);
	    System.out.println("Elemento aleatorio: " + datos[k]);
	    for (int i = 9; i >= 0; i--){
	    System.out.println("Elemento aleatorio: " + datos[i]);
	}
	}*/

	System.out.println();
	
	quickSort(datos,0,8);
	System.out.println(datos);

	System.out.println();

	/*
	for (int k = 9; k >= 0; k--){
	    datos[k] = rnd.nextInt(10);
	    System.out.println("Elemento aleatorio: " + datos[k]);
	}

	System.out.println();
	
	int pivote = 4;
	int [] datos1 = new int[10];

	datos1[0] = pivote;

	System.out.println();
	System.out.println("Pivote: " + datos1[0]);

	for (int i = 0; i < datos1.length; i++){
	    datos1[i] = rnd.nextInt(10);
	    System.out.print(datos1[i] + " , ");
	}
	*/

	//intercambio(datos1);
 
    }

    /* public static void intercambio(int [] datos1){
	for (int i = 0; i < datos1.length; i++){
	    for (int j = 0; j < datos1.length; j++){
		if(datos1[i] > datos1[j]){
		    int temp = datos1[i];
		    datos1[i] = datos1[j];
		    datos1[j] = temp;
		    }
		}
	    }
	}
    */

    public static void quickSort(int A[], int izq, int der){

	int pivote = A[izq];
	int i = izq;
	int j = der;
	int aux;

	while(i < j){
	    while(A[i] <= pivote && i < j){
		i++;
	    }
	    while(A[j] > pivote){
		j--;
	    }
	    if(i < j){
		aux = A[i];
		A[i] = A[j];
		A[j] = aux;
	    }
	}

	A[izq] = A[j];
	A[j] = pivote;

	if(izq < j-1){
	    quickSort(A, izq, j-1);
	}

	if(j+1 < der){
	    quickSort(A, j+1, der);
	}
    }
}
