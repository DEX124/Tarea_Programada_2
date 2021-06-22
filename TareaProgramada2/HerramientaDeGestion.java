import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 * HerramientaDeGestion: es la clase encargada de controlar las demás clases y ejecutar el programa para que realice lo que el usuaro desea.
 *
 * @author (Diego Hernández Agüero B83716, Valery Campos Bermudez B91513, Seilyn Araya Rodríguez B90531)
 * @version (v.1 06/20/2021)
 */
public class HerramientaDeGestion
{
    /**
     * creeResponsables: pide al usuario los datos del colaborador que desea añadir al grupo de colaboradores.
     * Retorna la lista de los colaboradores, imprimiendolos en la terminal.
     * 
     */
    public ColaboradorList creeResponsables(ColaboradorList listaDeColaboradores)
    {
        Scanner scan = new Scanner(JOptionPane.showInputDialog(null, "Ingrese el ID del nuevo colabolador", "Creación de un nuevo colaborador", JOptionPane.INFORMATION_MESSAGE));
        int idCo = scan.nextInt();
        String nomCo = JOptionPane.showInputDialog(null, "Ingrese el nombre del nuevo colabolador", "Creación de un nuevo colaborador", JOptionPane.INFORMATION_MESSAGE);
        listaDeColaboradores.agregueColaborador(idCo,nomCo);

        return listaDeColaboradores;
    }   

    /**
     * modifiqueColaborador: puede modificar el ID o el nombre del colaborador, mediante su busqueda en la lista, pide al usuario que 
     * ingrese el nombre o el ID del colaborador del cual desea hacer el cambio, y le pide que ingrese el nuevo dato.
     * Retorna la lista de colaboradores, que imprime la lista de colaboradores con la modificación ya realizada.
     * 
     */
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

    /**
     * elimineResponsables: mediante opciones selecionadas por el usuario, por el nombre o el ID se busca al colaborador, y se llama a 
     * al metodo que elimina la información de ese colaborador.
     * Retorna la lista de colaboradores, que imprime la lista de colaboradores con la modificación ya realizada.
     * 
     */
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

    /**
     * muestreResponsables: imprime en el terminal la información del colaborador que requiera el usuario.
     * 
     */
    public void muestreResponsables(ColaboradorList listaDeColaboradores)
    {
        System.out.println("Lista de colaboradores:");
        for(Colaborador cola : listaDeColaboradores)
        {
            System.out.println("ID: "+cola.muestreIDColaborador()+" Nombre: "+cola.muestreNombreColaborador()+" Horas laborales: "+cola.muestreHorasLaborales());
        }
    }
    
    /**
     * creeTareas: requiere que el usiario ingrese la información de la tarea para añadirla a la lista de tareas.
     * Retorna la lista de tareas, que imprime la lista de tareas con cada tarea que ha añadido el usuario.
     * 
     */
    public TareasList creeTareas(TareasList listaDeTareas)
    {
        int idT;
        String nomT;
        String fechaI;
        String fechaF;

        Scanner scan = new Scanner(JOptionPane.showInputDialog(null, "Ingrese el ID de la nueva tarea", "Creación de una nueva tarea", JOptionPane.INFORMATION_MESSAGE));
        idT = scan.nextInt();
        nomT = JOptionPane.showInputDialog(null, "Ingrese el nombre de la nueva tarea", "Creación de una nueva tarea", JOptionPane.INFORMATION_MESSAGE);
        fechaI = JOptionPane.showInputDialog(null, "Ingrese la fecha de inicio de la nueva tarea", "Creación de una nueva tarea", JOptionPane.INFORMATION_MESSAGE);
        fechaF = JOptionPane.showInputDialog(null, "Ingrese la fecha de finalización de la nueva tarea", "Creación de una nueva tarea", JOptionPane.INFORMATION_MESSAGE);

        listaDeTareas.asigneDatos(idT, nomT, fechaI, fechaF);
        listaDeTareas.agregueTarea();
        return listaDeTareas;
    }

