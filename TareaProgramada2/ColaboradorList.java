import java.util.ArrayList;
/**
 * Write a description of class ColaboradorList here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class ColaboradorList extends ArrayList<Colaborador>
{
    public void agregueColaborador(int idc, String nombreCo)
    {
        Colaborador nuevo = new Colaborador();
        nuevo.asigneIDColabolador(idc);
        nuevo.asigneNombreColabolador(nombreCo);
        add(nuevo);
    }
}
