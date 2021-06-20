import java.util.ArrayList;
/**
 * Write a description of class RecursoList here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class RecursoList extends ArrayList<Recurso>
{
    public void agregueRecurso(int idr, String nombreRe,int porce)
    {
        Recurso nuevo = new Recurso();
        nuevo.asigneIDRecurso(idr);
        nuevo.asigneNombreRecurso(nombreRe);
        nuevo.asignePorcentajeRecurso(porce);
        add(nuevo);
    }
}
