import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class InventarioTest implements Epigrafe5 {

    @Override
	@Test
    public void testAñadirProducto() {
        Inventario inv = new Inventario();
        inv.añadirProducto("Teclado", 10, 20);

        assertEquals(1, inv.getProductos().size());
    }

    @Override
	@Test
    public void testCalcularValorInventario() {
        Inventario inv = new Inventario();
        inv.añadirProducto("Ratón", 5, 10);

        assertEquals(50, inv.calcularValorInventario());
    }

    @Override
	@Test
    public void testEliminarProducto() {
        Inventario inv = new Inventario();
        inv.añadirProducto("Monitor", 2, 100);

        inv.eliminarProducto("Monitor");

        assertEquals(0, inv.getProductos().size());
    }
}