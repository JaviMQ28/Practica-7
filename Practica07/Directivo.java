/**
 * Clase Directivo que, hereda propiedades de la clase Empleado, representa el perfil de un directivo
 *
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Directivo extends Empleado{

    /**
     * Constructor que recibe el nombre de un directivo, ocupando el atributo que ya tiene la clase Empleado
     *
     * @param nombre Nombre del directivo
     */
    public Directivo(String nombre){
	super(nombre);
    }

    /**
     * Metodo toString que devuelve en forma textual el nombre del directivo
     * 
     * @return Nombre del directivo  
     */
    @Override
    public String toString(){
	return "Directivo: " + this.nombre;
    }
}
