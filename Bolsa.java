// Clase Bolsa para almacenar golosinas
import java.util.List;
import java.util.ArrayList;

class Bolsa<T> {
    private List<T> elementos;
    
    public Bolsa() {
        elementos = new ArrayList<>();
    }
    
    public void agregar(T elemento) {
        elementos.add(elemento);
    }
    
    public T obtener(int index) {
        return elementos.get(index);
    }
    
    public int contarElementos() {
        return elementos.size();
    }
}
