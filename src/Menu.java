import java.util.Scanner;

public class Menu {
    private int opcion = 0;
    Scanner sc = new Scanner(System.in);
    public int menuOpcion() {

        System.out.println("----------MENU----------");
        System.out.println("1. agregar un jugador");
        System.out.println("2. eliminar jugador");
        System.out.println("3. buscar jugador");
        System.out.println("4. editar o modificar datos de jugador");
        System.out.println("5. listar todos los jugadores ");
        System.out.println("6. salir del programa");
        opcion = sc.nextInt();
        return opcion;
    }

    public int menuEditarJugador(){

        System.out.println("----------OPCIONES DE EDICION----------");
        System.out.println("1. EDITAR NOMBRE");
        System.out.println("2. EDITAR EDAD");
        System.out.println("3. EDITAR SEXO");
        System.out.println("4. EDITAR DEPORTE");
        System.out.println("5. NO EDITAR");
        opcion = sc.nextInt();


        return opcion;
    }



}
