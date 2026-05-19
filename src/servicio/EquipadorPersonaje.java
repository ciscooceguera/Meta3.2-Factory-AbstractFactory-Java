package servicio;

import equipamiento.Arma;
import equipamiento.Armadura;
import fabricasEquipamiento.FabricaEquipamiento;
import personajes.Personaje;
import personajes.PersonajeBase;

public class EquipadorPersonaje {
    public void equipar(Personaje personaje, FabricaEquipamiento fabricaEquipamiento) {
        Arma arma = fabricaEquipamiento.crearArma();
        Armadura armadura = fabricaEquipamiento.crearArmadura();

        System.out.println();
        System.out.println("--- ESTADÍSTICAS ANTES DEL EQUIPAMIENTO ---");
        personaje.mostrarInfo();

        System.out.println();
        System.out.println("--- EQUIPAMIENTO OBTENIDO ---");
        System.out.println("Temática: " + fabricaEquipamiento.getTematica());
        System.out.println("Bonus: " + fabricaEquipamiento.getBonusDescripcion());
        System.out.println("Arma: " + arma.getNombre() + " (Daño: " + arma.getDaño() + ")");
        System.out.println("Armadura: " + armadura.getNombre() + " (Defensa: " + armadura.getDefensa() + ")");

        if (personaje instanceof PersonajeBase personajeBase) {
            int atributoAntes = personajeBase.getAtributoPrincipal();
            String nombreAtributo = personajeBase.getNombreAtributoPrincipal();

            personajeBase.equiparArma(arma);
            personajeBase.equiparArmadura(armadura);
            personajeBase.aplicarBonus(fabricaEquipamiento.getTematica());

            int atributoDespues = personajeBase.getAtributoPrincipal();
            int bonusAplicado = atributoDespues - atributoAntes;
            int dañoAtaque = arma.getDaño() + atributoDespues;

            System.out.println();
            System.out.println("--- " + personaje.getNombre() + " EQUIPADO ---");
            personaje.mostrarInfo();

            System.out.println("Arma equipada: " + arma.getNombre());
            System.out.println("Armadura equipada: " + armadura.getNombre());

            if (bonusAplicado > 0) {
                System.out.println(nombreAtributo + ": " + atributoDespues + " (" + atributoAntes + " + " + bonusAplicado + ")");
            } else {
                System.out.println(nombreAtributo + ": " + atributoDespues + " (sin bonus directo para esta clase)");
            }

            System.out.println("Daño de ataque estimado: " + dañoAtaque + " (" + arma.getDaño() + " + " + atributoDespues + ")");
        }
    }
}