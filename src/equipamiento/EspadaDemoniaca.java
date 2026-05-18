package equipamiento;

import personajes.Personaje;
import personajes.PersonajeBase;

public class EspadaDemoniaca implements Arma {
    private final String nombre;
    private final int daño;

    public EspadaDemoniaca() {
        this.nombre = "Espada de fuego infernal";
        this.daño = 50;
    }

    @Override
    public int getDaño() {
        return daño;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void usar(Personaje portador, Personaje objetivo) {
        int dañoTotal = daño;

        if (portador instanceof PersonajeBase personajeBase) {
            dañoTotal += personajeBase.getAtributoPrincipal();
        }

        System.out.println(portador.getNombre() + " invoca el poder de " + nombre + ".");
        System.out.println("¡Llamas infernales! " + objetivo.getNombre() + " recibe " + dañoTotal + " de daño.");
        objetivo.recibirDaño(dañoTotal);
    }
}