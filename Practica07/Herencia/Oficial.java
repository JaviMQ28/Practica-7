/**
 * Clase Oficial que, hereda propiedades de la clase Operador, representa el perfil de un oficial
 *
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Oficial extends Operador{

    /**
     * Constructor que recibe el nombre de un oficial, ocupando el atributo que ya tiene la clase Operador
     * 
     * @param nombre Nombre del oficial
     */
    public Oficial(String nombre){
	super(nombre);
    }

    /**
     * Metodo que devuelve la actual actividad de un oficial
     *
     * @return Estoy trabajando
     */
    public String trabaja(){
	return "Estoy trabajando";
    }

    /**
     * Metodo toString que devuelve en forma textual el nombre del oficial
     * 
     * @return Nombre del oficial
     */
    @Override
    public String toString(){
	return "Oficial: " + this.nombre;
    }
}
