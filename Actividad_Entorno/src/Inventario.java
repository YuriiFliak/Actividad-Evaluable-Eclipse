import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos = new ArrayList<>();

    public void añadirProducto(String nombre, int cantidad, double precio) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("Cantidad negativa no permitida");
        }
        productos.add(new Producto(nombre, cantidad, precio));
    }

    public void eliminarProducto(String nombre) {
        productos.removeIf(p -> p.getNombre().equals(nombre));
    }

    public double calcularValorInventario() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getCantidad() * p.getPrecio();
        }
        return total;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}