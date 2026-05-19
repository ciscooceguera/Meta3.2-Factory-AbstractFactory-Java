package menu;

import fabricas.FabricaArquero;
import fabricas.FabricaGuerrero;
import fabricas.FabricaMago;
import fabricas.FabricaPersonajes;
import fabricasEquipamiento.FabricaDemoniaca;
import fabricasEquipamiento.FabricaElfica;
import fabricasEquipamiento.FabricaEquipamiento;
import fabricasEquipamiento.FabricaVikingo;
import personajes.Personaje;

import java.util.Scanner;

public class MenuJugador {
    private final Scanner scanner;

    public MenuJugador() {
        this.scanner = new Scanner(System.in);
    }

    public Personaje crearPersonajeDesdeMenu() {
        System.out.println("=== GUILD QUEST STUDIOS - CREADOR DE PERSONAJES ===");
        System.out.println();
        System.out.println("Selecciona tu clase:");
        System.out.println("1. Guerrero (Fuerza bruta)");
        System.out.println("2. Mago (Poder arcano)");
        System.out.println("3. Arquero (Precisión letal)");

        int opcion = leerOpcion(1, 3);

        FabricaPersonajes fabricaPersonajes;
        String claseSeleccionada;

        switch (opcion) {
            case 1:
                fabricaPersonajes = new FabricaGuerrero();
                claseSeleccionada = "guerrero";
                break;

            case 2:
                fabricaPersonajes = new FabricaMago();
                claseSeleccionada = "mago";
                break;

            case 3:
                fabricaPersonajes = new FabricaArquero();
                claseSeleccionada = "arquero";
                break;

            default:
                fabricaPersonajes = new FabricaGuerrero();
                claseSeleccionada = "guerrero";
                break;
        }

        System.out.print("Ingresa el nombre de tu " + claseSeleccionada + ": ");
        String nombre = scanner.nextLine();

        while (nombre.trim().isEmpty()) {
            System.out.print("El nombre no puede estar vacío. Ingresa nuevamente el nombre: ");
            nombre = scanner.nextLine();
        }

        Personaje personaje = fabricaPersonajes.crearPersonaje(nombre);

        System.out.println();
        System.out.println("--- Personaje CREADO ---");
        personaje.mostrarInfo();

        return personaje;
    }

    public FabricaEquipamiento seleccionarEquipamientoDesdeMenu() {
        System.out.println();
        System.out.println("Selecciona tu estilo de equipamiento:");
        System.out.println("1. Vikingo (+15 Fuerza)");
        System.out.println("2. Élfico (+20 Puntería)");
        System.out.println("3. Demoníaco (+25 Daño mágico)");

        int opcion = leerOpcion(1, 3);

        switch (opcion) {
            case 1:
                return new FabricaVikingo();

            case 2:
                return new FabricaElfica();

            case 3:
                return new FabricaDemoniaca();

            default:
                return new FabricaVikingo();
        }
    }

    private int leerOpcion(int minimo, int maximo) {
        int opcion;

        while (true) {
            System.out.print("Opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();

                if (opcion >= minimo && opcion <= maximo) {
                    return opcion;
                }
            } else {
                scanner.nextLine();
            }

            System.out.println("Opción inválida. Intenta nuevamente.");
        }
    }
}