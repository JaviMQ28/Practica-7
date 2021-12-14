/**
 * Clase Tecnico que, hereda propiedades de la clase Operador, representa el perfil de un tecnico
 *
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Tecnico extends Operador{

    /**
     * Constructor que recibe el nombre de un tecnico, ocupando el atributo que ya tiene la clase Operador
     * 
     * @param nombre Nombre del tecnico
     */
    public Tecnico(String nombre){
	super(nombre);
    }

    /**
     * Metodo que devuelve la actual actividad de un tecnico
     * 
     * @return Estoy trabajando
     */
    public String trabaja(){
	return "Estoy trabajando";
    }

    /**
     * Metodo toString que devuelve en forma textual el nombre del tecnico
     * 
     * @return Nombre del oficial
     */
    @Override
    public String toString(){
	return "Tecnico: " + this.nombre;
    }
}
