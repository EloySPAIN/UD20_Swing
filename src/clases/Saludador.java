package clases;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Saludador extends JFrame{
	private JPanel panel;
	
	public Saludador() {
		setTitle("Saludador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
        panel.setSize(300, 300); 
        setVisible(true);
	}
}
