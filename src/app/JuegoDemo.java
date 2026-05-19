package app;

import fabricasEquipamiento.FabricaEquipamiento;
import menu.MenuJugador;
import personajes.Goblin;
import personajes.Personaje;
import servicio.EquipadorPersonaje;

public class JuegoDemo {
    public static void main(String[] args) {
        MenuJugador menuJugador = new MenuJugador();

        Personaje personaje = menuJugador.crearPersonajeDesdeMenu();

        FabricaEquipamiento fabricaEquipamiento = menuJugador.seleccionarEquipamientoDesdeMenu();

        EquipadorPersonaje equipadorPersonaje = new EquipadorPersonaje();
        equipadorPersonaje.equipar(personaje, fabricaEquipamiento);

        simularCombate(personaje);
    }

    private static void simularCombate(Personaje personaje) {
        System.out.println();
        System.out.println("¡COMBATE DE PRUEBA!");

        Personaje goblin = new Goblin("Goblin");

        System.out.println(personaje.getNombre() + " se enfrenta a un Goblin.");
        System.out.println();

        personaje.atacar(goblin);

        System.out.println();

        if (goblin.getVida() <= 0) {
            System.out.println("Goblin ha sido derrotado.");
        } else {
            System.out.println("El Goblin sobrevivió al ataque.");
            goblin.mostrarInfo();

            System.out.println();
            System.out.println("El Goblin contraataca.");
            goblin.atacar(personaje);

            if (personaje.getVida() <= 0) {
                System.out.println(personaje.getNombre() + " ha sido derrotado.");
            } else {
                System.out.println(personaje.getNombre() + " sigue en pie.");
            }
        }
    }
}