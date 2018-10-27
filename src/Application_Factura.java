import java.util.ArrayList;
import java.util.List;

public class Application_Factura {

	public static void main(String[] args) {
		
		Factura factura = new Factura();
		
		List<Articulo> articulos = new ArrayList<Articulo>();
		articulos.add(construirArticulo());
		articulos.add(construirArticulo());

		
		
		factura.setClientes(construirCliente());
		factura.setArticulos(articulos);

		System.out.println(factura);

	}

	private static Articulo construirArticulo() {
		Articulo articulo = new Articulo();
		articulo.setMarca("sansumg");
		articulo.setPrecio(123.34);
		articulo.setVoltaje(220);
		return articulo;
	}

	private static Cliente construirCliente() {
		Cliente cliente = new Cliente();
		cliente.setDni(567898765);
		cliente.setNombre("edgar");
		return cliente;
	}

}
