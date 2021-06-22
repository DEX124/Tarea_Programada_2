import java.util.ArrayList;
/**
 *Tareas: Clase con todos los elementos para la creacion de una tarea. 
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class Tareas
{
    
    int idTareas; //Almacena el id de la tarea proporcionado por el usuario.
    String nombreTarea; //Almacena el nombre de la tarea proporcionado por el usuario.
    String fechaInicio; //Almacena la fecha de inicio de la tarea proporcionado por el usuario.
    String fechaFinal; //Almacena la fecha final de la tarea proporcionado por el usuario.
    ColaboradorList responsables; //Almacena colaboradores de la lista a la tarea
    int tiempoEstimadoHRS; //Almacena el tiempo estimado de la tarea proporcionado por el usuario.
    int dineroEstimado; //Almacena el dinero estimado de la tarea proporcionado por el usuario.
    int esfuerzo; //Almacena el esfuerzo estimado de la tarea proporcionado por el usuario.
    int estadoDeAvance; //Almacena el estado de avance de la tarea proporcionado por el usuario.
    boolean dependencia; //Almacena la dependencia con una tarea de otra
    Tareas tareaRequerida; //Almacena la tarea dependiente de otra.
    RecursoList recursosDisponibles; //Almacena un recurso a la tarea de la lista de recursos
    String estado; //Almacena el estado de la tarea proporcionado por el usuario.
    ArrayList<String> impedimentos; //Almacena una lista de impedimentos por tarea opcional proporcionado por el usuario

    /**
     * Tareas():  Es el constructor de objetos de la clase Tareas
     * 
     */
    public Tareas()
    {
        idTareas= -1;
        nombreTarea = "";
        fechaInicio = "";
        fechaFinal = "";
        
        responsables  = new ColaboradorList();
        
        tiempoEstimadoHRS = 0;
        dineroEstimado = 0;
        esfuerzo = 0;
        estadoDeAvance = 0;
        dependencia = false;
        recursosDisponibles = new RecursoList();
        estado = "Por hacer";
        impedimentos  = new ArrayList<String>();
    }

    /**
     * asigneIDTarea: Se enecarga de almacenar la ID proporcionada por el usuario en la variable idTareas
     * 
     * @param idT:  Recibe un int que determina el ID de la tarea
     */
    public void asigneIDTarea (int idT)
    {
        idTareas = idT;
    }

    /**
     * asigneNombreTarea:  Se encarga de almacenar el nombre de la tarea proporcionado por el usuario
     *
     * @param nomT: Recibe un String que determina el nombre de la tarea
     */
    public void asigneNombreTarea(String nomT)
    {
        nombreTarea = nomT;
    }

    /**
     * asigneNombreFechas:  Se encarga de almacenar las fechas de las tareas proporcionado por el usuario
     *
     */
    public void asigneFechas (String fechaI, String fechaF)
    {
        fechaInicio = fechaI;
        fechaFinal = fechaF;
    }

    /**
     * asigneNombreResponsable:  Se encarga de almacenar los nombres de los responsables de las tareas proporcionado por el usuario
     *
     */
    public void asigneResponsable(int idC, String nomCo)
    {
        responsables.agregueColaborador(idC, nomCo);
    }

    /**
     * asigneHoras:  Se encarga de almacenar el tiempo estimado de las tareas proporcionado por el usuario
     *
     */
    public void asigneHoras(int tiempo)
    {
        tiempoEstimadoHRS = tiempo;
    }

    /**
     * asigneDinero:  Se encarga de almacenar el dinero estimado de las tareas proporcionado por el usuario
     *
     */
    public void asigneDinero (int dinero)
    {
        dineroEstimado = dinero;
    }

    /**
     * asigneEsfuerzo:  Se encarga de almacenar el esfuerzo estimado de las tareas proporcionado por el usuario
     *
     */
    public void asigneEsfuerzo(int esf)
    {
        esfuerzo = esf;
    }

    /**
     * asigneEstadoDeAvance:  Se encarga de almacenar el estado de avance de las tareas proporcionado por el usuario
     *
     */
    public void asigneEstadoDeAvance(int porcentajeDeAvance)
    {
        estadoDeAvance = porcentajeDeAvance;
    }

    /**
     * asigneDependencia: Se encarga de almacenar la dependencia de las tareas proporcionado por el usuario
     *
     */
    public void asigneDependencia(boolean estado, Tareas tareaReq)
    {
        dependencia = estado;
        tareaRequerida = tareaReq;
    }

    /**
     * asigneRecursos:  Se encarga de almacenar el nombre de los recursos de las tareas proporcionado por el usuario
     *
     */
    public void asigneRecursos (int idr, String nombreRe, int porce)
    {
        recursosDisponibles.agregueRecurso(idr,nombreRe,porce);
    }

    /**
     * asigneEstado:  Se encarga de almacenar el estado de las tareas proporcionado por el usuario
     *
     */
    public void asigneEstado (String estad)
    {
        estado = estad;
    }

    /**
     * asigneImpedimento:  Se encarga de almacenar algun impedimento de las tareas proporcionado por el usuario
     *
     */
    public void asigneImpedimento(String impe)
    {
        impedimentos.add(impe);
    }

    /**
     * duelvaID: Se encarga de devolver el ID
     *
     */
    public int devuelvaID ()
    {
        return idTareas;
    }

    /**
     * duelvaNombreT: Se encarga de devolver el nombre de la tarea.
     *
     */
    public String devuelvaNombreT ()
    {
        return nombreTarea;
    }

    /**
     * duelvaFechaI: Se encarga de devolver la fecha inicial de la tarea.
     *
     */
    public String devuelvaFechaI()
    {
        return fechaInicio;
    }

    /**
     * duelvaFechaF: Se encarga de devolver la fecha final de la tarea.
     *
     */
    public String devuelvaFechaF()
    {
        return fechaFinal;
    }

    /**
     * duelvaResponsables: Se encarga de devolver los responsables de la tarea.
     *
     */
    public void devuelvaResponsables()
    {
        for (Colaborador per : responsables) {
            System.out.println("ID: "+per.muestreIDColaborador()+"\n"+"Nombre: "+per.muestreNombreColaborador()+"\n"+"Horas laborales: "+per.muestreHorasLaborales());
        }
    }

    /**
     * duelvaTiempoEstimadoHRS: Se encarga de devolver el tiempo estimado de la tarea.
     *
     */
    public int devuelvaTiempoEstimadoHRS ()
    {
        return tiempoEstimadoHRS;
    }

    /**
     * duelvaDinero: Se encarga de devolver el dinero estimado de la tarea.
     *
     */
    public int devuelvaDinero()
    {
        return dineroEstimado;
    }

    /**
     * duelvaEsfuerzo: Se encarga de devolver el esfuerzoestimado de la tarea.
     *
     */
    public int devuelvaEsfuerzo()
    {
        return esfuerzo;
    }

     /**
     * duelveEstadodeAvance: Se encarga de devolver el estado de Avance de la tarea.
     *
     */
    public int devuelvaEstadoDeAvance()
    {
        return estadoDeAvance;
    }

    /**
     * duelvaDependencia: Se encarga de devolver si una tarea es dependiente o no.
     *
     */
    public boolean devuelvaDependencia()
    {
        return dependencia;
    }

    /**
     * duelvaTareaDependiente: Se encarga de devolver la dependencia de una tarea con otra.
     *
     */
    public Tareas devuelvaTareaDependiente()
    {
        return tareaRequerida;
    }

    /**
     * duelvaRecursosDisponibles: Se encarga de devolver los recursos disponibles para una tarea.
     *
     */
    public void devuelvaRecursosDisponibles()
    {
        for (Recurso rec : recursosDisponibles) {
            System.out.println("ID: "+rec.muestreIDRecurso()+"\n"+"Nombre: "+rec.muestreNombreRecurso()+"\n"+"Horas laborales: "+rec.muestrePorcentajeRecurso()+"%");
        }
    }

    /**
     * duelvaEstado: Se encarga de devolver el estado de la tarea.
     *
     */
    public String devuelvaEstado()
    {
        return estado;
    }

    /**
     * duelvaImpedimentos: Se encarga de devolver un Arraylist con la lista de impedimentos de la tarea.
     *
     */
    public ArrayList devuelvaImpedimentos()
    {
        return impedimentos;
    }
}
