import java.util.ArrayList;
/**
 * Write a description of class Tareas here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class Tareas
{
    int idTareas;
    String nombreTarea;
    String fechaInicio;
    String fechaFinal;
    ColaboradorList responsables;
    int tiempoEstimadoHRS;
    int dineroEstimado;
    int esfuerzo;
    int estadoDeAvance;
    boolean dependencia;
    Tareas tareaRequerida;
    RecursoList recursosDisponibles;
    String estado;
    ArrayList<String> impedimentos;

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
        tiempoEstimadoHRS = -1;
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

    public void asigneNombreTarea(String nomT)
    {
        nombreTarea = nomT;
    }

    public void asigneFechas (String fechaI, String fechaF)
    {
        fechaInicio = fechaI;
        fechaFinal = fechaF;
    }

    public void asigneResponsable(int idC, String nomCo)
    {
        responsables.agregueColaborador(idC, nomCo);
    }

    public void asigneHoras(int tiempo)
    {
        tiempoEstimadoHRS = tiempo;
    }

    public void asigneDinero (int dinero)
    {
        dineroEstimado = dinero;
    }

    public void asigneEsfuerzo(int esf)
    {
        esfuerzo = esf;
    }

    public void asigneEstadoDeAvance(int porcentajeDeAvance)
    {
        estadoDeAvance = porcentajeDeAvance;
    }

    public void asigneDependencia(boolean estado, Tareas tareaReq)
    {
        dependencia = estado;
        tareaRequerida = tareaReq;
    }

    public void asigneRecursos (int idr, String nombreRe, int porce)
    {
        recursosDisponibles.agregueRecurso(idr,nombreRe,porce);
    }

    public void asigneEstado (String estad)
    {
        estado = estad;
    }

    public void asigneImpedimento(String impe)
    {
        impedimentos.add(impe);
    }

    public int devuelvaID ()
    {
        return idTareas;
    }

    public String devuelvaNombreT ()
    {
        return nombreTarea;
    }

    public String devuelvaFechaI()
    {
        return fechaInicio;
    }

    public String devuelvaFechaF()
    {
        return fechaInicio;
    }

    public void devuelvaResponsables()
    {
        for (Colaborador per : responsables) {
            System.out.println("ID: "+per.muestreIDColaborador()+"\n"+"Nombre: "+per.muestreNombreColaborador()+"\n"+"Horas laborales: "+per.muestreHorasLaborales());
        }
    }

    public int devuelvaTiempoEstimadoHRS ()
    {
        return tiempoEstimadoHRS;
    }

    public int devuelvaDinero()
    {
        return dineroEstimado;
    }

    public int devuelvaEsfuerzo()
    {
        return esfuerzo;
    }

    public int devuelvaEstadoDeAvance()
    {
        return estadoDeAvance;
    }

    public boolean devuelvaDependencia()
    {
        return dependencia;
    }

    public Tareas devuelvaTareaDependiente()
    {
        return tareaRequerida;
    }

    public void devuelvaRecursosDisponibles()
    {
        for (Recurso rec : recursosDisponibles) {
            System.out.println("ID: "+rec.muestreIDRecurso()+"\n"+"Nombre: "+rec.muestreNombreRecurso()+"\n"+"Horas laborales: "+rec.muestrePorcentajeRecurso()+"%");
        }
    }

    public String devuelvaEstado()
    {
        return estado;
    }

    public ArrayList devuelvaImpedimentos()
    {
        return impedimentos;
    }

    public static void main (String args[])
    {
        Tareas primeraTarea = new Tareas();

        primeraTarea.asigneIDTarea(724);
        primeraTarea.asigneNombreTarea("Tarea de Progra I");
        primeraTarea.asigneFechas("Agosto","Diciembre");
 
        primeraTarea.asigneResponsable(7,"Valery");
        primeraTarea.asigneResponsable(2,"Diego");
        primeraTarea.asigneResponsable(15,"Seilyn");

        primeraTarea.asigneHoras(27);
        primeraTarea.asigneDinero(700);
        primeraTarea.asigneEsfuerzo(5);
        primeraTarea.asigneEstadoDeAvance(25);

        primeraTarea.asigneRecursos(777,"Goma Loca",100);
        
        primeraTarea.asigneImpedimento("Falta de tiempo");

        System.out.println("ID: "+primeraTarea.devuelvaID()+" Nombre: "+primeraTarea.devuelvaNombreT()+"\n"+"Fecha de Inicio: "+primeraTarea.devuelvaFechaI()+"\n"+"Fecha de fin: "+primeraTarea.fechaFinal+"\n");

        primeraTarea.devuelvaResponsables();
        System.out.println();
        primeraTarea.devuelvaRecursosDisponibles();
        
        System.out.println("\n"+"Tiempo Estimado: \n"+primeraTarea.devuelvaTiempoEstimadoHRS()+" hrs"+"\n"+"Dinero: "+primeraTarea.devuelvaDinero()+"\nEsfuerzo: "+primeraTarea.devuelvaEsfuerzo()+"\n"+
        "Estado de avance: "+primeraTarea.devuelvaEstadoDeAvance()+"%"+"\n"+"Dependecia: "+primeraTarea.devuelvaDependencia()+"\nTareas de las que depende: "+primeraTarea.devuelvaTareaDependiente()+"\n"+"Estado de la tarea: "+primeraTarea.devuelvaEstado()+"\n"+"Impedimentos: "+primeraTarea.devuelvaImpedimentos());

    }
}
