package gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaLogin extends JFrame {
	private JTextField txtemail;
	private JPasswordField txtclave;
	private JButton btnaceptar, btncancelar;
	private JLabel lblmail, lblclave;
	

	
	public VentanaLogin() {
		setBounds(10, 20, 300, 150);
		setTitle("Ingresa los Datos de Gmail");
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);

		// Inicializar
		txtemail = new JTextField();
		txtclave = new JPasswordField();
		btnaceptar = new JButton("Aceptar");
		btncancelar = new JButton("Cancelar");
		lblmail = new JLabel("E Mail");
		lblclave = new JLabel("Contraseña");
		
		
		
		// UBICACICON
		lblmail.setBounds(10, 20, 70, 28);
		lblclave.setBounds(10, 50, 70, 28);
		
		txtemail.setBounds(83, 21, 180, 23);
		txtclave.setBounds(83, 51, 180, 23);
		
		btnaceptar.setBounds(80, 80, 80, 28);
		btncancelar.setBounds(166, 80, 90, 28);

		// Agregar al Frame
		add(lblmail);
		add(lblclave);
		add(txtemail);
		add(txtclave);
		add(btnaceptar);
		add(btncancelar);
		
		btnaceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VentanaMensaje m = new VentanaMensaje();
				m.username  = txtemail.getText();
				m.password = new String(txtclave.getPassword());
				
				///JOptionPane.showMessageDialog(null, "usuario = "+username+" clave = "+password, "Prueba de Action", JOptionPane.OK_OPTION);
				dispose();
				m.setVisible(true);
				
				
			}
		});
		
		
		btncancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		

	}

}
