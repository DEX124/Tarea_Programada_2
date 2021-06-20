
/**
 * Write a description of class Lista here.
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

    public Lista()
    {
        idLista= -1;
        String nombreLista= " ";
        String descrip = "";
        tareasDeLista = new TareasList();
    }

    public void asigneIdLista(int idL)
    {
        idLista = idL;
    }

    public void asigneNombreLista(String nomLista)
    {
        nombreLista = nomLista;
    }

    public void asigneDescrip(String des)
    {
        descrip = des;
    }

    public void asigneTarea(int idT, String nomT,String fechaI, String fechaF,int tiempo,int dinero,int esf,int porcentajeDeAvance,boolean estado, Tareas tareaReq,String estad)
    {
        tareasDeLista.asigneDatos(idT,nomT,fechaI,fechaF,tiempo,dinero,esf,porcentajeDeAvance,estado,tareaReq,estad);
    }

    public void asigneResponsables(int idC, String nomCo)
    {
        tareasDeLista.agregueResponsables(idC,nomCo);
    }

    public void asigneRecursos(int idr, String nombreRe, int porce)
    {
        tareasDeLista.agregueRecursos(idr,nombreRe,porce);
    
    }

    public void asigneImpedimentos(String impe)
    {
        tareasDeLista.agregueImpedimentos(impe);
    }
    
    public void agregueTarea()
    {
        tareasDeLista.agregueTarea();
    }

    
    
    public int devuelvaIDLista()
    {
        return idLista;
    }

    public String devuelvaNombreLista()
    {
        return nombreLista;
    }

    public String devuelvaDescrip()
    {
        return descrip;
    }

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

    public static void main (String args[])
    {
        Lista nuevaLista = new Lista();
        
        nuevaLista.asigneIdLista(722);
        nuevaLista.asigneNombreLista("Antonio");
        nuevaLista.asigneDescrip("Ayuda mamá, ya estoy embotado");
        nuevaLista.asigneTarea(07, "comer", "hoy","mañana", 27, 50000, 2, 3, false, null, "Finalizado");
        nuevaLista.agregueTarea();
        
        
        System.out.println("Id de la lista: "+nuevaLista.devuelvaIDLista()+"\nNombre de la lista: "+nuevaLista.devuelvaNombreLista()+"\n\n"+nuevaLista.devuelvaDescrip());
        
        nuevaLista.muestreTareas();
        
    }
}
