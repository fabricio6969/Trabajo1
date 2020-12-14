package ec.ups.edu.appdis.g1.parqueadero.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;

@Stateless

public class ClienteDAO {
	@Inject
	private Connection con;
	
	//@Inject
	private EntityManager em;
	
	
	
	
	public ClienteDAO() {
	
	}
	
	public boolean insertJPA(Cliente entity) throws SQLException {
		em.persist(entity);
		return true;
		
	}

	public boolean insert(Cliente entity) throws SQLException {
		String sql = "INSERT INTO Cliente (dni, email, nombre, tipo_documento)"
				+"VALUES(?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, entity.getDni());
		ps.setString(2, entity.getEmail());
		ps.setString(3, entity.getNombre());
		ps.setInt(4, entity.getTipoDocumento());
		
		ps.executeUpdate();
		ps.close();
		return true;		
	}
	
	public boolean update(Cliente entity) throws SQLException {
		String sql = "UPDATE Cliente SET "
				+ "tipoDocumento=?, nombre=?, email=? WHERE dni="+entity.getDni();
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, entity.getEmail());
		ps.setString(2, entity.getNombre());
		ps.setInt(3, entity.getTipoDocumento());
		
		ps.executeUpdate();
		ps.close();
		return true;		
	}
	
	public boolean updateJPA(Cliente entity) {
		em.merge(entity);
		return true;
	}
	
	public Cliente read(int id) throws SQLException {
		String sql = "SELECT * FROM Cliente WHERE dni="+id;
		PreparedStatement ps = con.prepareStatement(sql);

		ps.executeUpdate();
		ps.close();
		return null;		
	}
	
	public Cliente readJPA(int id)  {
		Cliente cliente = em.find(Cliente.class, id);
		return cliente;		
	}
	
	public boolean delete(int id) throws SQLException {
		String sql = "DELETE  FROM Cliente WHERE dni="+id;
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		return true;		
	}
	public boolean deleteJPA(int id) throws SQLException {
		Cliente cliente = this.read(id);
		em.remove(cliente);
		return true;		
	}
	
	
	public List<Cliente> getClientes(){
		String jpql = "SELECT c FROM Cliente c WHERE tipoDocumento = ?";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter(1, 1);
		return (List<Cliente>) q.getResultList();
	}
	
}
