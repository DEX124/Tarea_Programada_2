import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
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

    public void elimineColaborador(ColaboradorList lista,int idc, String nomCo)
    {
        for(int i = 0; i < lista.size();i++){
            if(lista.get(i).muestreIDColaborador() == idc || lista.get(i).muestreNombreColaborador().compareToIgnoreCase(nomCo) == 0)
            {
                remove(i);
            }
        }
    }

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