    /**
     * modifiqueTarea: se encarga de ejecutar los metodos encargados de las modificaciones de las tareas, segun lo que el usuario
     * requiera cambiar.
     * Retorna la lista de tareas, imprimiendola con las modificaciones ya realizadas.
     * 
     */
    public TareasList modifiqueTarea(TareasList listaDeTareas)
    {
        String menuModificar[] = {"ID", "Nombre"};
        String opcionPrincipal = (JOptionPane.showInputDialog(null, "¿De que manera desea buscar la tarea a modificar?", "Menú de modificación de la tarea", JOptionPane.QUESTION_MESSAGE, null, menuModificar, menuModificar[0])).toString();

        if(opcionPrincipal.compareToIgnoreCase("ID") == 0)
        {
            Scanner scan = new Scanner(JOptionPane.showInputDialog(null, "Ingrese el ID de la tarea", "Menú de modificación de la tarea", JOptionPane.INFORMATION_MESSAGE));
            int idT = scan.nextInt();

            String opcionesModificar[] = {"ID", "Nombre", "Fechas","Estimacion","Progreso de avance","Estado de la tarea","Volver atrás"};
            String opcionAMod = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones de la tarea desea modificar?", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE, null, opcionesModificar, opcionesModificar[0])).toString();

            listaDeTareas.modifiqueTarea(listaDeTareas, opcionAMod, idT, "");

            JOptionPane.showMessageDialog(null, "La tarea ha sido modificada con éxito","Tarea finalizada",JOptionPane.INFORMATION_MESSAGE);
        }

        if(opcionPrincipal.compareToIgnoreCase("Nombre") == 0)
        {
            String nomT = JOptionPane.showInputDialog(null, "Ingrese el nombre de la tarea", "Menú de modificación de la tarea", JOptionPane.INFORMATION_MESSAGE);

            String opcionesModificar[] = {"ID", "Nombre", "Fechas","Estimacion","Progreso de avance","Estado de la tarea","Volver atrás"};
            String opcionAMod = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones de la tarea desea modificar?", "Herramienta de modificación de tareas", JOptionPane.QUESTION_MESSAGE, null, opcionesModificar, opcionesModificar[0])).toString();

            listaDeTareas.modifiqueTarea(listaDeTareas, opcionAMod,-1,nomT);

            JOptionPane.showMessageDialog(null, "La tarea ha sido modificada con éxito","Tarea finalizada",JOptionPane.INFORMATION_MESSAGE);
        }

        return listaDeTareas;
    }

