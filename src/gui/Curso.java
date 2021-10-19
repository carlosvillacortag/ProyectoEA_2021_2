package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Curso extends JFrame {

	private JPanel contentPane;
	private JMenu mnConsultar;
	private JMenu mnModificar;
	private JMenu mnEliminar;
	private JButton btnAdicionar;
	private JTextField txtNombres;
	private JLabel lblApellidos;
	private JLabel lblNombres;
	private JLabel lblDni;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JTextField txtDNI;
	private JScrollPane scp;
	private JTextArea txtS;
	private JMenuBar menuBar;
	private JLabel lblApellidoMaterno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Alumno frame = new Alumno();
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
	public Curso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 491);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
		
		mnEliminar = new JMenu("Eliminar");
		menuBar.add(mnEliminar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
			
		});
		btnAdicionar.setBounds(178, 131, 89, 23);
		contentPane.add(btnAdicionar);
		
		lblNombres = new JLabel("Codigo :");
		lblNombres.setBounds(10, 22, 65, 14);
		contentPane.add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(73, 22, 122, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		lblApellidos = new JLabel("Asignatura :");
		lblApellidos.setBounds(10, 90, 89, 14);
		contentPane.add(lblApellidos);
		
		lblApellidoMaterno = new JLabel("Ciclo :");
		lblApellidoMaterno.setBounds(10, 56, 46, 14);
		contentPane.add(lblApellidoMaterno);
		
		lblDni = new JLabel("Nro de creditos :");
		lblDni.setBounds(252, 25, 89, 14);
		contentPane.add(lblDni);
		
		lblEdad = new JLabel("Cant Horas :");
		lblEdad.setBounds(272, 56, 65, 14);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(338, 55, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(338, 22, 86, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		scp = new JScrollPane();
		scp.setBounds(10, 165, 414, 255);
		contentPane.add(scp);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(73, 87, 122, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(73, 53, 122, 20);
		contentPane.add(comboBox_1);
		
		txtS = new JTextArea();
		txtS.setBounds(12, 165, 412, 255);
		contentPane.add(txtS);
	}
}
