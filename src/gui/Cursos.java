package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cursos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblCodigo;
	private JLabel lblAsignatura;
	private JLabel lblCiclo;
	private JLabel lblCreditos;
	private JLabel lblHoras;
	private JTextField txtCodigo;
	private JTextField txtCreditos;
	private JTextField txtHoras;
	private JComboBox cboAsignatura;
	private JComboBox cboCiclo;
	private JButton btnAdicionar;
	private JButton btnConsultar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JScrollPane scp;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cursos frame = new Cursos();
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
	public Cursos() {
		setTitle("Cursos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 492, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCodigo = new JLabel("C\u00F3digo:");
		lblCodigo.setBounds(10, 13, 46, 14);
		contentPane.add(lblCodigo);
		
		lblAsignatura = new JLabel("Asignatura:");
		lblAsignatura.setBounds(10, 38, 78, 14);
		contentPane.add(lblAsignatura);
		
		lblCiclo = new JLabel("Ciclo:");
		lblCiclo.setBounds(10, 63, 46, 14);
		contentPane.add(lblCiclo);
		
		lblCreditos = new JLabel("N\u00B0Cr\u00E9ditos");
		lblCreditos.setBounds(10, 88, 78, 14);
		contentPane.add(lblCreditos);
		
		lblHoras = new JLabel("Cant Horas:");
		lblHoras.setBounds(10, 113, 78, 14);
		contentPane.add(lblHoras);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(110, 10, 109, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtCreditos = new JTextField();
		txtCreditos.setBounds(110, 85, 109, 20);
		contentPane.add(txtCreditos);
		txtCreditos.setColumns(10);
		
		txtHoras = new JTextField();
		txtHoras.setBounds(110, 110, 109, 20);
		contentPane.add(txtHoras);
		txtHoras.setColumns(10);
		
		cboAsignatura = new JComboBox();
		cboAsignatura.setBounds(110, 35, 109, 20);
		contentPane.add(cboAsignatura);
		
		cboCiclo = new JComboBox();
		cboCiclo.setBounds(110, 60, 109, 20);
		contentPane.add(cboCiclo);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(351, 32, 89, 23);
		contentPane.add(btnAdicionar);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(this);
		btnConsultar.setBounds(351, 57, 89, 23);
		contentPane.add(btnConsultar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(this);
		btnModificar.setBounds(351, 82, 89, 23);
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(this);
		btnEliminar.setBounds(351, 107, 89, 23);
		contentPane.add(btnEliminar);
		
		scp = new JScrollPane();
		scp.setBounds(10, 153, 456, 245);
		contentPane.add(scp);
		
		txtS = new JTextArea();
		scp.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(arg0);
		}
		if (arg0.getSource() == btnModificar) {
			actionPerformedBtnModificar(arg0);
		}
		if (arg0.getSource() == btnConsultar) {
			actionPerformedBtnConsultar(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
	}
	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnConsultar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnModificar(ActionEvent arg0) {
	}
	protected void actionPerformedBtnEliminar(ActionEvent arg0) {
	}
}
