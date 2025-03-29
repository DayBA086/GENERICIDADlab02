public class Principal {
    public static void main(String[] args) {
        Cajoneria<Golosina> cajoneriaGolosinas = new Cajoneria<>();

        Golosina g4 = new Golosina("Chocolate", "Marrón");
        Golosina g5 = new Golosina("Caramelo", "Amarillo");
        Golosina g6 = new Golosina("Goma", "Rojo");

        cajoneriaGolosinas.add(new Caja<>(g4));
        cajoneriaGolosinas.add(new Caja<>(g5));
        cajoneriaGolosinas.add(new Caja<>(g6));

        String nombreBuscado = "Goma";
        Caja<Golosina> encontrada = cajoneriaGolosinas.search(nombreBuscado);

        if (encontrada != null) {
            System.out.println(nombreBuscado + " encontrado en la caja de color " + encontrada.getContenido().getColor());
        } else {
            System.out.println(nombreBuscado + " no encontrado.");
        }
    }
}
