package fabricasEquipamiento;

import equipamiento.Arma;
import equipamiento.Armadura;
import equipamiento.CueroMetal;
import equipamiento.HachaDosManos;

public class FabricaVikingo implements FabricaEquipamiento {
    @Override
    public Arma crearArma() {
        return new HachaDosManos();
    }

    @Override
    public Armadura crearArmadura() {
        return new CueroMetal();
    }

    @Override
    public String getTematica() {
        return "Vikingo";
    }

    @Override
    public String getBonusDescripcion() {
        return "+15 Fuerza";
    }
}