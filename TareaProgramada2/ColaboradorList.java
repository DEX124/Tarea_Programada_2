import java.util.ArrayList;
/**
 * Write a description of class ColaboradorList here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
