
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
}
