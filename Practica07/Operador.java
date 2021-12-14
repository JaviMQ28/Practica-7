/**
 * Clase Operador que, hereda propiedades de la clase Empleado, representa el perfil de un operador 
 *
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Operador extends Empleado{

    /**
     * Constructor que recibe el nombre de un operador, ocupando el atributo que ya tiene la clase Empleado
     *
     * @param nombre Nombre del operador
     */
    public Operador(String nombre){
	super(nombre);
    }

    /**
     * Metodo toString que devuelve en forma textual el nombre del operador
     * 
     * @return Nombre del operador  
     */
    @Override
    public String toString(){
	return "Operador: " + this.nombre;
    }
}
