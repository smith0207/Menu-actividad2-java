
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        InsertarJugador insertarJugador = new InsertarJugador();
        int opcion =0;
        int idOpcion;
        int opcionEdit;
        String siOno;

        do {
            opcion =menu.menuOpcion();
            switch (opcion) {
                case 1:
                        insertarJugador.insertar();
                        insertarJugador.mostrar();
                    System.out.println("\n\n\n");
                    break;
                case 2:
                    System.out.println("\t ingrese el id que desea eliminar");
                    idOpcion=sc.nextInt();
                    insertarJugador.mostrarUnico(idOpcion);
                    System.out.println("¿desea eliminar este jugador?:  si='s'   no 'n'");
                    siOno = sc.next();
                    if (siOno.equals("s") || siOno.equals("S")) {
                        insertarJugador.eliminar(idOpcion);
                    }else {
                        System.out.println("no se elimino al jugador");
                    }

                    System.out.println("\n\n\n");
                    break;
                case 3:
                    System.out.println("ingrese el id del jugador que desea buscar: ");
                    idOpcion=sc.nextInt();
                    insertarJugador.buscar(idOpcion);
                    System.out.println("\n\n\n");
                    break;
                case 4:
                    System.out.println("ingrese el id del jugador que desea actualizar: ");
                    idOpcion =sc.nextInt();
                    opcionEdit=menu.menuEditarJugador();
                    insertarJugador.editarJugador(idOpcion,opcionEdit);
                    System.out.println("\n\n\n");

                    break;
                case 5:
                    System.out.println("\n\n\n");
                    System.out.println("\t\t----------listando jugadores----------");
                    insertarJugador.mostrar();

                    break;


                default:
                    System.out.println("caracter no valido");
            }

            System.out.println("\n\n\n");
        }while(opcion != 6);

//System
    }
}
