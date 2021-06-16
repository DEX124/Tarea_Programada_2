
/**
 * Write a description of class Colaborador here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/15/2021)
 */
public class Colaborador
{
    int identificadorColaborador;
    String nombreColaborador;
    int horasLaborales;
    
    public Colaborador()
    {
        identificadorColaborador = -1;
        nombreColaborador = " ";
        horasLaborales = 40;
    }
    
    public void asigneIDColabolador (int id)
    {
        identificadorColaborador = id;
    }
    
    public void asigneNombreColabolador (String nom)
    {
        nombreColaborador = nom;
    }
    
    public int muestreIDColaborador ()
    {
        return identificadorColaborador;
    }
    
    public String muestreNombreColaborador ()
    {
        return nombreColaborador;
    }
    
    public int muestreHorasLaborales ()
    {
        return horasLaborales;
    }
}
