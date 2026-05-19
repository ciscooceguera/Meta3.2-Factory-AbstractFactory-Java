package fabricasEquipamiento;

import equipamiento.Arma;
import equipamiento.Armadura;

public interface FabricaEquipamiento {
    Arma crearArma();

    Armadura crearArmadura();

    String getTematica();

    String getBonusDescripcion();
}