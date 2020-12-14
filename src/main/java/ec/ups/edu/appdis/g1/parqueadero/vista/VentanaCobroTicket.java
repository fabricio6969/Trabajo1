package ec.ups.edu.appdis.g1.parqueadero.vista;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class VentanaCobroTicket {

	private JFrame VtnCobroTicket;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaCobroTicket window = new VentanaCobroTicket();
					window.VtnCobroTicket.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaCobroTicket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		VtnCobroTicket = new JFrame();
		VtnCobroTicket.setBounds(100, 100, 450, 300);
		VtnCobroTicket.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VtnCobroTicket.getContentPane().setLayout(null);
	}

}
