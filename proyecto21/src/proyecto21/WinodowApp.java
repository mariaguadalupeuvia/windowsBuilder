package proyecto21;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class WinodowApp {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private ManejadorArchivos archs;
	

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					WinodowApp window = new WinodowApp();
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}


	/**
	 * @wbp.parser.entryPoint
	 */
	public void inicializar() {
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(183, 83, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(183, 114, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCampo1 = new JLabel("Campo 1");
		lblCampo1.setFont(new Font("SimSun", Font.PLAIN, 11));
		lblCampo1.setBounds(54, 86, 86, 14);
		frame.getContentPane().add(lblCampo1);
		
		JLabel lblNewLabel_1 = new JLabel("Campo 2");
		lblNewLabel_1.setBounds(54, 117, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				archs = new ManejadorArchivos();
				archs.escribirArchivo(textField.getText());
				archs.escribirArchivo(textField_1.getText());
			}
		});
		btnNewButton.setBounds(183, 186, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(54, 159, 119, 20);
		comboBox.addItem("manzana");
		comboBox.addItem("pera");
		comboBox.addItem("frutilla");
		comboBox.addItem("anana");
		comboBox.addItem("banana");
		comboBox.addItem("sandia");
		frame.getContentPane().add(comboBox);
		
		frame.setVisible(true);
	}
}
