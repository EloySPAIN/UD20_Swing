package clases;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Saludador extends JFrame{
	private JPanel panel;
	
	public Saludador() {
		//Creamos el panel
		setTitle("Saludador");
		setBounds(400, 400, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Creamos el panel, el texto y el label
		panel = new JPanel();
		//Indicamos el diseño del panel
		panel.setLayout(null);
		setContentPane(panel);
		JTextField texto = new JTextField(10);
		JLabel lb = new JLabel("Escribe un nombre para saludar");
		JButton boton = new JButton("Saludar!");
		
		//Asignamos las cardinalidades de los componentes
		lb.setBounds(200,70,500,20);
		texto.setHorizontalAlignment(texto.CENTER);//Ponemos el texto en el centro
		texto.setBounds(200,100,190,20);
		boton.setBounds(200,160,190,20);
		//Lo añadimos al panel
		panel.add(lb);
		panel.add(texto);
		panel.add(boton);
	}
}
