package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class VentanaIngresoTicket {

	private JFrame frmVentaCobraTicket;
	private JTextField txtnumeroticket;
	private JTextField txtfechaIngresoTicket;
	private JTextField txtPlaca;
	private JTextField txtMarca;
	private JTextField txtColor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIngresoTicket window = new VentanaIngresoTicket();
					window.frmVentaCobraTicket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaIngresoTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmVentaCobraTicket = new JFrame();
		frmVentaCobraTicket.setTitle("Ingreso Ticket");
		frmVentaCobraTicket.setBounds(100, 100, 647, 367);
		frmVentaCobraTicket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmVentaCobraTicket.getContentPane().setLayout(null);
		
		JLabel numero = new JLabel("# :");
		numero.setBounds(54, 36, 18, 25);
		frmVentaCobraTicket.getContentPane().add(numero);
		
		JLabel lblFechaYHora = new JLabel("Placa :");
		lblFechaYHora.setBounds(39, 106, 72, 25);
		frmVentaCobraTicket.getContentPane().add(lblFechaYHora);
		
		JLabel lblFechaYHora_1 = new JLabel("Fecha y hora : ");
		lblFechaYHora_1.setBounds(39, 71, 72, 25);
		frmVentaCobraTicket.getContentPane().add(lblFechaYHora_1);
		
		txtnumeroticket = new JTextField();
		txtnumeroticket.setEditable(false);
		txtnumeroticket.setEnabled(false);
		txtnumeroticket.setBounds(139, 36, 96, 19);
		frmVentaCobraTicket.getContentPane().add(txtnumeroticket);
		txtnumeroticket.setColumns(10);
		
		txtfechaIngresoTicket = new JTextField();
		txtfechaIngresoTicket.setEditable(false);
		txtfechaIngresoTicket.setEnabled(false);
		txtfechaIngresoTicket.setBounds(139, 71, 96, 19);
		frmVentaCobraTicket.getContentPane().add(txtfechaIngresoTicket);
		txtfechaIngresoTicket.setColumns(10);
		
		txtPlaca = new JTextField();
		txtPlaca.setBounds(139, 106, 96, 19);
		frmVentaCobraTicket.getContentPane().add(txtPlaca);
		txtPlaca.setColumns(10);
		
		JButton btnBuscarVehiculo = new JButton("Buscar");
		btnBuscarVehiculo.setBounds(279, 105, 81, 21);
		frmVentaCobraTicket.getContentPane().add(btnBuscarVehiculo);
		
		JLabel lblNewLabel = new JLabel("Marca");
		lblNewLabel.setBounds(142, 159, 45, 13);
		frmVentaCobraTicket.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Color");
		lblNewLabel_1.setBounds(279, 159, 45, 13);
		frmVentaCobraTicket.getContentPane().add(lblNewLabel_1);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(140, 180, 96, 19);
		frmVentaCobraTicket.getContentPane().add(txtMarca);
		txtMarca.setColumns(10);
		
		txtColor = new JTextField();
		txtColor.setBounds(246, 180, 96, 19);
		frmVentaCobraTicket.getContentPane().add(txtColor);
		txtColor.setColumns(10);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpiar.setBounds(82, 220, 105, 34);
		frmVentaCobraTicket.getContentPane().add(btnLimpiar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(246, 220, 96, 34);
		frmVentaCobraTicket.getContentPane().add(btnGuardar);
	}
}
