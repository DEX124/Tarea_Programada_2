import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * Write a description of class HerramientaDeGestion here.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/20/2021)
 */
public class HerramientaDeGestion
{
    public ColaboradorList creeResponsables(ColaboradorList listaDeColaboradores)
    {
        Scanner scan = new Scanner(JOptionPane.showInputDialog(null, "Ingrese el ID del colabolador", "Creación de un nuevo colaborador", JOptionPane.INFORMATION_MESSAGE));
        int idCo = scan.nextInt();
        String nomCo = JOptionPane.showInputDialog(null, "Ingrese el nombre del colabolador", "Creación de un nuevo colaborador", JOptionPane.INFORMATION_MESSAGE);
        listaDeColaboradores.agregueColaborador(idCo,nomCo);

        return listaDeColaboradores;
    }   
    
    public ColaboradorList modifiqueColaborador(ColaboradorList listaDeColaboradores)
    {
        String menuModificar[] = {"ID", "Nombre"};
        String opcionPrincipal = (JOptionPane.showInputDialog(null, "¿De que manera desea buscar al colaborador a modificar?", "Menú de modificación de colaborador", JOptionPane.QUESTION_MESSAGE, null, menuModificar, menuModificar[0])).toString();
        if(opcionPrincipal.compareToIgnoreCase("ID") == 0)
        {
            Scanner scan = new Scanner(JOptionPane.showInputDialog(null, "Ingrese el ID del colabolador", "modificación de colaborador", JOptionPane.INFORMATION_MESSAGE));
            int idCo = scan.nextInt();
            listaDeColaboradores.modifiqueID(listaDeColaboradores,idCo);

    
            JOptionPane.showMessageDialog(null, "El colaborador ha sido modificado con éxito","Tarea finalizada",JOptionPane.INFORMATION_MESSAGE);
        }

        if(opcionPrincipal.compareToIgnoreCase("Nombre") == 0)
        {
            String nomCo = JOptionPane.showInputDialog(null, "Ingrese el nombre del colabolador", "Borrado de colaborador", JOptionPane.INFORMATION_MESSAGE);
            listaDeColaboradores.modifiqueNombre(listaDeColaboradores,nomCo);
            JOptionPane.showMessageDialog(null, "El colaborador ha sido modificado con éxito","Tarea finalizada",JOptionPane.INFORMATION_MESSAGE);
        }
        
        return listaDeColaboradores;
    }

    public ColaboradorList elimineResponsables(ColaboradorList listaDeColaboradores)
    {
        String menuEliminar[] = {"ID", "Nombre"};
        String opcionPrincipal = (JOptionPane.showInputDialog(null, "¿De que manera desea buscar al colaborador a borrar?", "Menú de borrado de colaborador", JOptionPane.QUESTION_MESSAGE, null, menuEliminar, menuEliminar[0])).toString();

        if(opcionPrincipal.compareToIgnoreCase("ID") == 0)
        {
            Scanner scan = new Scanner(JOptionPane.showInputDialog(null, "Ingrese el ID del colabolador", "Borrado de colaborador", JOptionPane.INFORMATION_MESSAGE));
            int idCo = scan.nextInt();
            JOptionPane.showConfirmDialog(null,"¿Desea eliminar al colaborador?","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);

            listaDeColaboradores.elimineColaborador(listaDeColaboradores,idCo,"");
            JOptionPane.showMessageDialog(null, "El colaborador ha sido borrado con éxito","Tarea finalizada",JOptionPane.INFORMATION_MESSAGE);
        }

        if(opcionPrincipal.compareToIgnoreCase("Nombre") == 0)
        {
            String nomCo = JOptionPane.showInputDialog(null, "Ingrese el nombre del colabolador", "Borrado de colaborador", JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showConfirmDialog(null,"¿Desea eliminar al colaborador?","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            listaDeColaboradores.elimineColaborador(listaDeColaboradores,-1,nomCo);

            JOptionPane.showMessageDialog(null, "El colaborador ha sido borrado con éxito","Tarea finalizada",JOptionPane.INFORMATION_MESSAGE);
        }
        return listaDeColaboradores;
    }
    
    public void muestreResponsables(ColaboradorList listaDeColaboradores)
    {
        System.out.println("Lista de colaboradores:");
        for(Colaborador cola : listaDeColaboradores)
        {
            System.out.println("ID: "+cola.muestreIDColaborador()+" Nombre: "+cola.muestreNombreColaborador()+" Horas laborales: "+cola.muestreHorasLaborales());
        }
    }

    public static void main(String args[])
    {
        HerramientaDeGestion herramienta = new HerramientaDeGestion();
        String menuDeOpciones[] = {"Listas", "Tareas", "Responsables"};
        String opcionPrincipal = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones desea crea?", "Herramienta de gestión", JOptionPane.QUESTION_MESSAGE, null, menuDeOpciones, menuDeOpciones[0])).toString();

        ColaboradorList listaGeneralResponsables = new ColaboradorList();

        if(opcionPrincipal.compareToIgnoreCase("Listas")==0)
        {
            String menuDeOpcionesDeLista[] = {"Crear una lista", "Modificar una lista", "Eliminar una lista","Consultar una lista"};
            String opcionlista = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones desea ejecutar?", "Herramienta de gestión de listas", JOptionPane.QUESTION_MESSAGE, null, menuDeOpcionesDeLista, menuDeOpcionesDeLista[0])).toString();

        }

        if(opcionPrincipal.compareToIgnoreCase("Tareas")==0)
        {
            String menuDeOpcionesDeTareas[] = {"Crear una tarea", "Modificar una tarea", "Eliminar una tarea","Consultar una tarea"};
            String opcionTarea = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones desea ejecutar?", "Herramienta de gestión de tareas", JOptionPane.QUESTION_MESSAGE, null, menuDeOpcionesDeTareas, menuDeOpcionesDeTareas[0])).toString();
        }

        if(opcionPrincipal.compareToIgnoreCase("Responsables")==0)
        {
            String menuDeOpcionesDeResponsables[] = {"Crear un colaborador", "Modificar un colaborador", "Borrar un colaborador","Consultar un colaborador","Volver atrás"};
            String opcionresponsables = "";
            do {opcionresponsables = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones desea ejecutar?", "Herramienta de gestión de responsables", JOptionPane.QUESTION_MESSAGE, null, menuDeOpcionesDeResponsables, menuDeOpcionesDeResponsables[0])).toString();

                if(opcionresponsables.compareToIgnoreCase("Crear un colaborador")==0)
                {
                    listaGeneralResponsables = herramienta.creeResponsables(listaGeneralResponsables);
                }
                if(opcionresponsables.compareToIgnoreCase("Modificar un colaborador")==0)
                {
                    listaGeneralResponsables = herramienta.modifiqueColaborador(listaGeneralResponsables);
                }
                if(opcionresponsables.compareToIgnoreCase("Borrar un colaborador")==0)
                {
                    listaGeneralResponsables = herramienta.elimineResponsables(listaGeneralResponsables);
                }
                if(opcionresponsables.compareToIgnoreCase("Consultar un colaborador")==0)
                {
                    herramienta.muestreResponsables(listaGeneralResponsables);
                }
            }while(opcionresponsables.compareToIgnoreCase("Volver atrás") != 0);
        }

    }
}