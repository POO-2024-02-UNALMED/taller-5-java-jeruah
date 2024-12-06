package zooAnimales;

import java.util.List;

public class Anfibio extends Animal {
    private static int ranas;
    private static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    private static List<Anfibio> listado;

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public static Anfibio crearRana(String nombre, int edad, String habitat, String genero) {
        ranas++;
        return new Anfibio(nombre, edad, habitat, genero, "Verde", false);
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String habitat, String genero) {
        salamandras++;
        return new Anfibio(nombre, edad, habitat, genero, "Negro", true);
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }

    @Override
    public String movimiento() {
        return "saltar";
    }
}





