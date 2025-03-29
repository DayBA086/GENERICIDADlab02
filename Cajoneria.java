import java.util.ArrayList;

public class Cajoneria<T> {
    private ArrayList<Caja<T>> lista = new ArrayList<>();

    public void add(Caja<T> caja) {
        lista.add(caja);
    }

    public Caja<T> obtener(int indice) {
        return lista.get(indice);
    }

    public Caja<T> search(String nombre) {
        for (Caja<T> caja : lista) {
            if (caja.getContenido().toString().equals(nombre)) {
                return caja;
            }
        }
        return null;
    }
}
