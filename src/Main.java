import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       mostrarMenu(); 
    }

    static void mostrarMenu(){
        Personaje personaje_jugador = new Personaje();
        String opcion_elegida;
        Scanner scanner = new Scanner(System.in);
        boolean iniciar_menu = true;
        System.out.println("BIENVENIDOS AL MUNDO DE WESTEROS");

        while (iniciar_menu){
        System.out.println("1. CREAR PERSONAJE");
        System.out.println("2. VER PERSONAKE");
        System.out.println("3. SALIR");

        System.err.println("Por favor ingrese una opción: ");

        opcion_elegida = scanner.nextLine();

        System.out.println("La opción escogida por el usuario es: " + opcion_elegida);
        
        //este sirve para hacer acciones en función de un valor asus posibles valores
        switch (opcion_elegida) {
            case "1":
                System.out.println("CREACIÓN DE PERSONAJE");
                System.out.println("¿Cómo llamarás a tu héroe?");
                personaje_jugador.nombre = scanner.nextLine();
                System.out.println("¿Cuál es el apellido de tu héroe?");
                personaje_jugador.apellido = scanner.nextLine();
                System.out.println("Indique la vida del héroe");
                //ya no lo haremos asi, es inseguro TTnTT
                //personaje_jugador.vida = Integer.parseInt(scanner.nextLine());
                personaje_jugador.setearVida(Integer.parseInt(scanner.nextLine()));
                break;

            case "2":
                System.out.println("VER PERSONAJE");
                System.out.println("Nombre: " + personaje_jugador.nombre);
                System.out.println("Apellido: " + personaje_jugador.apellido);
                System.out.println("Vida: " + personaje_jugador.verVida());
                break;
            
            case "3":
                System.out.println("GRACIAS POR JUGAR");
                iniciar_menu = false;
                break;
        
            default:
                System.out.println("POR FAVOR INGRESE UNA DE LAS OPCIONES PERMITIDAS");
                break;
        }
        }

    }

}