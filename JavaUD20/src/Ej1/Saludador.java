package Ej1;

import javax.swing.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class Saludador extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton  btnSaludar;
		
	public Saludador() {
		setLayout(null);
		setTitle("Saludador");
		
		
		//Etiqueta donde te dice que pongas el nombre
		JLabel etiqueta = new JLabel("Escribe un nombre para saludar");
		etiqueta.setBounds(224, 25, 200, 100);
		add(etiqueta);
		
		//Para introducir texto
		textField = new JTextField();
		textField.setBounds(220, 107, 186, 26);
		add(textField);

		//EL boton de saludar
		btnSaludar = new JButton("Saludar");
		btnSaludar.setBounds(280, 145, 89, 23);
		add(btnSaludar);
		btnSaludar.addActionListener(this);
		
		
	}
	public void actionPerformed(ActionEvent e ) {
		System.out.println("hola");
		if (e.getSource() == btnSaludar) {
			 JOptionPane.showMessageDialog(null,"Hola "+textField.getText());
		}
		
		
	}

}
