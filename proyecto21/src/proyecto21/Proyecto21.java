package proyecto21;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Proyecto21 {

	public static void main(String[] args) 
	{
		Arrays arrays =new Arrays();
		
		int[] vec = {10, 5 , 3, 19 , 0, 7 , 5};
		System.out.println("muestro el vector inicial");
		arrays.mostrarArray(vec, 7);
		arrays.ordenar(vec);
		System.out.println("muestro el vector ordenado");
		arrays.mostrarArray(vec, 7);
		System.out.println("");
		
		int pos = arrays.buscar(vec, 7, 5);
		
		if(pos == -1)
		{
			System.out.println("No se encontro el valor buscado");
		}
		else
		{
			System.out.println("El valor buscado esta en la posion " + pos);
		}
		
		arrays.insertarOrdenado(vec, 7, 15);
		
		arrays.mostrarArray(vec, 7);
		System.out.println("");
		
		arrays.eliminar(vec, 7, 2);
		
		arrays.mostrarArray(vec, 7);
		System.out.println("");
//		WinodowApp ventana = new WinodowApp();
//		ventana.inicializar();
		
		//ManejadorArchivos archs = new ManejadorArchivos();
//		archs.escribirArchivo(" nueva linea");
//		archs.escribirArchivo(" otra mas----");
//		archs.escribirArchivo(" pppppppppppppppppppp");
		//archs.leerArchivo("archivoDePrueba.txt");
	}
	
	public void algo()
	{
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();//es la ventana
		
		frame.setSize(300, 310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		frame.setTitle("Calculadora de binario");
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Ingrese dos numeros en binario");
		lblTitulo.setBounds(20,20,200,25);
		panel.add(lblTitulo);
		
		JLabel lblNumA = new JLabel("Numero A");
		lblNumA.setBounds(20,60, 80,25);
		panel.add(lblNumA);
		
		JLabel lblNumB = new JLabel("Numero B");
		lblNumB.setBounds(20,100, 80,25);
		panel.add(lblNumB);
		
		JTextField numA = new JTextField(20);
		numA.setBounds(90, 60, 165,25);
		panel.add(numA);
		
		JTextField numB = new JTextField(20);
		numB.setBounds(90, 100, 165,25);
		panel.add(numB);
		
		JTextField resultado = new JTextField(20);
		resultado.setBounds(90, 180, 165,25);
		resultado.setBackground(panel.getBackground());
		resultado.setEditable(false);
		panel.add(resultado);
		
		JButton boton = new JButton("Limpiar");
		boton.setBounds(90, 220, 80, 25);
		panel.add(boton);
		boton.addActionListener(e ->
		{
			resultado.setText("");
			numA.setText("");
			numB.setText("");
		});
		
		JButton btnSuma = new JButton("+");
		btnSuma.setBounds(90, 140, 80, 25);
		panel.add(btnSuma);
		btnSuma.addActionListener(e ->
		{
			resultado.setText("");
			try
			{
				resultado.setText(sumar(numA.getText(), numB.getText()));
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog( panel, "Ocurrio un error en: " + ex.getMessage());
			}
		});
		
		JButton btnResta = new JButton("-");
		btnResta.setBounds(180, 140, 80, 25);
		panel.add(btnResta);
		btnResta.addActionListener(e ->
		{
			resultado.setText("");
			try
			{
				resultado.setText(restar(numA.getText(), numB.getText()));
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog( panel, "Ocurrio un error en: " + ex.getMessage());
			}
		});
		
		frame.setVisible(true);
	}

	private static String sumar(String n1, String n2)
	{
		int a = Integer.parseInt(n1,2);
		int b = Integer.parseInt(n2,2);
		System.out.println("a: " + a + ", b: " + b);
		int c = a + b;
		return Integer.toString(c, 2);
	}
	
	private static String restar(String n1, String n2)
	{
		int a = Integer.parseInt(n1,2);
		int b = Integer.parseInt(n2,2);
		int c = a - b;
		return Integer.toString(c, 2);
	}
	
	private void uno() {

		Scanner sc = new Scanner(System.in);
		int numeroDecimal;
		do {
			System.out.print("ingrese un número entre 1 y 3999: ");
			numeroDecimal = sc.nextInt();
		} while (numeroDecimal < 1 || numeroDecimal > 3999);
		System.out.println(" El numero romano es: " + convertirARomano(numeroDecimal));
	}

	public static String convertirARomano(int numero) {
		int i;
		int miles;
		int centenas;
		int decenas;
		int unidades;

		String romano = "";

		// obtenemos cada cifra del número
		miles = numero / 1000;
		centenas = numero / 100 % 10;
		decenas = numero / 10 % 10;
		unidades = numero % 10;

		// millar
		for (i = 1; i <= miles; i++) {
			romano = romano + "M";
		}
		int c = 1;
		switch (c) {
		case 1:
		case 2:
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
		case 7:
		case 8:
			break;
		case 9:
			break;
		}

		// centenas
		if (centenas == 9) {
			romano = romano + "CM";
		} else if (centenas >= 5) {
			romano = romano + "D";
			for (i = 6; i <= centenas; i++) {
				romano = romano + "C";
			}
		} else if (centenas == 4) {
			romano = romano + "CD";
		} else {
			for (i = 1; i <= centenas; i++) {
				romano = romano + "C";
			}
		}

		// decenas
		if (decenas == 9) {
			romano = romano + "XC";
		} else if (decenas >= 5) {
			romano = romano + "L";
			for (i = 6; i <= decenas; i++) {
				romano = romano + "X";
			}
		} else if (decenas == 4) {
			romano = romano + "XL";
		} else {
			for (i = 1; i <= decenas; i++) {
				romano = romano + "X";
			}
		}

		// unidades
		if (unidades == 9) {
			romano = romano + "IX";
		} else if (unidades >= 5) {
			romano = romano + "V";
			for (i = 6; i <= unidades; i++) {
				romano = romano + "I";
			}
		} else if (unidades == 4) {
			romano = romano + "IV";
		} else {
			for (i = 1; i <= unidades; i++) {
				romano = romano + "I";
			}
		}
		return romano;
	}
}
