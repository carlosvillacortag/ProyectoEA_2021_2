package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.ClaseAlumno;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Alumno extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnAdicionar;
	private JTextField txtNombres;
	private JTextField txtApellidoPaterno;
	private JLabel lblApellidos;
	private JLabel lblNombres;
	private JTextField txtApellidoMaterno;
	private JLabel lblDni;
	private JLabel lblEdad;
	private JLabel lblCelular;
	private JTextField txtCelular;
	private JTextField txtEdad;
	private JTextField txtDNI;
	private JScrollPane scp;
	private JTextArea txtS;
	private JLabel lblApellidoMaterno;
	private JButton btnConsultar;
	private JButton btnEliminar;
	private JButton btnModificar;

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
	public Alumno() {
		setTitle("Alumno");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				btnAdicionar.setEnabled(false);
				btnConsultar.setEnabled(true);
				
				txtNombres.requestFocus();
				
				
			}
			void mostrarAlumno
			(int codAlumno, String nombres, String apePaterno, String apeMaterno, String telefono, String dni)
			{
				plasmar(" Código Alumno\t: " + codAlumno);
				plasmar(" Nombres\t: " + nombres );
				plasmar(" Apellido Paterno \t: " + apePaterno );
				plasmar(" Apellido Materno \t: " + apeMaterno );
				plasmar(" Apellido Materno  \t: " + telefono );
				plasmar(" DNI  \t: " + dni + "\n" );
			}
			
			
			void plasmar(String cadena) {
				txtS.append( cadena + "\n");
			}
			
			
			
			
		});
		btnAdicionar.setBounds(321, 11, 89, 23);
		contentPane.add(btnAdicionar);
		
		lblNombres = new JLabel("Nombres :");
		lblNombres.setBounds(10, 34, 65, 14);
		contentPane.add(lblNombres);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(73, 31, 206, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidoPaterno = new JTextField();
		txtApellidoPaterno.setBounds(109, 62, 170, 20);
		contentPane.add(txtApellidoPaterno);
		txtApellidoPaterno.setColumns(10);
		
		lblApellidos = new JLabel("Apellido paterno :");
		lblApellidos.setBounds(10, 62, 89, 14);
		contentPane.add(lblApellidos);
		
		lblApellidoMaterno = new JLabel("Apellido materno :");
		lblApellidoMaterno.setBounds(10, 96, 89, 14);
		contentPane.add(lblApellidoMaterno);
		
		txtApellidoMaterno = new JTextField();
		txtApellidoMaterno.setBounds(109, 93, 170, 20);
		contentPane.add(txtApellidoMaterno);
		txtApellidoMaterno.setColumns(10);
		
		lblDni = new JLabel("DNI");
		lblDni.setBounds(45, 136, 37, 14);
		contentPane.add(lblDni);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(179, 136, 46, 14);
		contentPane.add(lblEdad);
		
		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(335, 136, 46, 14);
		contentPane.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setBounds(287, 150, 137, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(147, 150, 86, 20);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		txtDNI = new JTextField();
		txtDNI.setBounds(10, 150, 86, 20);
		contentPane.add(txtDNI);
		txtDNI.setColumns(10);
		
		scp = new JScrollPane();
		scp.setBounds(10, 193, 414, 227);
		contentPane.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(321, 37, 89, 23);
		contentPane.add(btnConsultar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(321, 92, 89, 23);
		contentPane.add(btnEliminar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(321, 64, 89, 23);
		contentPane.add(btnModificar);
	}
	
//  Declaración global
	ClaseAlumno al = new ClaseAlumno();
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar_1(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnModificar_1(ActionEvent arg0) {
	}
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
	}
}
