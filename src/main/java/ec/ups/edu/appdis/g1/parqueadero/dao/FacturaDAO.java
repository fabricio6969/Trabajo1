package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Factura;

@Stateless
public class FacturaDAO {
	private Connection con;
	
	public boolean insert(Factura entity) throws SQLException {
		String sql = "INSERT INTO Factura (numero, fechaEmision, valorTotal, ticket, cliente)"
				+"VALUES(?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getNumero());
		ps.setDate(2, (Date) entity.getFechaEmision());
		ps.setDouble(3, entity.getValorTotal());
		ps.setInt(4, entity.getTicket().getCodigo());
		ps.setString(5, entity.getCliente().getNombre());
	
		
		ps.executeUpdate();
		ps.close();
		
		return true;		
	}
	
	public boolean update(Factura entity) throws SQLException {
		String sql = "UPDATE Factura SET"
				+ "fechaEmision =?, valorTotal=?, ticket=?, cliente=? WHERE numero="+entity.getNumero();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDate(1, (Date) entity.getFechaEmision());
		ps.setDouble(2, entity.getValorTotal());
		ps.setInt(3, entity.getTicket().getCodigo());
		ps.setString(4, entity.getCliente().getDni());
		
		
		return true;		
	}
	
	public Factura read(int id) throws SQLException {
		String sql = "SELECT * FROM Factura WHERE numero="+id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return null;	
	}
	
	public boolean delete(int id) throws SQLException {
		String sql = "DELETE  FROM Factura WHERE numero="+id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return true;		
	}
}
