/**
 * Clase Main que representa los perfiles de unos empleados
 *
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz 
 */
public class Main{

    /**
     * Metodo principal para poder ejecutar la clase Main
     * 
     * @param args Los argumentos
     */
    public static void main(String[] args){

	// Objeto llamado 'empleado1' de la clase Empleado, ocupando el constructor sin parametros
	Empleado empleado1 = new Empleado();
	// Objeto llamado 'empleado2' de la clase Empleado.
	Empleado empleado2 = new Empleado("Fernando López");
	// Objeto llamado 'operador' de la clase Operador.
	Operador operador = new Operador("Roberto Carlos");
	// Objeto llamado 'directivo' de la clase Directivo.
	Directivo directivo = new Directivo("Manuel Mora");
	// Objeto llamado 'oficial' de la clase Oficial.
	Oficial oficial = new Oficial("Pedro Palma");
	// Objeto llamado 'tecnico' de la clase Tecnico.
	Tecnico tecnico = new Tecnico("Maria Llosa");

	// Imprime una linea vacia
	System.out.println();
	// Imprime Perfiles de empleados
	System.out.println("****** Perfiles de empleados ******");
	// Imprime una linea vacia
	System.out.println();
	
	// Imprime el nombre del empleado1
	System.out.println(empleado1.toString());
	
	// Imprime el nombre del empleado2
	System.out.println(empleado2.toString());

	// Compara los nombres del empleado1 y empleado2 e imprime falso si tienen nombres diferentes, por lo contrario imprime verdadero si son iguales
	System.out.println(empleado1.equals(empleado2));

	// Imprime una linea vacia
	System.out.println();
	// Imprime el nombre del operador
	System.out.println(operador.toString());

	// Imprime una linea vacia
	System.out.println();
	// Imprime el nombre del directivo
	System.out.println(directivo.toString());

	// Imprime una linea vacia
	System.out.println();
	// Imprime el nombre del oficial
	System.out.println(oficial.toString());
	// Imprime su actual actividad
        System.out.println(oficial.trabaja());

	// Imprime una linea vacia
	System.out.println();
	// Imprime el nombre del tecnico
	System.out.println(tecnico.toString());
	// Imprime su actual actividad
	System.out.println(tecnico.trabaja());
    }
}
