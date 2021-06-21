
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

    public Columnas(TareasList listaDeTareas)
    {
        tareasDeLasListas = listaDeTareas;
    }

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
        columnasDeTareas.imprimaEnColumnas();
    }
}

