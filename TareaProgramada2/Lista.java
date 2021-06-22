
/**
 * Lista: Permite almacenar todas las tareas.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class Lista
{
    int idLista;
    String nombreLista;
    String descrip;
    TareasList tareasDeLista;

    /**
     * Lista: Se encarga de almacenar el nombre de la lista.
     *
     */
    public Lista()
    {
        idLista= -1;
        String nombreLista= " ";
        String descrip = "";
        tareasDeLista = new TareasList();
    }

    /**
     * asigneIdLista: Se encarga de almacenar el Id de la Lista proporcionado por el usuario.
     *
     */
    public void asigneIdLista(int idL)
    {
        idLista = idL;
    }

    /**
     * asigneNombreLista: Se encarga de almacenar el Nombre de la Lista proporcionado por el usuario.
     *
     */
    public void asigneNombreLista(String nomLista)
    {
        nombreLista = nomLista;
    }

    /**
     * asigneDescrip: Se encarga de almacenar alguna descripcion de la Lista proporcionado por el usuario.
     *
     */
    public void asigneDescrip(String des)
    {
        descrip = des;
    }

    /**
     * asigneTarea: Se encarga de almacenar la tarea con sus elememtos en la lista.
     *
     */
    public void asigneTarea(int idT, String nomT,String fechaI, String fechaF,int tiempo,int dinero,int esf,int porcentajeDeAvance,boolean estado, Tareas tareaReq,String estad)
    {
            tareasDeLista.asigneDatos(idT,nomT,fechaI,fechaF);
            tareasDeLista.agregueEstado(estad, porcentajeDeAvance);
            tareasDeLista.agregueDependencia(estado, tareaReq);
            tareasDeLista.agregueEstima(tiempo, dinero, esf);
    }

    /**
     * asigneResponsables: Se encarga de almacenar el Nombre de los responsables de las tareas en la lista.
     *
     */
    public void asigneResponsables(int idC, String nomCo)
    {
        tareasDeLista.agregueResponsables(idC,nomCo);
    }

    /**
     * asigneRecursos: Se encarga de almacenar los recursos de las tareas y sus porcentajes.
     *
     */
    public void asigneRecursos(int idr, String nombreRe, int porce)
    {
        tareasDeLista.agregueRecursos(idr,nombreRe,porce);
    }

    /**
     * asigneImpedimentos: Se encarga de almacenar los impedimentos de las tareas proporcionado por el usuario.
     *
     */
    public void asigneImpedimentos(String impe)
    {
        tareasDeLista.agregueImpedimentos(impe);
    }
    
    /**
     * asigneTarea: Se encarga de almacenar la tarea en la lista de tareas.
     *
     */
    public void agregueTarea()
    {
        tareasDeLista.agregueTarea();
    }

    /**
     * duelvaIDLista: Se encarga de devolver el ID de la Lista.
     *
     */
    public int devuelvaIDLista()
    {
        return idLista;
    }

    /**
     * duelvaNombreLista: Se encarga de devolver el Nombre de la Lista.
     *
     */
    public String devuelvaNombreLista()
    {
        return nombreLista;
    }
    
     /**
     * duelvaDescrip: Se encarga de devolver la Descripcion de la Lista.
     *
     */
    public String devuelvaDescrip()
    {
        return descrip;
    }
    
     /**
     * devuelvaListaDeTareas: Se encarga de devolver la lista de tareas que almacena
     *
     */
    public TareasList devuelvaListaDeTareas()
    {
        return tareasDeLista;
    }

     /**
     * muestreTareas: Se encarga de mostrar las tareas y todos los elementos que la componen..
     *
     */
    public void muestreTareas()
    {
        for(Tareas tarea : tareasDeLista)
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
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        }
    }
}
