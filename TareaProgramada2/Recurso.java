
/**
 * Recurso: define y asigna las variables que conforman cada recurso. .
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/15/2021)
 */
public class Recurso
{
    String nombre; // Es el nombre del recurso
    int identificadorRecurso; // Es el numero de identificador del recurso
    int porcentajeDeAsig; //Es el porcentaje del recurso que se le va a asignar a cierta tarea
    
    /**
     * Recurso: asigna los valores de inicio a cada variable del recurso
     */
    public Recurso ()
    {
        nombre = "";
        identificadorRecurso = -1;
        porcentajeDeAsig = 0;
    }
    
    /**
     * asigneNombreRecurso: recibe el parametro string nom (nombre del recurso) de parte del usuario y lo asigna al recurso
     */
    public void asigneNombreRecurso(String nom)
    {
        nombre = nom;
    }
    
    /**
     * asigneIDRecurso: recibe el parametro int id (numero de identificador del recurso) y se lo asigna al recurso 
     */
    public void asigneIDRecurso(int id)
    {
        identificadorRecurso = id;
    }
    
    /**
     * asignePorcentajeRecurso: recibe el parametro int porce (porcentaje del recurso que se le asigna a la tarea) y se lo asigna al recurso
     */
    public void asignePorcentajeRecurso (int porce)
    {
        porcentajeDeAsig = porce;
    }
    
    /**
     * muestreNombreRecurso: retorna el nombre del recurso
     */
    public String muestreNombreRecurso()
    {
        return nombre;
    }
    
    /**
     * muestreIDRecurso: retorna el numero de identificación del recurso
     */
    public int muestreIDRecurso ()
    {
        return identificadorRecurso;
    }
    
    /**
     * muestrePorcentajeRecurso: retorna el porcentaje del recurso
     */
    public int muestrePorcentajeRecurso ()
    {
        return porcentajeDeAsig;
    }
}
