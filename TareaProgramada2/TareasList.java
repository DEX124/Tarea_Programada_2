import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 * TareasList: Arraylist que muestra la lista de asignacion de datos por tarea.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class TareasList extends ArrayList<Tareas>
{
    Tareas tarea = new Tareas();

    /**
     * asigne Datos: Se encarga de almacenar los datos por tarea.
     *
     */
    public void asigneDatos(int idT, String nomT,String fechaI, String fechaF)
    {
        tarea.asigneIDTarea(idT);
        tarea.asigneNombreTarea(nomT);
        tarea.asigneFechas(fechaI,fechaF);
    }

    /**
     * agregueResponsables: Permite al usuario agregar responsables a las tareas.
     *
     */
    public void agregueDependencia(boolean estado, Tareas tareaReq)
    {
        tarea.asigneDependencia(estado,tareaReq);
    }

    /**
     * agregueRecursos: Permite al usuario agregar recursos a las tareas.
     *
     */
    public void agregueResponsables(int idC, String nomCo)
    {
        tarea.asigneResponsable(idC, nomCo);
    }

    /**
     * agregueRecursos: Permite al usuario agregar recursos a las tareas.
     *
     */
    public void agregueRecursos(int idr, String nombreRe, int porce)
    {
        tarea.asigneRecursos(idr,nombreRe,porce);
    }

    /**
     * agregueImpedimentos: Permite al usuario agregar Impedimentos a las tareas.
     *
     */
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

    /**
     * agregueTarea: Permite al usuario agregar las tareas.
     *
     */
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
            for(int i = 0; i < lista.size();i++){
                if(lista.get(i).devuelvaID() == idL || lista.get(i).devuelvaNombreT().compareToIgnoreCase(nomLis) == 0)
                {
                    String fechaNI =(JOptionPane.showInputDialog(null,"Ingrese la nueva fecha de inicio de la tarea", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE)).toString();

                    String fechaNF = (JOptionPane.showInputDialog(null,"Ingrese la nueva fecha de finalización de la tarea", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE)).toString();

                    lista.get(i).asigneFechas(fechaNI, fechaNF);
                }
            }
        }

        if(opcionAMod.compareToIgnoreCase("Estimacion") == 0)
        {
            for(int i = 0; i < lista.size();i++){
                if(lista.get(i).devuelvaID() == idL || lista.get(i).devuelvaNombreT().compareToIgnoreCase(nomLis) == 0)
                {
                    String estimaciones[] = {"Horas","Dinero","Esfuerzo"};
                    String estimacion = (JOptionPane.showInputDialog(null,"¿Cuál estimación desea cambiar?", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE,null, estimaciones, estimaciones[0])).toString();                  
                    Scanner scan = new Scanner("");
                    if(estimacion.compareToIgnoreCase("Dinero") == 0)
                    {
                        scan = new Scanner (JOptionPane.showInputDialog(null,"¿Cuántas son las horas estimadas nuevas?", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE));
                        int dinero = scan.nextInt();
                        lista.get(i).asigneDinero(dinero);
                    }
                    if(estimacion.compareToIgnoreCase("Horas") == 0)
                    {
                        scan = new Scanner (JOptionPane.showInputDialog(null,"¿Cuántas son las horas estimadas nuevas?", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE));
                        int tiempoHrs = scan.nextInt();
                        lista.get(i).asigneHoras(tiempoHrs);
                    }
                    if(estimacion.compareToIgnoreCase("Esfuerzo") == 0)
                    {
                        String gradoDeEsfuerzo[] = {"1","2","3","4","5"};
                        scan = new Scanner ((JOptionPane.showInputDialog(null,"¿Cuál esfuerzo desea fijar?", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE,null, gradoDeEsfuerzo, gradoDeEsfuerzo[0])).toString());
                        int esfuerzo = scan.nextInt();
                        lista.get(i).asigneEsfuerzo(esfuerzo);
                    }
                }
            }
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
                    String nuevoEstado = (JOptionPane.showInputDialog(null, "¿Cuál es el estado de la tarea?", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE, null, estados, estados[0])).toString();

                    lista.get(i).asigneEstado(nuevoEstado);
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

    public void muestreTarea(TareasList listaDeTareas)
    {
        System.out.println("Lista de tareas:");
        for(Tareas tarea : listaDeTareas)
        {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Identificador de la tarea: "+tarea.devuelvaID()+"\nNombre de la tarea: "+tarea.devuelvaNombreT()+"\nFecha de Inicio: "+tarea.devuelvaFechaI()+" Fecha Final: "+tarea.devuelvaFechaF()+"\nResponsables: \n");
            tarea.devuelvaResponsables();
            if(tarea.devuelvaTiempoEstimadoHRS()>0)
            {
                System.out.println("Tiempo estimado: "+tarea.devuelvaTiempoEstimadoHRS());
            }
            if(tarea.devuelvaDinero()>0)
            {
                System.out.println("Dinero estimado: "+tarea.devuelvaDinero());
            }
            System.out.println("Esfuerzo estimado: "+tarea.devuelvaEsfuerzo()+"\nPorcentaje de avanze: "+tarea.devuelvaEstadoDeAvance()+"%");
            if(tarea.devuelvaDependencia())
            {
                System.out.println("La tarea es dependiente de la tarea: "+tarea.devuelvaTareaDependiente()); 
            }else{
                System.out.println("La tarea es independiente");
            }

            System.out.println("Recursos disponibles: \n");
            tarea.devuelvaRecursosDisponibles();

            System.out.println("Estado actual de la tarea: "+tarea.devuelvaEstado()+"\nImpedimentos: "+tarea.devuelvaImpedimentos());
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- \n");

        }
    }

}