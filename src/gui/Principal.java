package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.Insets;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMante;
	private JMenuItem mntmAlumno;
	private JMenuItem mntmCurso;
	private JMenuItem mntmDocente;
	private JMenu mnReg;
	private JMenuItem mntmMatrcula;
	private JMenuItem mntmRetiro;
	private JMenu mnConsulta;
	private JMenuItem mntmAlumnos;
	private JMenuItem mntmCursos;
	private JMenuItem mntmDocentes;
	private JMenuItem mntmMatrculas;
	private JMenuItem mntmRetiros;
	private JMenu mnReporte;
	private JMenuItem mntmAlMatPen;
	private JMenuItem mntmDocConCarga;
	private JMenuItem mntmAlMatPorCurso;
	private JMenuItem mntmAlRetir;
	private JMenuItem mntmAlMatVig;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.windowBorder);
		setJMenuBar(menuBar);
		
		mnMante = new JMenu("Mantenimiento");
		mnMante.setForeground(SystemColor.text);
		menuBar.add(mnMante);
		
		mntmAlumno = new JMenuItem("Alumno");
		mntmAlumno.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnMante.add(mntmAlumno);
		
		mntmCurso = new JMenuItem("Curso");
		mntmCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnMante.add(mntmCurso);
		
		mntmDocente = new JMenuItem("Docente");
		mntmDocente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnMante.add(mntmDocente);
		
		mnReg = new JMenu("Registro");
		mnReg.setForeground(SystemColor.text);
		menuBar.add(mnReg);
		
		mntmMatrcula = new JMenuItem("Matr\u00EDcula");
		mntmMatrcula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnReg.add(mntmMatrcula);
		
		mntmRetiro = new JMenuItem("Retiro");
		mntmRetiro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnReg.add(mntmRetiro);
		
		mnConsulta = new JMenu("Consulta");
		mnConsulta.setForeground(SystemColor.text);
		menuBar.add(mnConsulta);
		
		mntmAlumnos = new JMenuItem("Alumnos");
		mntmAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConsulta.add(mntmAlumnos);
		
		mntmCursos = new JMenuItem("Cursos");
		mntmCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConsulta.add(mntmCursos);
		
		mntmDocentes = new JMenuItem("Docentes");
		mntmDocentes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConsulta.add(mntmDocentes);
		
		mntmMatrculas = new JMenuItem("Matr\u00EDculas");
		mntmMatrculas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConsulta.add(mntmMatrculas);
		
		mntmRetiros = new JMenuItem("Retiros");
		mntmRetiros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnConsulta.add(mntmRetiros);
		
		mnReporte = new JMenu("Reporte");
		mnReporte.setForeground(SystemColor.text);
		menuBar.add(mnReporte);
		
		mntmAlMatPen = new JMenuItem("Alumnos con matr\u00EDcula pendiente");
		mntmAlMatPen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnReporte.add(mntmAlMatPen);
		
		mntmAlMatVig = new JMenuItem("Alumnos con matr\u00EDcula vigente");
		mntmAlMatVig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnReporte.add(mntmAlMatVig);
		
		mntmAlRetir = new JMenuItem("Alumnos retirados");
		mntmAlRetir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnReporte.add(mntmAlRetir);
		
		mntmAlMatPorCurso = new JMenuItem("Alumnos matriculados por curso");
		mntmAlMatPorCurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnReporte.add(mntmAlMatPorCurso);
		
		mntmDocConCarga = new JMenuItem("Docentes con carga horaria");
		mntmDocConCarga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnReporte.add(mntmDocConCarga);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
