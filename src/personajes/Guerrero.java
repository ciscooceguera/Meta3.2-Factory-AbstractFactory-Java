package personajes;

import java.util.Random;

public class Guerrero extends PersonajeBase {
    private int fuerza;

    public Guerrero(String nombre) {
        super(nombre);
        this.fuerza = generarValor(15, 20);
    }

    private int generarValor(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo;
    }

    public int getFuerza() {
        return fuerza;
    }

    @Override
    public String getClasePersonaje() {
        return "Guerrero";
    }

    @Override
    public int getAtributoPrincipal() {
        return fuerza;
    }

    @Override
    public String getNombreAtributoPrincipal() {
        return "Fuerza";
    }

    @Override
    public void aplicarBonus(String tematica) {
        if (tematica.equalsIgnoreCase("Vikingo")) {
            fuerza += 15;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println(nombre + " el Guerrero - Nivel " + nivel + " | Vida: " + vida + " | Fuerza: " + fuerza);
    }
}