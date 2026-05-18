package equipamiento;

import personajes.Personaje;
import personajes.PersonajeBase;

public class HachaDosManos implements Arma {
    private final String nombre;
    private final int daño;

    public HachaDosManos() {
        this.nombre = "Hacha de dos manos";
        this.daño = 45;
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

        System.out.println(portador.getNombre() + " ataca con " + nombre + ".");
        System.out.println("¡Golpe brutal! " + objetivo.getNombre() + " recibe " + dañoTotal + " de daño.");
        objetivo.recibirDaño(dañoTotal);
    }
}