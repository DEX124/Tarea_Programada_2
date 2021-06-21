import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * Write a description of class TareasList here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class TareasList extends ArrayList<Tareas>
{
    Tareas tarea = new Tareas();

    public void asigneDatos(int idT, String nomT,String fechaI, String fechaF)
    {
        tarea.asigneIDTarea(idT);
        tarea.asigneNombreTarea(nomT);
        tarea.asigneFechas(fechaI,fechaF);
    }

    public void agregueDependencia(boolean estado, Tareas tareaReq)
    {
        tarea.asigneDependencia(estado,tareaReq);
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

    public void agregueEstado(String estad,int porcentajeDeAvance)
    {
        tarea.asigneEstado(estad);
        tarea.asigneEstadoDeAvance(porcentajeDeAvance);
    }

    public void agregueEstima(int tiempo,int dinero,int esf)
    {
        tarea.asigneHoras(tiempo);
        tarea.asigneDinero(dinero);
        tarea.asigneEsfuerzo(esf);
    }

    public void agregueTarea()
    {
        add(tarea);
    }

    public void modifiqueTarea (TareasList lista, String opcionAMod,int idL, String nomLis)
    {
        if(opcionAMod.compareToIgnoreCase("ID") == 0)
        {
            for(int i = 0; i < lista.size();i++){
                if(lista.get(i).devuelvaID() == idL || lista.get(i).devuelvaNombreT().compareToIgnoreCase(nomLis) == 0)
                {
                    Scanner scan = new Scanner ((JOptionPane.showInputDialog(null,"Ingrese la nueva ID de la Tarea", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE)));
                    int idN = scan.nextInt();
                    lista.get(i).asigneIDTarea(idN);
                }
            }
        }
        
        if(opcionAMod.compareToIgnoreCase("Nombre") == 0)
        {
            for(int i = 0; i < lista.size();i++){
                if(lista.get(i).devuelvaID() == idL || lista.get(i).devuelvaNombreT().compareToIgnoreCase(nomLis) == 0)
                {
                    Scanner scan = new Scanner ((JOptionPane.showInputDialog(null,"Ingrese el nuevo nombre de la tarea", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE)));
                    lista.get(i).asigneNombreTarea(scan.toString());
                }
            }
        }
        
        if(opcionAMod.compareToIgnoreCase("Fechas") == 0)
        {

        }
        if(opcionAMod.compareToIgnoreCase("Estimacion") == 0)
        {

        }
        
        if(opcionAMod.compareToIgnoreCase("Progreso de avance") == 0)
        {
            for(int i = 0; i < lista.size();i++){
                if(lista.get(i).devuelvaID() == idL || lista.get(i).devuelvaNombreT().compareToIgnoreCase(nomLis) == 0)
                {
                    Scanner scan = new Scanner ((JOptionPane.showInputDialog(null,"Ingrese el nuevo porcentaje de la tarea", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE)));
                    int porcentaje = scan.nextInt();
                    lista.get(i).asigneEstadoDeAvance(porcentaje);
                }
            }
        }
        
        if(opcionAMod.compareToIgnoreCase("Estado de la tarea") == 0)
        {
            for(int i = 0; i < lista.size();i++){
                if(lista.get(i).devuelvaID() == idL || lista.get(i).devuelvaNombreT().compareToIgnoreCase(nomLis) == 0)
                {
                    String estados [] = {"Por hacer","Haciendo", "Finalizado","Pausado","Abortado"};
                    Scanner scan = new Scanner ((JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones de la tarea desea modificar?", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0])).toString());
                    lista.get(i).asigneEstado(scan.toString());
                }
            }
        }
    }

    public void elimineTarea(TareasList lista,int idL, String nomLis)
    {
        for(int i = 0; i < lista.size();i++){
            if(lista.get(i).devuelvaID() == idL || lista.get(i).devuelvaNombreT().compareToIgnoreCase(nomLis) == 0)
            {
                remove(i);
            }
        }
    }

}