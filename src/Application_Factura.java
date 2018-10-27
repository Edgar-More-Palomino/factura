import java.util.ArrayList;
import java.util.List;

public class Application_Factura {

	public static void main(String[] args) {

		Factura factura = new Factura();

		List<Electrodomestico> electrodomesticos = new ArrayList<Electrodomestico>();
		electrodomesticos.add(construirArticulo());
		electrodomesticos.add(construirArticulo());

		factura.setCliente(construirCliente());
		factura.setElectrodomesticos(electrodomesticos);

		System.out.println(factura);

	}

	private static Electrodomestico construirArticulo() {
		Electrodomestico articulo = new Electrodomestico();
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
