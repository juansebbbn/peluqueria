package com.mycompany.peluqueria.logica;

import com.mycompany.peluqueria.persistencia.ControladorPersistencia;

public class Controlador {

    ControladorPersistencia controlPer = new ControladorPersistencia();

    public void guardar(String nombreE, String razaE, String observacionesE,
            String nombre_duenioE, String cel_duenioE,
            String cmb_alergicoE, String cmb_atencionE,
            String colorE) {

        //creamos y asignamos valores al dueño
        Duenio duenio = new Duenio();
        duenio.setCel_duenio(cel_duenioE);
        duenio.setNombre(nombre_duenioE);

        //creamos y asignamos valores a la mascota
        Mascota mascota = new Mascota();
        mascota.setAlergico(cmb_alergicoE);
        mascota.setAtencion_especial(cmb_atencionE);
        mascota.setColor(colorE);
        mascota.setDuenio(duenio);
        mascota.setNombre(nombreE);
        mascota.setObservaciones(observacionesE);
        mascota.setRaza(razaE);

        controlPer.guardar(duenio, mascota);
    }

}
