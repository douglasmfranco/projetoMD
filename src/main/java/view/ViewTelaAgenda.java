package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ViewTelaAgenda extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_Id;
	private JTextField txt_Nome;
	private JLabel label;
	private JLabel lblEndereo;
	private JTextField txt_Endereco;
	private JLabel lblBairro;
	private JTextField txt_Bairro;
	private JLabel lblTelefone;
	private JTextField txt_Telefone;
	private JLabel lblEmail;
	private JTextField txt_Email;
	private JButton btnAlterar;
	private JButton btnDeletar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaAgenda frame = new ViewTelaAgenda();
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
	public ViewTelaAgenda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				JOptionPane.showMessageDialog(null, "Id: " + txt_Id.getText()
						+ "\nNome: " + txt_Nome.getText()
						+ "\n Criado com Sucesso!");

			}
		});
		
		btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(205, 593, 89, 36);
		contentPane.add(btnAlterar);

		btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

			}
		});
		btnNewButton.setBounds(40, 595, 89, 34);
		contentPane.add(btnNewButton);

		txt_Id = new JTextField();
		txt_Id.setBounds(23, 56, 96, 23);
		contentPane.add(txt_Id);
		txt_Id.setColumns(10);

		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(23, 42, 69, 14);
		contentPane.add(lblNewLabel);

		txt_Nome = new JTextField();
		txt_Nome.setColumns(10);
		txt_Nome.setBounds(23, 194, 483, 23);
		contentPane.add(txt_Nome);

		label = new JLabel("Nome:");
		label.setBounds(23, 180, 46, 14);
		contentPane.add(label);

		lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(23, 243, 69, 14);
		contentPane.add(lblEndereo);

		txt_Endereco = new JTextField();
		txt_Endereco.setColumns(10);
		txt_Endereco.setBounds(23, 257, 483, 23);
		contentPane.add(txt_Endereco);

		lblBairro = new JLabel("Bairro:");
		lblBairro.setBounds(23, 315, 46, 14);
		contentPane.add(lblBairro);

		txt_Bairro = new JTextField();
		txt_Bairro.setColumns(10);
		txt_Bairro.setBounds(23, 329, 236, 23);
		contentPane.add(txt_Bairro);

		lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(283, 315, 81, 14);
		contentPane.add(lblTelefone);

		txt_Telefone = new JTextField();
		txt_Telefone.setColumns(10);
		txt_Telefone.setBounds(283, 329, 223, 23);
		contentPane.add(txt_Telefone);

		lblEmail = new JLabel("E-mail:");
		lblEmail.setBounds(23, 384, 96, 14);
		contentPane.add(lblEmail);

		txt_Email = new JTextField();
		txt_Email.setColumns(10);
		txt_Email.setBounds(23, 398, 483, 23);
		contentPane.add(txt_Email);

		
		btnDeletar.setBounds(368, 594, 89, 35);
		contentPane.add(btnDeletar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTelaPrincipal tela = new ViewTelaPrincipal();
				tela.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(40, 702, 89, 35);
		contentPane.add(btnVoltar);
	}
}
