
public class Electrodomestico {
	private int voltaje;
	private double precio;
	private String marca;

	public int getVoltaje() {
		return voltaje;
	}

	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Articulo [voltaje=" + voltaje + ", precio=" + precio + ", marca=" + marca + "]";
	}

}
