package Inicio;

import javax.swing.JFrame;

import gui.VentanaLogin;
import gui.VentanaMensaje;

public class JavaMail {
	/*
	Ahora vamos con la programaci�n. Primero la clase JavaMail. 
	Aqu� solo se necesita instanciar la ventana LogIn para que cuando se inicie la ejecuci�n 
	lo primero que suceda es que se pida el usuario y la contrase�a de lo que ser�
	la cuenta que enviar� el correo electr�nico.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaLogin v = new VentanaLogin();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setVisible(true);
	
	}

}
