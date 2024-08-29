
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;


public class InsertarJugador {

        Scanner sc = new Scanner(System.in);
    private  ArrayList<Pojojugador> jugadores = new ArrayList<>();

    public void insertar() {
        Pojojugador nuevo = crearJugador();
        jugadores.add(nuevo);
        System.out.println("\n jugador ha sido insertado");
    }

    private Pojojugador crearJugador() {
        Pojojugador nuevojugador = new Pojojugador();
            System.out.println("\tnombre: ");
            nuevojugador.setNombre(sc.nextLine());
            System.out.println("\tedad: ");
            nuevojugador.setEdad(sc.nextInt());
            sc.nextLine();
            System.out.println("\tsexo: ");
            nuevojugador.setSexo(sc.nextLine());
            System.out.println("\tdeporte: ");
            nuevojugador.setDeporte(sc.nextLine());


        return nuevojugador;
    }

    public Void mostrar(){
        for (int i=0; i<jugadores.size(); i++) {
            System.out.println("id: "+i);
            System.out.print(("\tnombre: ")+jugadores.get(i).getNombre());
            System.out.print(("\t     edad: ")+jugadores.get(i).getEdad());
            System.out.print((" \t    sexo: ")+jugadores.get(i).getSexo());
            System.out.print(("\t     deporte: ")+jugadores.get(i).getDeporte());
            System.out.println("\n");
        }
        return null;
    }

    public void mostrarUnico(int a){
        System.out.println("id: "+a);
        System.out.print(("\tnombre: ")+jugadores.get(a).getNombre());
        System.out.print(("\t     edad: ")+jugadores.get(a).getEdad());
        System.out.print((" \t    sexo: ")+jugadores.get(a).getSexo());
        System.out.print(("\t     deporte: ")+jugadores.get(a).getDeporte());
        System.out.println("\n");

    }

    public void eliminar (int a){
        if(jugadores == null || a >jugadores.size()){
            System.out.println("\n\n-----NO HAY JUGADORES EN LISTA-----\n\n");
        }
        else{
            System.out.println("id: "+a);
            System.out.print(("     nombre: ")+jugadores.get(a).getNombre());
            System.out.print(("     edad: ")+jugadores.get(a).getEdad());
            System.out.print(("     sexo: ")+jugadores.get(a).getSexo());
            System.out.print(("     deporte: ")+jugadores.get(a).getDeporte());
            System.out.println("\n");

            jugadores.remove(a);

            System.out.println("\t\tel jugador a sido eliminado con exito ");

        }
    }

    public void buscar(int a){
        if(jugadores.isEmpty() || a >jugadores.size() || a<0){
            System.out.println("id fuera de rango: "+0+" hasta "+jugadores.size());
        }
        else{
            System.out.println("id: "+a);
            System.out.print(("     nombre: ")+jugadores.get(a).getNombre());
            System.out.print(("     edad: ")+jugadores.get(a).getEdad());
            System.out.print(("     sexo: ")+jugadores.get(a).getSexo());
            System.out.print(("     deporte: ")+jugadores.get(a).getDeporte());
            System.out.println("\n\n");
        }
    }

    public void editarJugador(int id, int opcion){
        String siOno;
        String nombre;
        int edad;
        String sexo;
        String deporte;

        switch (opcion){
            case 1:
                System.out.println("nuevo nombre: ");
                nombre=sc.nextLine();
                System.out.println("esta seguro de cambiar: "+jugadores.get(id).getNombre()+" por -> "+nombre+"\n" +
                        "si  's' o  no 'n'");
                siOno=sc.nextLine();
                if(Objects.equals(siOno, "s")|| Objects.equals(siOno,"S")){

                    jugadores.get(id).setNombre(nombre);
                    System.out.println("el nombre del jugador  id:"+id+" fue editado");
                    mostrar();
                }else {
                    System.out.println("no se edito ningun caracter");
                }
                break;
            case 2:
                System.out.println("nueva edad: ");
                edad=sc.nextInt();sc.nextLine();
                System.out.println("esta seguro de cambiar: "+jugadores.get(id).getEdad()+" por -> "+edad+"\n" +
                        "si  's' o  no 'n'");
                siOno=sc.nextLine();
                if(Objects.equals(siOno, "s")|| Objects.equals(siOno,"S")){

                    jugadores.get(id).setEdad(edad);

                    System.out.println("la edad del jugador  id:"+id+" fue editada");
                    mostrar();
                }else{
                    System.out.println("no se edito ningun caracter");
                }
                break;
            case 3:
                System.out.println("nuevo sexo: ");
                sexo=sc.nextLine();
                System.out.println("esta seguro de cambiar: "+jugadores.get(id).getSexo()+" por -> "+sexo+"\n" +
                        "si  's' o  no 'n'");
                siOno=sc.nextLine();
                if(Objects.equals(siOno, "s")|| Objects.equals(siOno,"S")){

                    jugadores.get(id).setSexo(sexo);

                    System.out.println("el sexo del jugador  id:"+id+" fue editada");
                    mostrar();
                }
                break;

            case 4:
                System.out.println("nuevo deporte: ");
                deporte=sc.nextLine();
                System.out.println("esta seguro de cambiar: "+jugadores.get(id).getDeporte()+" por -> "+deporte+"\n" +
                        "si  's' o  no 'n'");
                siOno=sc.nextLine();

                if(Objects.equals(siOno, "s")|| Objects.equals(siOno,"S")){

                    jugadores.get(id).setSexo(deporte);

                    System.out.println("el deporte del jugador  id: "+id+" fue editada");
                    mostrar();
                }else {
                    System.out.println("no se edito ningun caracter ");
                }
                break;
            case 5:
                System.out.println("saliendo de la edicion\n........");
                break;
        }
    }
}