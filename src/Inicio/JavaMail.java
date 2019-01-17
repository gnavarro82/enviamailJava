package Inicio;

import javax.swing.JFrame;

import gui.VentanaLogin;
import gui.VentanaMensaje;

public class JavaMail {
	/*
	Ahora vamos con la programación. Primero la clase JavaMail. 
	Aquí solo se necesita instanciar la ventana LogIn para que cuando se inicie la ejecución 
	lo primero que suceda es que se pida el usuario y la contraseña de lo que será
	la cuenta que enviará el correo electrónico.
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaLogin v = new VentanaLogin();
		v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setVisible(true);
	
	}

}
