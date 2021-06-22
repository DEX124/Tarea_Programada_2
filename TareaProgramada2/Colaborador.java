
/**
 *  Colaborador: define y retorna las variables que conforman a cada colaborador.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/15/2021)
 */
public class Colaborador
{
    int identificadorColaborador; //es el numero de identificación del colaborador
    String nombreColaborador; //es el nombre del colaborador
    int horasLaborales; //son el numero de horas enteras que trabaja en las actividades el colaborador
    
    /**
     * Colaborador: le da un valor inicial a las variables que conforman cada colaborador
     */
    public Colaborador()
    {
        identificadorColaborador = -1;
        nombreColaborador = " ";
        horasLaborales = 40;
    }
    
    /**
     *asigneIDColaborador: asigna el int identificador al colaborador
     */
    public void asigneIDColabolador (int id)
    {
        identificadorColaborador = id;
    }
    
    /**
     * asigneNombreColabolador: asigna el string nom, que es el nombre, al colaborador
     */
    public void asigneNombreColabolador (String nom)
    {
        nombreColaborador = nom;
    }
    
    /**
     * muestreIDColaborador: retorna el numero de identificación del colaborador
     */
    public int muestreIDColaborador ()
    {
        return identificadorColaborador;
    }
    
    /**
     * muestreNombreColaborador: retorna el nombre del colaborador
     */
    public String muestreNombreColaborador ()
    {
        return nombreColaborador;
    }
    
    /**
     * muestreHorasLaborales: retorna las horas laboradas por el colaborador
     */
    public int muestreHorasLaborales ()
    {
        return horasLaborales;
    }
}
