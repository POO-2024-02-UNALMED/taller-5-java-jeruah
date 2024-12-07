package gestion;

import java.util.*;
import zooAnimales.*;

public class Zona {
    private String nombre;
    private Zoologico zoo;
    private List<Animal> animales = new ArrayList<>();

    public Zona() {
        this.animales = new ArrayList<>();
    }
    public Zona(String nombre, Zoologico zoo) {
        this.nombre = nombre;
        this.zoo = zoo;
        this.animales = new ArrayList<>();
    }

    public void agregarAnimales(Animal animal) {
        animales.add(animal);
    }

    public int cantidadAnimales() {
        return animales.size();
    }

    public Zoologico getZoo(){
        return this.zoo;
    }
    public String getNombre(){
        return nombre;
    }
}