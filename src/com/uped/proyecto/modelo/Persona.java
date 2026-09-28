package com.uped.proyecto.modelo;

public class Persona {
    private final String nombre;
    private final String dui;

    public Persona(String nombre, String dui) {
        this.nombre = nombre;
        this.dui = dui;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDui() {
        return dui;
    }

    public String presentarse() {
        return nombre + " (DUI: " + dui + ")";
    }
}
