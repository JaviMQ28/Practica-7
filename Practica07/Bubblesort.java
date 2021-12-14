import java.util.Random;

public class Bubblesort{

    public static void main(String[] args){
	Random rmd = new Random();
	int[] arr = new int [10];
	for(int i = 0; i < arr.length; i++){
	    arr[i] = rmd.nextInt(10);
	}

	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ", ");
	}

	System.out.println();
	bubblesort(arr);

	for(int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ", ");
	}
    }

    public static void bubblesort(int[] arr){
	for(int i = 0; i < arr.length; i++){
	    for(int j = 0; j < arr.length - 1; j++){
		if (arr[j] > arr[j + 1]){
		    int temp = arr[j];
		    arr[j] = arr[j + 1];
		    arr[j + 1] = temp;
		}
	    }
	}
    }
}
