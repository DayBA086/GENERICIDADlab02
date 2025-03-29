public class TestGen {
    public static void main( String args[] ){
        //crear una cajoneria de golosinas
        Cajoneria<Golosina> cajoneria = new Cajoneria<> ("Rojo");
        
        // agregar columnas a la cajoneria
        cajoneria.add(new Golosina("chicle", 0.05));
        cajoneria.add(new Golosina("paleta", 0.1));
        cajoneria.add(new Golosina("chocolate", 0.2));
        cajoneria.add(new Golosina("caramelo", 0.03));
        cajoneria.add(new Golosina("gomitas", 0.15));
        
        //buscar golosinas por nombre y peso 
        System.out.println("buscando golosina por nombre: ");
        System.out.println(cajoneria.search(new Golosina ("chocolate", 0)));
        System.out.println(cajoneria.search(new Golosina ("menta", 0)));
        
        System.out.println("buscando golosina por peso: ");
        System.out.println(cajoneria.search(new Golosina ("", 0.15)));
        System.out.println(cajoneria.search(new Golosina ("", 0.25)));
        
        //eliminar una golosina de la cajoneria
        Golosina eliminada =cajoneria.delete(new Golosina("caramelo", 0.03));
        System.out.println("Golosina eliminada: " + eliminada);
        
        //mostrar contenido de la cajoneria
        System.out.println(cajoneria);
    
        
    
    /*String[] v = {”Perez”,”Sanchez”,”Rodriguez”};
    Integer[] w = {12,34,56};
    System.out.println(exist(v,”Sanchez”));
    System.out.println(exist(w,34));
    System.out.println(exist(w,”Salas”)); //Error*/
    