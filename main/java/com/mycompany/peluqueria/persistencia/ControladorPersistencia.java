package com.mycompany.peluqueria.persistencia;

import com.mycompany.peluqueria.logica.Duenio;
import com.mycompany.peluqueria.logica.Mascota;

public class ControladorPersistencia {

    DuenioJpaController duenioJPA = new DuenioJpaController();
    MascotaJpaController mascotaJPA = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        //crear en la bd el dueño
        duenioJPA.create(duenio);

        //crear en la bd la mascota
        mascotaJPA.create(mascota);

    }

}
