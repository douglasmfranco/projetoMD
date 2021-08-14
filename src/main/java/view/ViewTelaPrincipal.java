package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ViewTelaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaPrincipal frame = new ViewTelaPrincipal();
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
	public ViewTelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBackground(new Color(0, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Cadastrar Cliente");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewTelaCadastro tela = new ViewTelaCadastro();
				tela.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(425, 314, 134, 48);
		contentPane.add(btnNewButton);
		
		JButton btnAgenda = new JButton("Agenda");
		btnAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTelaAgenda tela = new ViewTelaAgenda();
				tela.setVisible(true);
				dispose();
			}
		});
		btnAgenda.setBounds(425, 391, 134, 48);
		contentPane.add(btnAgenda);
		
		JButton btnGerarRelatrio = new JButton("Gerar Relat\u00F3rio");
		btnGerarRelatrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTelaRelatorio tela = new ViewTelaRelatorio();
				tela.setVisible(true);
				dispose();
			}
		});
		btnGerarRelatrio.setBounds(425, 463, 134, 48);
		contentPane.add(btnGerarRelatrio);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnSair.setBounds(426, 651, 134, 48);
		contentPane.add(btnSair);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\DOUGLASMURILOFRANCO\\Desktop\\md logo.JPG"));
		lblNewLabel.setBounds(408, 155, 167, 111);
		contentPane.add(lblNewLabel);
	}
}
