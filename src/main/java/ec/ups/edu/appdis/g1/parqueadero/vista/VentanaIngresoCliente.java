package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaIngresoCliente {

	private JFrame frame;
	private JTextField txtNombre;
	private JTextField txtDNI;
	private JTextField txtemail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaIngresoCliente window = new VentanaIngresoCliente();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaIngresoCliente() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(22, 38, 45, 13);
		frame.getContentPane().add(lblNombre);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(22, 72, 45, 13);
		frame.getContentPane().add(lblDNI);
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setBounds(22, 124, 45, 13);
		frame.getContentPane().add(lblemail);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(153, 35, 96, 19);
		frame.getContentPane().add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(153, 79, 96, 19);
		frame.getContentPane().add(txtDNI);
		txtDNI.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setBounds(153, 121, 96, 19);
		frame.getContentPane().add(txtemail);
		txtemail.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardarCliente();
				
			}

			private void guardarCliente() {
				// TODO Auto-generated method stub
				
			}
		});
		btnGuardar.setBounds(80, 182, 85, 21);
		frame.getContentPane().add(btnGuardar);
	}
}
