package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.ejb.Stateless;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;

@Stateless
public class TicketDAO {
	private Connection con;
	
	public boolean insert(Ticket entity) throws SQLException {
		String sql = "INSERT INTO Ticket (codigo, fechaIngreso, fechaSalida, tiempo, valor, vehiculo)"
				+"VALUES(?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, entity.getCodigo());
		ps.setDate(2, (Date) entity.getFechaIngreso());
		ps.setDate(3, (Date) entity.getFechaSalida());
		ps.setInt(4, entity.getTiempo());
		ps.setDouble(5, entity.getValor());
		ps.setString(6, entity.getVehiculo().getPlaca());
		ps.executeUpdate();
		ps.close();
		return true;		
	}
	
	public boolean update(Ticket entity) throws SQLException {
		String sql = "UPDATE Ticket SET "
				+ "fechaIngreso=?, fechaSalida=?, tiempo=?, valor=?, vehiculo=?,  WHERE codigo="+entity.getCodigo();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDate(1, (Date) entity.getFechaIngreso());
		ps.setDate(2, (Date) entity.getFechaSalida());
		ps.setInt(3, entity.getTiempo());
		ps.setDouble(4, entity.getValor());
		ps.setString(5, entity.getVehiculo().getPlaca());
		ps.executeUpdate();
		ps.close();
		return true;			
	}
	
	public Ticket read(int id) throws SQLException {
		String sql = "SELECT * FROM Ticket WHERE codigo="+id;
		PreparedStatement ps = con.prepareStatement(sql);

		ps.executeUpdate();
		ps.close();
		return null;	
	}
	
	public boolean delete(int id) {
		return true;		
	}
}
