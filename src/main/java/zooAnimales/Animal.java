package zooAnimales;

import gestion.Zona;

public class Animal {
    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitat;
    private String genero;
    private Zona zona;

    public Animal() {
        totalAnimales++;
    }

    public Animal(String nombre, int edad, String habitat, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public String movimiento() {
        return "desplazarse";
    }

    public static String totalPorTipo() {
        int totalReptiles = Reptil.cantidadReptiles();
        int totalPez = Pez.cantidadPeces();
        int totalAves = Ave.cantidadAves();
        int totalMamiferos = Mamifero.cantidadMamiferos();
        int totalAnfibio=Anfibio.cantidadAnfibios();
        String message="Mamiferos: "+totalMamiferos+"\n" +
                "Aves: "+totalAves+"\n" +
                "Reptiles: "+totalReptiles+"\n" +
                "Peces: "+totalPez+"\n" +
                "Anfibios: "+totalAnfibio;

        return message;
    }

    @Override
    public String toString() {
        if (zona == null) {
            return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
        }else{
            return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona.getNombre()+", en el "+zona.getZoo().getNombre()+".";
        }
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getHabitat() {
        return habitat;
    }
    public String getGenero() {
        return genero;
    }
}
