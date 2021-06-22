import java.util.ArrayList;
/**
 * RecursoList: añade cada recurso a la lista de recursos .
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class RecursoList extends ArrayList<Recurso>
{
    /**
     * agregueRecurso: recibe los parametros int idr (identificador de recursos),
     * 
     * string nombreRe (nombre del recurso), int porce (porcentaje necesario del recurso), para agregar un recurso
     * al arreglo de recursos necesarios para realizar una tarea.
     */
    public void agregueRecurso(int idr, String nombreRe,int porce)
    {
        Recurso nuevo = new Recurso();
        nuevo.asigneIDRecurso(idr);
        nuevo.asigneNombreRecurso(nombreRe);
        nuevo.asignePorcentajeRecurso(porce);
        add(nuevo);
    }
}
