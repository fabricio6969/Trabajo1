package ec.ups.edu.appdis.g1.parqueadero.negocio;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Factura;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;

public class EmisionFacturaON {
	
	public boolean registrarCliente(Cliente cliente) {
		return true;
		
	}
	public Ticket buscarTicket(int idTicket) {
		return null;
	}
	
	public Factura buscarFactura(int numFactura) {
		return null;
	}

	public double calcularIVA(double valorTotal) {
		return 0;	
	}
	public void imprimirFactura() {
		
	}
}
