
/**
 * Write a description of class Recurso here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/15/2021)
 */
public class Recurso
{
    String nombre;
    int identificadorRecurso;
    int porcentajeDeAsig;
    
    public Recurso ()
    {
        nombre = "";
        identificadorRecurso = -1;
        porcentajeDeAsig = 0;
    }
    
    public void asigneNombreRecurso(String nom)
    {
        nombre = nom;
    }
    
    public void asigneIDRecurso(int id)
    {
        identificadorRecurso = id;
    }
    
    public void asignePorcentajeRecurso (int porce)
    {
        porcentajeDeAsig = porce;
    }
    
    public String muestreNombreRecurso()
    {
        return nombre;
    }
    
    public int muestreIDRecurso ()
    {
        return identificadorRecurso;
    }
    
    public int muestrePorcentajeRecurso ()
    {
        return porcentajeDeAsig;
    }
    
}
