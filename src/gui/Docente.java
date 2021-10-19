package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Docente extends JFrame {

	private JPanel contentPane;
	private JLabel lblApellidoPaterno;
	private JLabel lblApelldoMaterno;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblDni;
	private JLabel lblCelular;
	private JLabel lblEspecialidad;
	private JLabel lblFechaIngreso;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JComboBox comboBox;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scp;
	private JTextArea txtS;
	private JLabel lblNombres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Docente frame = new Docente();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Docente() {
		setTitle("Docente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 639, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblApellidoPaterno = new JLabel("Apellido paterno:");
		lblApellidoPaterno.setBounds(10, 53, 86, 14);
		contentPane.add(lblApellidoPaterno);
		
		lblApelldoMaterno = new JLabel("Apelldo materno:");
		lblApelldoMaterno.setBounds(10, 78, 86, 14);
		contentPane.add(lblApelldoMaterno);
		
		textField = new JTextField();
		textField.setBounds(146, 22, 177, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 50, 177, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 75, 177, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(10, 103, 46, 14);
		contentPane.add(lblDni);
		
		lblCelular = new JLabel("Celular:");
		lblCelular.setBounds(10, 128, 86, 14);
		contentPane.add(lblCelular);
		
		lblEspecialidad = new JLabel("Especialidad:");
		lblEspecialidad.setBounds(10, 153, 86, 14);
		contentPane.add(lblEspecialidad);
		
		lblFechaIngreso = new JLabel("Fecha ingreso:");
		lblFechaIngreso.setBounds(10, 178, 86, 14);
		contentPane.add(lblFechaIngreso);
		
		textField_3 = new JTextField();
		textField_3.setBounds(146, 100, 177, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(146, 125, 177, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(146, 175, 177, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.setBounds(146, 150, 177, 20);
		contentPane.add(comboBox);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(440, 32, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(440, 78, 89, 23);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(440, 124, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(440, 174, 89, 23);
		contentPane.add(btnEliminar);
		
		scp = new JScrollPane();
		scp.setBounds(10, 215, 603, 320);
		contentPane.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
		
		lblNombres = new JLabel("Nombres:");
		lblNombres.setBounds(10, 22, 46, 14);
		contentPane.add(lblNombres);
	}

}
