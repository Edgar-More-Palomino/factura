import java.util.List;

public class Factura {
	private List<Electrodomestico> electrodomesticos;
	private Cliente cliente;

	public List<Electrodomestico> getElectrodomesticos() {
		return electrodomesticos;
	}

	public void setElectrodomesticos(List<Electrodomestico> electrodomesticos) {
		this.electrodomesticos = electrodomesticos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Factura [electrodomesticos=" + electrodomesticos + ", cliente=" + cliente + "]";
	}

	public double calcularSubTotal() {
		double precio = 0;
		for (int x = 0; x < electrodomesticos.size(); x++) {
			Electrodomestico electrodomestico = electrodomesticos.get(x);
			precio += electrodomestico.getPrecio();
		}
		return precio;
	}
	
	public double calcularIgv() {
		
		
		return calcularSubTotal()*0.18;
	}
	
	public double calcularTotal() {
		
		return calcularSubTotal()-calcularIgv();
	}
	
	

}
