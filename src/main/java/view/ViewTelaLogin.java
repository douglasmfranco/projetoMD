package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import conexao_banco_dados.ConexaoBD;

public class ViewTelaLogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_User;
	private JPasswordField txt_Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewTelaLogin frame = new ViewTelaLogin();
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
	public ViewTelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.setBounds(447, 490, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {

					Connection con = ConexaoBD.faz_conexao();

					String sql = "select *from dados_senhas where usuario=? and senha=?";

					PreparedStatement stmt = con.prepareStatement(sql);

					stmt.setString(1, txt_User.getText());

					stmt.setString(2, new String(txt_Password.getPassword()));

					ResultSet rs = stmt.executeQuery();

					if (rs.next()) {

						JOptionPane.showMessageDialog(null, "Usuario Logado"); 
						ViewTelaPrincipal tela = new ViewTelaPrincipal();
						tela.setVisible(true);
						dispose();

					} else {

						JOptionPane.showMessageDialog(null,
								"Login ou senha Invalidos");

					}

					stmt.close();

					con.close();

				} catch (SQLException e1) {

					// TODO Auto-generated catch block

					e1.printStackTrace();

				}
			}
		});

		txt_User = new JTextField();
		txt_User.setBounds(375, 344, 233, 20);
		txt_User.setColumns(10);

		txt_Password = new JPasswordField();
		txt_Password.setBounds(373, 405, 236, 20);

		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(375, 330, 46, 14);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 204, 204));

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(375, 391, 46, 14);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(lblSenha);
		contentPane.add(txt_User);
		contentPane.add(btnNewButton);
		contentPane.add(txt_Password);
	}
}
