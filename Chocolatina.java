public class Chocolatina {
    private String marca;
    private String nombre;
    private double precio;
    
    public Chocolatina(String nombre, double precio, String marca) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }
    public Chocolatina(String string, int i){
        
    }
    public Chocolatina(String string){
        
    } 
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getMarca(){
        return marca;
    }
     public void setMarca(String marca){
        this.marca = marca;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public String toString(){
        return "Chocolatina: " + nombre + " de la marca " + marca + "con precio de " + precio;
    }
}

//hace getstring, que devuelva todos los datos
