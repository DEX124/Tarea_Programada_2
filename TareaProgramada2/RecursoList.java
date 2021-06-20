import java.util.ArrayList;
/**
 * Write a description of class RecursoList here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
