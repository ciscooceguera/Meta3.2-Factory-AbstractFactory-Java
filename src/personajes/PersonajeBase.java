package personajes;

import equipamiento.Arma;
import equipamiento.Armadura;

public abstract class PersonajeBase implements Personaje {
    protected String nombre;
    protected int nivel;
    protected int vida;
    protected Arma arma;
    protected Armadura armadura;

    public PersonajeBase(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.vida = 100;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void recibirDaño(int daño) {
        int dañoFinal = Math.max(0, daño);

        if (armadura != null) {
            int reduccion = armadura.getDefensa();
            dañoFinal = Math.max(0, daño - reduccion);
            System.out.println(nombre + " bloquea " + reduccion + " puntos de daño con " + armadura.getNombre() + ".");
        }

        vida -= dañoFinal;

        if (vida < 0) {
            vida = 0;
        }

        System.out.println(nombre + " recibe " + dañoFinal + " puntos de daño. Vida actual: " + vida);
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (arma == null) {
            System.out.println(nombre + " ataca sin arma.");
            objetivo.recibirDaño(10);
        } else {
            arma.usar(this, objetivo);
        }
    }

    @Override
    public void subirNivel() {
        nivel++;
        vida += 20;
        System.out.println(nombre + " subió al nivel " + nivel + ". Vida actual: " + vida);
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void equiparArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public Arma getArma() {
        return arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public abstract int getAtributoPrincipal();

    public abstract String getNombreAtributoPrincipal();

    public abstract void aplicarBonus(String tematica);
}