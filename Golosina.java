import java.util.ArrayList;
import java.util.List;

// 
public class Golosina {
    private String nombre;
    private String color; // Ahora color es un atributo de la clase

    public Golosina(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() { // Agrega este método para evitar el error en Principal.java
        return color;
    }
}
