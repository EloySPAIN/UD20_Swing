package Ej3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio3() 
	{
		setTitle("Mini Entrevista");
		setBounds(400, 200, 500, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		JLabel etiqueta = new JLabel("Sistema Operativo");
		etiqueta.setBounds(80, 21, 150, 23);
		contentPane.add(etiqueta);
		
		JLabel etiqueta2 = new JLabel("Elige tu especialidad");
		etiqueta2.setBounds(245, 21, 150, 23);
		contentPane.add(etiqueta2);
		
		//Creamos los radiobuttons de los SO
		JRadioButton radio1 = new JRadioButton("Windows", false);
		radio1.setBounds(90, 51, 109, 23);
		contentPane.add(radio1);
		
		JRadioButton radio2 = new JRadioButton("Linux", false);
		radio2.setBounds(90, 77, 109, 23);
		contentPane.add(radio2);
		
		JRadioButton radio3 = new JRadioButton("Mac", false);
		radio3.setBounds(90, 103, 109, 23);
		contentPane.add(radio3);
		
		ButtonGroup buttongroup = new ButtonGroup();
		buttongroup.add(radio1);
		buttongroup.add(radio2);
		buttongroup.add(radio3);
			
		//Creamos las cajas de lo que se quiere dedicar	
		JCheckBox caja1 = new JCheckBox("Programación", false);
		caja1.setBounds(245, 55, 130, 20);
		contentPane.add(caja1);
		JCheckBox caja2 = new JCheckBox("Diseño gráfico", false);
		caja2.setBounds(245, 80, 130, 20);
		contentPane.add(caja2);
		JCheckBox caja3 = new JCheckBox("Administración", false);
		caja3.setBounds(245, 105, 130, 20);
		contentPane.add(caja3);
		
		
		JLabel etiqueta3 = new JLabel("Horas dedicadas en el ordenador");
		etiqueta3.setBounds(140, 163, 190, 23);
		contentPane.add(etiqueta3);
		
		
		
		//Creamos el slider
		
		JSlider slider = new JSlider(0, 10);
		slider.setValue(0);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setMajorTickSpacing(1);
		slider.setBounds(140, 197, 190, 38);
		contentPane.add(slider);
		
		JButton boton = new JButton("Aceptar");
		boton.setBounds(150, 253, 170, 20);
		contentPane.add(boton);
		
		
		boton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String texto = "";
				texto += "Sistema Operativo: "+"\n "+"\t- " + (radio1.isSelected() ? radio1.getText() 
						: radio2.isSelected() ? radio2.getText() 
						: radio3.getText()) + "\n";
				
				if(caja1.isSelected() || caja2.isSelected() || caja3.isSelected())
				{
					texto += "Especialidades: \n" + (caja1.isSelected() ? "\t- " + caja1.getText() + "\n" : "")
							+ (caja2.isSelected() ? "\t- " + caja2.getText() + "\n" : "")
							+ (caja3.isSelected() ? "\t- " + caja3.getText() + "\n" : "");
				}
				texto += "Horas dedicadas en el ordenador: "+ "\n"+"\t- "+ + slider.getValue()+" horas";
				JOptionPane.showMessageDialog(boton, texto);
			}
		});

		
		
		
		
		
		
	
	}

}