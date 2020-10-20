package musical;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Interf_Musical extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField IdField;
	private JTextField NomeField;
	private JLabel lblNome_2;
	private JTextField InstrumentoField;
	private ArrayList<Musical> musicos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interf_Musical frame = new Interf_Musical();
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
	public Interf_Musical() {
		
		musicos = new ArrayList<Musical>();
		
		setFont(new Font("Arial", Font.BOLD, 14));
		setTitle("Cadastro de M\u00FAsicos - Igreja");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 456, 252);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(115, 11, 194, 30);
		contentPane.add(lblNewLabel);
		
		IdField = new JTextField();
		IdField.setToolTipText("0 - N");
		IdField.setBounds(115, 40, 194, 20);
		contentPane.add(IdField);
		IdField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Arial", Font.BOLD, 15));
		lblNome.setBounds(115, 61, 194, 30);
		contentPane.add(lblNome);
		
		NomeField = new JTextField();
		NomeField.setColumns(10);
		NomeField.setBounds(115, 90, 194, 20);
		contentPane.add(NomeField);
		
		lblNome_2 = new JLabel("Instrumento");
		lblNome_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNome_2.setBounds(115, 107, 194, 30);
		contentPane.add(lblNome_2);
		
		InstrumentoField = new JTextField();
		InstrumentoField.setColumns(10);
		InstrumentoField.setBounds(115, 135, 194, 20);
		contentPane.add(InstrumentoField);
		
		JButton BtnFechar = new JButton("Fechar");
		BtnFechar.setBounds(52, 176, 89, 23);
		contentPane.add(BtnFechar);
		
			//função para o botão fechar
		
			BtnFechar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				dispose();
					}
				});
		
		JButton BtnSalvar = new JButton("Salvar");
		BtnSalvar.setBounds(168, 176, 89, 23);
		contentPane.add(BtnSalvar);
		
		//função para botão salvar
		
		
		BtnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InserirMusico();
			}
		});
		
		JButton BtnBuscar = new JButton("Buscar");
		BtnBuscar.setBounds(278, 176, 89, 23);
		contentPane.add(BtnBuscar);
		
		//função para buscar músico
		
		BtnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BuscarMusico();
			}
		});
	}

		
	
	public void BuscarMusico() {
		Musical m = new Musical();
		for (int i = 0; i<musicos.size();i++) {
			
			m=(Musical)musicos.get(i);
			if(m.getId().equals(IdField.getText())) {
				
				NomeField.setText(m.getNome());
				InstrumentoField.setText(m.getInstrumento());
				break;
				
			}
			
		}
			
			
		}
	
	public void InserirMusico() {
		Musical m = new Musical(IdField.getText(),NomeField.getText());
		m.setId(IdField.getText());
		m.setNome(NomeField.getText());
		m.setInstrumento(InstrumentoField.getText());
		musicos.add(m);
		limparCampos();
		
		
	}
	
	public void limparCampos() {
		IdField.setText("");
		NomeField.setText("");
		InstrumentoField.setText("");
	}
}
