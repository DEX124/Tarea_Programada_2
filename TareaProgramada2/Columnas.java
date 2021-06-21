
/**
 * Write a description of class Columnas here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class Columnas
{
    String nombre [] = {"Por hacer","Haciendo", "Finalizado","Pausado","Abortado"};
    String idColumnas [] = {"PH","H","F","P","A"};
    TareasList tareasDeLasListas;
    Tareas columnaDeTareas [][];

    public Columnas(TareasList listaDeTareas)
    {
        tareasDeLasListas = listaDeTareas;
        int tam = tareasDeLasListas.size()/5;
        if(tam == 0)
        {
            tam = 1;
        }
        if(tam*5 < tareasDeLasListas.size())
        {
            tam++;
        }
        columnaDeTareas = new Tareas [(tam)][5];
    }

    public void creeColumnas ()
    {
        for(int filas = 0; filas < tareasDeLasListas.size(); filas++)
        {
            for(int columnas = 0; columnas < 5; columnas++)
            {
                if(tareasDeLasListas.isEmpty() != true)
                {
                    if(tareasDeLasListas.get((filas+columnas)).devuelvaEstado().compareToIgnoreCase("Por Hacer") == 0 )
                    {
                        columnaDeTareas[filas][0] = tareasDeLasListas.get((filas+columnas));
                    }
                    if(tareasDeLasListas.get((filas+columnas)).devuelvaEstado().compareToIgnoreCase("Haciendo") == 0)
                    {
                        columnaDeTareas[filas][1] = tareasDeLasListas.get((filas+columnas));
                    }
                    if(tareasDeLasListas.get((filas+columnas)).devuelvaEstado().compareToIgnoreCase("Finalizado") == 0)
                    {
                        columnaDeTareas[filas][2] = tareasDeLasListas.get((filas+columnas));
                    }
                    if(tareasDeLasListas.get((filas+columnas)).devuelvaEstado().compareToIgnoreCase("Pausado") == 0)
                    {
                        columnaDeTareas[filas][3] = tareasDeLasListas.get((filas+columnas));
                    }
                    if(tareasDeLasListas.get((filas+columnas)).devuelvaEstado().compareToIgnoreCase("Abortado") == 0)
                    {
                        columnaDeTareas[filas][4] = tareasDeLasListas.get((filas+columnas));
                    }
                }
            }
        }
    }

    public void imprimaEnColumnas()
    {
        for(int i = -1; i < tareasDeLasListas.size(); i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(i == -1)
                {
                    if(j == 0)
                    {
                        System.out.print("Por hacer \t");
                    }
                    if(j == 1)
                    {
                        System.out.print("Haciendo \t");
                    }
                    if(j == 2)
                    {
                        System.out.print("Por hacer \t");
                    }
                    if(j == 3)
                    {
                        System.out.print("Finalizado \t");
                    }
                    if(j == 4)
                    {
                        System.out.print("Abortado \n");
                    }
                }else{
                    if(j<4)
                    {
                        System.out.println("Identificador de la tarea: "+tareasDeLasListas.get(i).devuelvaID()+" Nombre de la tarea: "+tareasDeLasListas.get(i).devuelvaNombreT()+"\t");
                    }else{
                        System.out.println("Identificador de la tarea: "+tareasDeLasListas.get(i).devuelvaID()+" Nombre de la tarea: "+tareasDeLasListas.get(i).devuelvaNombreT()+"\n");
                    }
                }
            }
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
        
        Columnas columnasDeTareas = new Columnas(nuevaLista.devuelvaListaDeTareas());
    }
}

