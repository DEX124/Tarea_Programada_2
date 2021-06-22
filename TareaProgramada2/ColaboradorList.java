import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *  ColaboradorList es la clase encargada de añadir colaboradores a la lista de colaboradores.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/19/2021)
 */
public class ColaboradorList extends ArrayList<Colaborador>
{
    /**
     *agregueColaborador: añade el nombre del colaborador y  su numero de identificación a la lista de colaboradores.
     */
    public void agregueColaborador(int idc, String nombreCo)
    {
        Colaborador nuevo = new Colaborador();
        nuevo.asigneIDColabolador(idc);
        nuevo.asigneNombreColabolador(nombreCo);
        add(nuevo);
    }
    
    /**
     * elimineColaborador: metodo que se encarga de eliminar un 
     * colaborador de la lista de los colaboradores,mediante
     * si identificación o nombre
     */
    public void elimineColaborador(ColaboradorList lista,int idc, String nomCo)
    {
        for(int i = 0; i < lista.size();i++){
            if(lista.get(i).muestreIDColaborador() == idc || lista.get(i).muestreNombreColaborador().compareToIgnoreCase(nomCo) == 0)
            {
                remove(i);
            }
        }
    }

    /**
     * modifiqueID: modifica el id del colaborador, cuando así se 
     * requiera, recibiendo el parametro int idc, para buscarlo 
     * la lista de coladoradores y que el usuario lo cambie.
     */
    public void modifiqueID(ColaboradorList lista,int idc)
    {
        for(int i = 0; i < lista.size();i++){
            if(lista.get(i).muestreIDColaborador() == idc)
            {
                System.out.println("ID: "+lista.get(i).muestreIDColaborador()+" Nombre: "+lista.get(i).muestreNombreColaborador()+" Horas laborares: "+lista.get(i).muestreHorasLaborales());
                int idN;
                int idRep = -1;
                Scanner scan = new Scanner(JOptionPane.showInputDialog(null,"Ingrese la nueva ID del colaborador"));
                idN= scan.nextInt();
                for(int j = 0; j < lista.size();j++)
                {
                    if(lista.get(j).muestreIDColaborador() == idN)
                    {
                        idRep = idN;
                    }
                }
                while(idN == idRep){
                    scan = new Scanner(JOptionPane.showInputDialog(null,"Ingrese la nueva ID del colaborador (Debe ser una no existente)"));
                    idN= scan.nextInt();
                    for(int j = 0; j < lista.size();j++)
                    {
                        if(lista.get(j).muestreIDColaborador() == idN)
                        {
                            idRep = idN;
                        }
                    }
                }

                lista.get(i).asigneIDColabolador(idN);
            }
        }
    }

    /**
     * modifiqueNombre: modifica el nombre del colaborador, cuando así se 
     * requiera, recibiendo el parametro String nomCo, para buscarlo 
     * la lista de coladoradores y que el usuario lo cambie.
     */
    public void modifiqueNombre(ColaboradorList lista,String nomCo)
    {
        for(int i = 0; i < lista.size();i++){
            if(lista.get(i).muestreNombreColaborador().compareToIgnoreCase(nomCo) == 0)
            {
                System.out.println("ID: "+lista.get(i).muestreIDColaborador()+" Nombre: "+lista.get(i).muestreNombreColaborador()+" Horas laborares: "+lista.get(i).muestreHorasLaborales());
                String nombreN = JOptionPane.showInputDialog(null,"Ingrese el nuevo nombre del colaborador");
                lista.get(i).asigneNombreColabolador(nombreN);
            }
        }
    }
}
