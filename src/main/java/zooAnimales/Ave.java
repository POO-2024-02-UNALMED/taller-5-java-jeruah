package zooAnimales;

public class Ave extends Animal {
    private static int halcones;
    private static int aguilas;
    private String colorPlumas;


    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public static Ave crearHalcon(String nombre, int edad, String habitat, String genero) {
        halcones++;
        return new Ave(nombre, edad, habitat, genero, "Gris");
    }

    public static Ave crearAguila(String nombre, int edad, String habitat, String genero) {
        aguilas++;
        return new Ave(nombre, edad, habitat, genero, "Blanco");
    }

    public static int cantidadAves() {
        return halcones + aguilas;
    }

    @Override
    public String movimiento() {
        return "volar";
    }
}