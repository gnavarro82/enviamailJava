package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaMensaje extends JFrame {
	private static final String Subject = null;
	public JTextField txtpara, txtasunto;
	public JButton btnenviar, btncancelar, btnlimpiar;
	public JLabel lblpara, lblasunto, lblmensaje;
	public JTextArea area;

	public static String username, password;
	String Mensaje = "";
	String to = "";
	String subject = "";

	public VentanaMensaje() {
		setBounds(10, 20, 400, 350);
		setTitle("Ingresa El Mensaje a Enviar ");
		setLayout(null);
		setResizable(false);
		setLocationRelativeTo(null);

		// Inicializar
		txtpara = new JTextField();
		txtasunto = new JTextField();

		btnenviar = new JButton("Enviar");
		btncancelar = new JButton("Cancelar");
		btnlimpiar = new JButton("Limpiar Campos");

		lblpara = new JLabel("PARA");
		lblasunto = new JLabel("ASUNTO");
		lblmensaje = new JLabel("MENSAJE");

		area = new JTextArea();
		area.setLineWrap(true); // logra que haya un salto de linea en el textarea
		area.setWrapStyleWord(true); // se impide la divicion de palabras en el textarea

		// UBICACICON
		lblpara.setBounds(10, 20, 70, 28);
		lblasunto.setBounds(10, 50, 70, 28);
		lblmensaje.setBounds(10, 80, 70, 28);

		txtpara.setBounds(83, 21, 280, 23);
		txtasunto.setBounds(83, 51, 280, 23);

		area.setBounds(10, 104, 355, 150);

		btnenviar.setBounds(47, 260, 80, 28);
		btncancelar.setBounds(130, 260, 90, 28);
		btnlimpiar.setBounds(227, 260, 127, 28);

		// Agregar al Frame
		add(lblpara);
		add(lblasunto);
		add(lblmensaje);
		add(txtpara);
		add(txtasunto);
		add(area);
		add(btnenviar);
		add(btncancelar);
		add(btnlimpiar);

		// ===================EVENTOS
		// ===================================================

		btnenviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Mensaje = area.getText();
				to = txtpara.getText();
				subject = txtasunto.getText();
				SendMail();

			}
		});

		btncancelar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});

	}// fin del consructor

	public void SendMail() {
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject(subject);
			message.setText(Mensaje);

			Transport.send(message);
			JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}

}// fin
