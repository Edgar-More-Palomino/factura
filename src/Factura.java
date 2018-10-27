import java.util.List;

public class Factura {
	private List<Articulo> articulos;
	private Cliente clientes;

	public List<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulo> articulos) {
		this.articulos = articulos;
	}

	public Cliente getClientes() {
		return clientes;
	}

	public void setClientes(Cliente clientes) {
		this.clientes = clientes;
	}

	@Override
	public String toString() {
		return "Factura [articulos=" + articulos + ", clientes=" + clientes + "]";
	}

}
