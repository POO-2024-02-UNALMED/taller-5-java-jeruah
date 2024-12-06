package gestion;

import java.util.*;

public class Zoologico {
    private String nombre;
    private String ubicacion;
    private List<Zona> zonas;

    public Zoologico() {
        this.zonas = new ArrayList<>();
    }
    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = new ArrayList<>();
    }

    public void agregarZonas(Zona zona) {
        zonas.add(zona);
    }

    public int cantidadTotalAnimales() {
        int cantidad = 0;
        for (Zona zona : zonas) {
            cantidad += zona.cantidadAnimales();
        }
        return cantidad;
    }

    public String getNombre(){
        return nombre;
    }
    public List<Zona> getZona(){
        return zonas;
    }
}