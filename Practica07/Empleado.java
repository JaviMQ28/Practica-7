/**
 * Clase Empleado que representa el perfil de un empleado
 * 
 * @version 1.0
 * @author Javier Alejandro Mancera Quiroz
 */
public class Empleado{
    // Representa el nombre del empleado
    protected String nombre;

    /**
     * Constructor sin parametros que representa el nombre puesto de un empleado
     */
    public Empleado(){
	this.nombre = "Javier Mancera";
    }

    /**
     * Constructor que recibe el nombre de un empleado
     *
     * @param nombre Nombre del empleado 
     */
    public Empleado(String nombre){
	this.nombre = nombre;
    }

    /**
     * Metodo que devuelve el nombre del empleado
     *
     * @return Nombre del empleado
     */
    public String getNombre(){
	return nombre;
    }

    /**
     * Metodo que asigna el nombre del empleado
     *
     * @param nombre Nombre del empleado
     */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    /**
     * Metodo toString que devuelve en forma textual el nombre del empleado
     *
     * @return Nombre del empleado  
     */
    @Override
    public String toString(){
	return "Empleado: " + this.nombre;
    }

    /**
     * Metodo equals que devuelve falso si dos nombres de empleados no se repiten, por lo contrario devuelve verdadero si se repiten 
     *
     * @return r Falso o Verdadero
     */
    public boolean equals(Object empleado){
	Empleado al = (Empleado) empleado;
	boolean r = false;
	r = this.nombre == al.getNombre();
	return r;
    }
}