    /**
     * elimineTarea: mediante la busqueda por el nombre o el ID de la tarea, el metodo se encarga de llamar al metodo que va a eliminar
     * la información de la tarea.
     * Retorna la lista de tareas, que imprime la lista pero sin la tarea que ya se elimino.
     * 
     */
    public TareasList elimineTarea(TareasList listaDeTareas)
    {
        String menuEliminar[] = {"ID", "Nombre"};
        String opcionPrincipal = (JOptionPane.showInputDialog(null, "¿De que manera desea buscar la tarea a borrar?", "Menú de borrado de tarea", JOptionPane.QUESTION_MESSAGE, null, menuEliminar, menuEliminar[0])).toString();

        if(opcionPrincipal.compareToIgnoreCase("ID") == 0)
        {
            Scanner scan = new Scanner(JOptionPane.showInputDialog(null, "Ingrese el ID de la tarea", "Borrado de tarea", JOptionPane.INFORMATION_MESSAGE));
            int idTarea = scan.nextInt();
            JOptionPane.showConfirmDialog(null,"¿Desea eliminar la tarea?","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);

            listaDeTareas.elimineTarea(listaDeTareas,idTarea,"");
            JOptionPane.showMessageDialog(null, "La tarea ha sido eliminada con éxito","Tarea finalizada",JOptionPane.INFORMATION_MESSAGE);
        }

        if(opcionPrincipal.compareToIgnoreCase("Nombre") == 0)
        {
            String nomTar = JOptionPane.showInputDialog(null, "Ingrese el nombre de la tarea", "Borrado de tarea", JOptionPane.INFORMATION_MESSAGE);

            JOptionPane.showConfirmDialog(null,"¿Desea eliminar la tarea?","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
            listaDeTareas.elimineTarea(listaDeTareas,-1,nomTar);

            JOptionPane.showMessageDialog(null, "La tarea ha sido eliminada con éxito","Tarea finalizada",JOptionPane.INFORMATION_MESSAGE);
        }
        return listaDeTareas;
    }

    /**
     * muestreTareas: imprime en el terminal toda la información de las tareas que ya se ha ingresado al sistema.
     * 
     */
    public void muestreTareas(TareasList listaDeTareas)
    {
        listaDeTareas.muestreTarea(listaDeTareas);
    }

    public Lista creeLista(Lista listaPrincipal)
    {
        return listaPrincipal;
    }

    public Lista modifiqueLista(Lista listaPrincipal)
    {
        return listaPrincipal;
    }

    public Lista elimineLista(Lista listaPrincipal)
    {
        return listaPrincipal;
    }

    /**
     * main: es el que llama a los metodos necesarios para ejecutar lo que el usuario desea hacer en el proyecto.
     * 
     */
    public static void main(String args[])
    {
        HerramientaDeGestion herramienta = new HerramientaDeGestion();
        String menuDeOpciones[] = {"Listas", "Tareas", "Responsables"};
        String opcionPrincipal = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones desea crea?", "Herramienta de gestión", JOptionPane.QUESTION_MESSAGE, null, menuDeOpciones, menuDeOpciones[0])).toString();

        ColaboradorList listaGeneralResponsables = new ColaboradorList();
        TareasList listaDeTareas = new TareasList();
        Lista listaPrincipal = new Lista();

        if(opcionPrincipal.compareToIgnoreCase("Listas")==0)
        {
            String menuDeOpcionesDeLista[] = {"Crear una lista", "Modificar una lista", "Eliminar una lista","Consultar una lista","Volver atrás"};
            String opcionLista = "";

            do { opcionLista = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones desea ejecutar?", "Herramienta de gestión de listas", JOptionPane.QUESTION_MESSAGE, null, menuDeOpcionesDeLista, menuDeOpcionesDeLista[0])).toString();

                if(opcionLista.compareToIgnoreCase("Crear una lista") == 0)
                {
                    listaPrincipal = herramienta.creeLista(listaPrincipal);
                }
                if(opcionLista.compareToIgnoreCase("Modificar una lista") == 0)
                {
                    listaPrincipal = herramienta.modifiqueLista(listaPrincipal);
                }
                if(opcionLista.compareToIgnoreCase("Eliminar una lista") == 0)
                {
                    listaPrincipal = herramienta.elimineLista(listaPrincipal);
                }
                if(opcionLista.compareToIgnoreCase("Consultar una lista") == 0)
                {
                    herramienta.muestreTareas(listaDeTareas);
                }
            }while(opcionLista.compareToIgnoreCase("Volver atrás") != 0);

        }
        if(opcionPrincipal.compareToIgnoreCase("Tareas")==0)
        {
            String menuDeOpcionesDeTareas[] = {"Crear una tarea", "Modificar una tarea", "Eliminar una tarea","Consultar una tarea","Volver atrás"};
            String opcionTarea = "";

            do { opcionTarea = (JOptionPane.showInputDialog(null, "¿Cuál de las siguientes opciones desea ejecutar?", "Herramienta de gestión de tareas", JOptionPane.QUESTION_MESSAGE, null, menuDeOpcionesDeTareas, menuDeOpcionesDeTareas[0])).toString();

                if(opcionTarea.compareToIgnoreCase("Crear una tarea") == 0)
                {
                    listaDeTareas = herramienta.creeTareas(listaDeTareas);
                }
                if(opcionTarea.compareToIgnoreCase("Modificar una tarea") == 0)
                {
                    listaDeTareas = herramienta.modifiqueTarea(listaDeTareas);
                }
                if(opcionTarea.compareToIgnoreCase("Eliminar una tarea") == 0)
                {
                    listaDeTareas = herramienta.elimineTarea(listaDeTareas);
                }
                if(opcionTarea.compareToIgnoreCase("Consultar una tarea") == 0)
                {
                    herramienta.muestreTareas(listaDeTareas);
                }
            }while(opcionTarea.compareToIgnoreCase("Volver atrás") != 0);
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