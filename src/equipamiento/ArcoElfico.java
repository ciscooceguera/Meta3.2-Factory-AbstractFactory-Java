package equipamiento;

import personajes.Personaje;
import personajes.PersonajeBase;

public class ArcoElfico implements Arma {
    private final String nombre;
    private final int daño;

    public ArcoElfico() {
        this.nombre = "Arco largo élfico";
        this.daño = 35;
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

        System.out.println(portador.getNombre() + " dispara con " + nombre + ".");
        System.out.println("¡Disparo preciso! " + objetivo.getNombre() + " recibe " + dañoTotal + " de daño.");
        objetivo.recibirDaño(dañoTotal);
    }
}