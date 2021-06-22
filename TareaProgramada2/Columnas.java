
/**
 * Columnas: Muestra por columnas el estado de las tareas
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/20/2021)
 */
public class Columnas
{
    String nombre [] = {"Por hacer","Haciendo", "Finalizado","Pausado","Abortado"}; //Almacena los nombre de a columna segun estado,
    String idColumnas [] = {"PH","H","F","P","A"}; //Almacena los ID de la columna segun estado
    TareasList tareasDeLasListas; //Enlista las tareas de la clase TareaList por columnas
    
    /**
     * Columnas: Organiza las tareas por columnas segun estado.
     *
     */
    public Columnas(TareasList listaDeTareas)
    {
        tareasDeLasListas = listaDeTareas;
    }

    /**
     * imprimaEnColumnas: Muestra las tareas por lista en columnas por estado.
     *
     */
    public void imprimaEnColumnas()
    {
        System.out.println("Por hacer:");
        for(int i = 0; i < tareasDeLasListas.size(); i++)
        {
                if(tareasDeLasListas.get(i).devuelvaEstado().compareToIgnoreCase("Por hacer")==0)
                {
                    System.out.println("ID: "+tareasDeLasListas.get(i).devuelvaID()+" Nombre: "+tareasDeLasListas.get(i).devuelvaNombreT());
                }
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println("Haciendo:");
        for(int i = 0; i < tareasDeLasListas.size(); i++)
        {
                if(tareasDeLasListas.get(i).devuelvaEstado().compareToIgnoreCase("Haciendo")==0)
                {
                    System.out.println("ID: "+tareasDeLasListas.get(i).devuelvaID()+" Nombre: "+tareasDeLasListas.get(i).devuelvaNombreT());
                }
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("Pausado:");
        for(int i = 0; i < tareasDeLasListas.size(); i++)
        {
                if(tareasDeLasListas.get(i).devuelvaEstado().compareToIgnoreCase("Pausado")==0)
                {
                    System.out.println("ID: "+tareasDeLasListas.get(i).devuelvaID()+" Nombre: "+tareasDeLasListas.get(i).devuelvaNombreT());
                }
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("Finalizado:");
        for(int i = 0; i < tareasDeLasListas.size(); i++)
        {
                if(tareasDeLasListas.get(i).devuelvaEstado().compareToIgnoreCase("Finalizado")==0)
                {
                    System.out.println("ID: "+tareasDeLasListas.get(i).devuelvaID()+" Nombre: "+tareasDeLasListas.get(i).devuelvaNombreT());
                }
        }
        System.out.println("");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("Abortado:");
        for(int i = 0; i < tareasDeLasListas.size(); i++)
        {
                if(tareasDeLasListas.get(i).devuelvaEstado().compareToIgnoreCase("Abortado")==0)
                {
                    System.out.println("ID: "+tareasDeLasListas.get(i).devuelvaID()+" Nombre: "+tareasDeLasListas.get(i).devuelvaNombreT());
                }
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}

