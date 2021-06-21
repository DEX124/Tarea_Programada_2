import java.util.ArrayList;
/**
 * Write a description of class TareasList here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class TareasList extends ArrayList<Tareas>
{
    Tareas tarea = new Tareas();

    public void asigneDatos(int idT, String nomT,String fechaI, String fechaF,int tiempo,int dinero,int esf,int porcentajeDeAvance,boolean estado, Tareas tareaReq,String estad)
    {
        tarea.asigneIDTarea(idT);
        tarea.asigneNombreTarea(nomT);
        tarea.asigneFechas(fechaI,fechaF);
        tarea.asigneHoras(tiempo);
        tarea.asigneDinero(dinero);
        tarea.asigneEsfuerzo(esf);
        tarea.asigneEstadoDeAvance(porcentajeDeAvance);
        tarea.asigneDependencia(estado,tareaReq);
        tarea.asigneEstado(estad);
    }
    
    public void agregueResponsables(int idC, String nomCo)
    {
        tarea.asigneResponsable(idC, nomCo);
    }

    public void agregueRecursos(int idr, String nombreRe, int porce)
    {
        tarea.asigneRecursos(idr,nombreRe,porce);
    }

    public void agregueImpedimentos(String impe)
    {
        tarea.asigneImpedimento(impe);
    }

    public void agregueTarea()
    {
        add(tarea);
    }
}