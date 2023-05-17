package br.edu.unicid.view;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import br.edu.unicid.dao.AlunoDAO;
import br.edu.unicid.model.Aluno;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;

import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.table.DefaultTableModel;
import javax.swing.ListSelectionModel;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.UIManager;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JButton btnAtualizar;
	private JTabbedPane tabbedPane;
	private JPanel cadastro;
	private JLabel Rgm;
	private JTextField txtRgm;
	private JLabel Email;
	private JTextField txtEmail;
	private JLabel Endereco;
	private JTextField txtEndereco;
	private JLabel Idade;
	private JTextField txtIdade;
	private JLabel Nome;
	private JTextField txtNome;
	private JLabel Data;
	private JTextField txtData;
	private JPanel curso;
	private JTextField txtPortNot;
	private JTextField txtPortFal;
	private JTextField txtMatNot;
	private JTextField txtMatFal;
	private JTextField txtIngNot;
	private JTextField txtIngFal;
	private JTextField textFieldRgm;
	private JTextField textFieldNome;
	private JTextField textFieldCurso;
	private JLabel lblNewLabel_3;
	private JTextField textFieldPeriodo;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textFieldPortNot;
	private JTextField textFieldMatNot;
	private JTextField textFieldIngNot;
	private JTextField textFieldPortFal;
	private JTextField textFieldMatFal;
	private JTextField textFieldIngFal;
	private JTextField EspCurso;
	private JTextField EspPeri;


	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 419);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Salvar");
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem_1);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// salva aluno
				Aluno aluno = new Aluno();
				// popular o meu objeto
				aluno.setRgm(Integer.parseInt(txtRgm.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setEmail(txtEmail.getText());
				aluno.setData(txtData.getText());
				aluno.setEndereco(txtEndereco.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				aluno.setPortNot(Integer.parseInt(txtPortNot.getText()));
				aluno.setPortFal(Integer.parseInt(txtPortFal.getText()));
				aluno.setMatNot(Integer.parseInt(txtMatNot.getText()));
				aluno.setMatFal(Integer.parseInt(txtMatFal.getText()));
				aluno.setIngNot(Integer.parseInt(txtIngNot.getText()));
				aluno.setIngFal(Integer.parseInt(txtIngFal.getText()));
				aluno.setEspCurso(EspCurso.getText());
				aluno.setEspPeri(EspPeri.getText());
				
			
			
				
				
				
				// abrir o BD
				try {
					AlunoDAO dao = new AlunoDAO();
					// salvar
					dao.salvar(aluno);
					JOptionPane.showMessageDialog(null, "Salvo com Sucesso");				
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());

					
				}
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		mnNewMenu.add(separator_1);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Alterar");
		mnNewMenu.add(mntmNewMenuItem_4);
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// salva aluno
				Aluno aluno = new Aluno();
				// popular o meu objeto
				aluno.setRgm(Integer.parseInt(txtRgm.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setEmail(txtEmail.getText());
				aluno.setData(txtData.getText());
				aluno.setEndereco(txtEndereco.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				aluno.setPortNot(Integer.parseInt(txtPortNot.getText()));
				aluno.setPortFal(Integer.parseInt(txtPortFal.getText()));
				aluno.setMatNot(Integer.parseInt(txtMatNot.getText()));
				aluno.setMatFal(Integer.parseInt(txtMatFal.getText()));
				aluno.setIngNot(Integer.parseInt(txtIngNot.getText()));
				aluno.setIngFal(Integer.parseInt(txtIngFal.getText()));
				aluno.setEspCurso(EspCurso.getText());
				aluno.setEspPeri(EspPeri.getText());
				
				
				
				// abrir o BD
				try {
					AlunoDAO dao = new AlunoDAO();
					// salvar
					dao.atualizar(aluno);
					JOptionPane.showMessageDialog(null, "Alterado com Sucesso");				
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());

					
				}
			}
		});
		JSeparator separator_6 = new JSeparator();
		mnNewMenu.add(separator_6);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("Consultar");
		mnNewMenu.add(mntmNewMenuItem_9);
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Abrir banco de dados
                    AlunoDAO dao = new AlunoDAO();
                    // Criando a variavél RGM
                    int rgm = Integer.parseInt(txtRgm.getText());
                    // Consultar o aluno
                    Aluno aluno = dao.procurarAluno (rgm);
                    // populando os dados da tela
                    txtNome.setText(aluno.getNome());
                    txtEmail.setText(aluno.getEmail());
                    txtData.setText(aluno.getData());
                    txtIdade.setText(String.valueOf(aluno.getIdade()));
                    txtEndereco.setText(aluno.getEndereco());
                    txtPortNot.setText(String.valueOf(aluno.getPortNot()));
                    txtPortFal.setText(String.valueOf(aluno.getPortFal()));
                    txtMatNot.setText(String.valueOf(aluno.getMatNot()));
                    txtMatFal.setText(String.valueOf(aluno.getMatFal()));
                    txtIngNot.setText(String.valueOf(aluno.getIngNot()));
                    txtIngFal.setText(String.valueOf(aluno.getIngFal()));
                    EspCurso.setText(aluno.getEspCurso());
                    EspPeri.setText(aluno.getEspPeri());
             		
                } catch(Exception e1) {
                    JOptionPane.showMessageDialog(null, "Erro ao consultar");
                }
            }
        });
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("Excluir");
		mnNewMenu.add(mntmNewMenuItem_5);
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Exclui o aluno
                Aluno aluno = new Aluno();
                // Exclui o meu objeto
                aluno.setRgm(Integer.parseInt(txtRgm.getText()));
                // exclui o dado inserido o BD
                try {
                    AlunoDAO dao = new AlunoDAO();
                    // atualizar
                    dao.excluir(aluno);
                    JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
                } catch(Exception e1) {
                    JOptionPane.showMessageDialog(null, e1.getMessage());
                }



            }
        });
		
		JSeparator separator_2 = new JSeparator();
		mnNewMenu.add(separator_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.ALT_DOWN_MASK));
		mnNewMenu.add(mntmNewMenuItem);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Programa encerrado com sucesso.");
		        System.exit(0);
			}
		});
		
		JMenu mnNewMenu_2 = new JMenu("Ajuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Sobre");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Projeto Feito pelo grupo do Fundão");
			}
		});
		mnNewMenu_2.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 614, 418);
		contentPane.add(tabbedPane);
		
		cadastro = new JPanel();
		tabbedPane.addTab("Dados Cadastrais", null, cadastro, null);
		tabbedPane.setEnabledAt(0, true);
		cadastro.setLayout(null);
		
		Rgm = new JLabel("RGM : ");
		Rgm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Rgm.setBounds(8, 9, 74, 30);
		cadastro.add(Rgm);
		
		txtRgm = new JTextField();
		txtRgm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtRgm.setBounds(71, 12, 77, 24);
		txtRgm.setColumns(10);
		cadastro.add(txtRgm);
		
		
		
		Email = new JLabel("E-mail:");
		Email.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Email.setBounds(8, 51, 74, 30);
		cadastro.add(Email);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEmail.setBounds(71, 54, 512, 27);
		txtEmail.setColumns(10);
		cadastro.add(txtEmail);
		
		Endereco = new JLabel("Endereço: ");
		Endereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Endereco.setBounds(8, 81, 106, 30);
		cadastro.add(Endereco);
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtEndereco.setBounds(99, 84, 484, 27);
		txtEndereco.setColumns(10);
		cadastro.add(txtEndereco);
		
		Idade = new JLabel("Idade:");
		Idade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Idade.setBounds(8, 111, 74, 30);
		cadastro.add(Idade);
		
		txtIdade = new JTextField();
		txtIdade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtIdade.setBounds(81, 122, 57, 19);
		txtIdade.setColumns(10);
		cadastro.add(txtIdade);
		
		Nome = new JLabel("Nome:");
		Nome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Nome.setBounds(188, 11, 74, 26);
		cadastro.add(Nome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNome.setBounds(258, 18, 325, 21);
		txtNome.setColumns(10);
		cadastro.add(txtNome);
		
		Data = new JLabel("Data de Nascimento :");
		Data.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Data.setBounds(150, 124, 200, 17);
		cadastro.add(Data);
		
		txtData = new JTextField();
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtData.setBounds(353, 122, 230, 19);
		txtData.setColumns(10);
		cadastro.add(txtData);
		
		JButton btNovo = new JButton("Novo");
		btNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtRgm.setText(null);
				txtNome.setText(null);
				txtEmail.setText(null);
				txtData.setText(null);
				txtEndereco.setText(null);
				txtIdade.setText(null);
				txtPortNot.setText(null);
				txtMatNot.setText(null);
				txtIngNot.setText(null);
				txtPortFal.setText(null);
				txtMatFal.setText(null);
				txtIngFal.setText(null);
				EspCurso.setText(null);
				EspPeri.setText(null);
				
				
				

			}
		});
		btNovo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btNovo.setBounds(25, 188, 89, 23);
		cadastro.add(btNovo);
	
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// salva aluno
				Aluno aluno = new Aluno();
				// popular o meu objeto
				aluno.setRgm(Integer.parseInt(txtRgm.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setEmail(txtEmail.getText());
				aluno.setData(txtData.getText());
				aluno.setEndereco(txtEndereco.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				aluno.setPortNot(Integer.parseInt(txtPortNot.getText()));
				aluno.setPortFal(Integer.parseInt(txtPortFal.getText()));
				aluno.setMatNot(Integer.parseInt(txtMatNot.getText()));
				aluno.setMatFal(Integer.parseInt(txtMatFal.getText()));
				aluno.setIngNot(Integer.parseInt(txtIngNot.getText()));
				aluno.setIngFal(Integer.parseInt(txtIngFal.getText()));
				aluno.setEspCurso(EspCurso.getText());
				aluno.setEspPeri(EspPeri.getText());
				
				
				
			
			
				
				
				
				// abrir o BD
				try {
					AlunoDAO dao = new AlunoDAO();
					// salvar
					dao.salvar(aluno);
					JOptionPane.showMessageDialog(null, "Salvo com Sucesso");				
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());

					
				}
			}
		});
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnSalvar.setBounds(160, 188, 89, 23);
		cadastro.add(btnSalvar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// salva aluno
				Aluno aluno = new Aluno();
				// popular o meu objeto
				aluno.setRgm(Integer.parseInt(txtRgm.getText()));
				aluno.setNome(txtNome.getText());
				aluno.setEmail(txtEmail.getText());
				aluno.setData(txtData.getText());
				aluno.setEndereco(txtEndereco.getText());
				aluno.setIdade(Integer.parseInt(txtIdade.getText()));
				aluno.setPortNot(Integer.parseInt(txtPortNot.getText()));
				aluno.setPortFal(Integer.parseInt(txtPortFal.getText()));
				aluno.setMatNot(Integer.parseInt(txtMatNot.getText()));
				aluno.setMatFal(Integer.parseInt(txtMatFal.getText()));
				aluno.setIngNot(Integer.parseInt(txtIngNot.getText()));
				aluno.setIngFal(Integer.parseInt(txtIngFal.getText()));
				aluno.setEspCurso(EspCurso.getText());
				aluno.setEspPeri(EspPeri.getText());
				
				
				// abrir o BD
				try {
					AlunoDAO dao = new AlunoDAO();
					// salvar
					dao.atualizar(aluno);
					JOptionPane.showMessageDialog(null, "Alterado com Sucesso");				
				} catch(Exception e1) {
					JOptionPane.showMessageDialog(null, e1.getMessage());

					
				}
			}
		});
		btnAlterar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnAlterar.setBounds(310, 188, 106, 23);
		cadastro.add(btnAlterar);
	
		JButton btnExcluir = new JButton("Excluir");
		 btnExcluir.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                // Exclui o aluno
	                Aluno aluno = new Aluno();
	                // Exclui o meu objeto
	                aluno.setRgm(Integer.parseInt(txtRgm.getText()));
	                // exclui o dado inserido o BD
	                try {
	                    AlunoDAO dao = new AlunoDAO();
	                    // atualizar
	                    dao.excluir(aluno);
	                    JOptionPane.showMessageDialog(null, "Excluido com Sucesso");
	                } catch(Exception e1) {
	                    JOptionPane.showMessageDialog(null, e1.getMessage());
	                }



	            }
	        });
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnExcluir.setBounds(469, 188, 114, 23);
		cadastro.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		 btnConsultar.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    // Abrir banco de dados
	                    AlunoDAO dao = new AlunoDAO();
	                    // Criando a variavél RGM
	                    int rgm = Integer.parseInt(txtRgm.getText());
	                    // Consultar o aluno
	                    Aluno aluno = dao.procurarAluno (rgm);
	                    // populando os dados da tela
	                    txtNome.setText(aluno.getNome());
	                    txtEmail.setText(aluno.getEmail());
	                    txtData.setText(aluno.getData());
	                    txtIdade.setText(String.valueOf(aluno.getIdade()));
	                    txtEndereco.setText(aluno.getEndereco());
	                    txtPortNot.setText(String.valueOf(aluno.getPortNot()));
	                    txtPortFal.setText(String.valueOf(aluno.getPortFal()));
	                    txtMatNot.setText(String.valueOf(aluno.getMatNot()));
	                    txtMatFal.setText(String.valueOf(aluno.getMatFal()));
	                    txtIngNot.setText(String.valueOf(aluno.getIngNot()));
	                    txtIngFal.setText(String.valueOf(aluno.getIngFal()));
	                    EspCurso.setText(aluno.getEspCurso());
	                    EspPeri.setText(aluno.getEspPeri());
	                    
	             		
	                } catch(Exception e1) {
	                    JOptionPane.showMessageDialog(null, "Erro ao consultar");
	                }
	            }
	        });
		btnConsultar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConsultar.setBounds(203, 241, 168, 23);
		cadastro.add(btnConsultar);
		
		curso = new JPanel();
		tabbedPane.addTab("Curso", null, curso, null);
		curso.setLayout(null);
		
		JComboBox boxCurso = new JComboBox();
		boxCurso.setForeground(new Color(220, 220, 220));
		boxCurso.setFont(new Font("Tahoma", Font.PLAIN, 20));	
		boxCurso.setModel(new DefaultComboBoxModel(new String[] {"...", "1°E.M.", "2°E.M", "3°E.M"}));
		boxCurso.setBounds(10, 40, 156, 32);
		curso.add(boxCurso);
		
		
		
		JLabel Curso = new JLabel("Curso: ");
		Curso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Curso.setBounds(10, 15, 83, 25);
		curso.add(Curso);
		
		JLabel Periodo = new JLabel("Período: ");
		Periodo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Periodo.setBounds(10, 93, 83, 25);
		curso.add(Periodo);
		
		JComboBox comboBoxPeriodo = new JComboBox();
		comboBoxPeriodo.setForeground(new Color(220, 220, 220));
		comboBoxPeriodo.setModel(new DefaultComboBoxModel(new String[] {"...", "Matutino\t", "Noturno"}));
		comboBoxPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBoxPeriodo.setBounds(10, 122, 156, 32);
		curso.add(comboBoxPeriodo);
		
		EspCurso = new JTextField();
		EspCurso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EspCurso.setHorizontalAlignment(SwingConstants.CENTER);
		EspCurso.setEditable(false);
		EspCurso.setBounds(197, 40, 124, 32);
		curso.add(EspCurso);
		EspCurso.setColumns(10);
		
		EspPeri = new JTextField();
		EspPeri.setFont(new Font("Tahoma", Font.PLAIN, 20));
		EspPeri.setHorizontalAlignment(SwingConstants.CENTER);
		EspPeri.setEditable(false);
		EspPeri.setBounds(197, 122, 124, 32);
		curso.add(EspPeri);
		EspPeri.setColumns(10);
		
	
		JComboBox<String> comboBox2 = new JComboBox<String>();
		comboBox2.addItem("Opção 1");
		comboBox2.addItem("Opção 2");
		comboBox2.addItem("Opção 3");

		JTextField textField2 = new JTextField();

		// Adiciona um ActionListener ao JComboBox
		boxCurso.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obtém o valor selecionado do JComboBox
		        String valorSelecionado = (String) boxCurso.getSelectedItem();
		        // Define o valor selecionado no JTextField
		        EspCurso.setText(valorSelecionado);
		    }
		});
		
		JComboBox<String> comboBox3 = new JComboBox<String>();
		comboBox3.addItem("Opção 1");
		comboBox3.addItem("Opção 2");
		comboBox3.addItem("Opção 3");

		JTextField textField3 = new JTextField();

		// Adiciona um ActionListener ao JComboBox
		comboBoxPeriodo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obtém o valor selecionado do JComboBox
		        String valorSelecionado = (String) comboBoxPeriodo.getSelectedItem();
		        // Define o valor selecionado no JTextField
		        EspPeri.setText(valorSelecionado);
		    }
		});
		
		JPanel Notas = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, Notas, null);
		Notas.setLayout(null);
		
		JLabel lblPortugues = new JLabel("Potuguês");
		lblPortugues.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPortugues.setBounds(10, 37, 92, 25);
		Notas.add(lblPortugues);
		
		txtPortNot = new JTextField();
		txtPortNot.setHorizontalAlignment(SwingConstants.CENTER);
		txtPortNot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPortNot.setBounds(149, 43, 86, 20);
		Notas.add(txtPortNot);
		txtPortNot.setColumns(10);
		
		txtPortFal = new JTextField();
		txtPortFal.setHorizontalAlignment(SwingConstants.CENTER);
		txtPortFal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtPortFal.setBounds(273, 43, 86, 20);
		Notas.add(txtPortFal);
		txtPortFal.setColumns(10);
		
		txtMatNot = new JTextField();
		txtMatNot.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatNot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMatNot.setBounds(149, 79, 86, 20);
		Notas.add(txtMatNot);
		txtMatNot.setColumns(10);
		
		txtMatFal = new JTextField();
		txtMatFal.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatFal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtMatFal.setBounds(273, 79, 86, 20);
		Notas.add(txtMatFal);
		txtMatFal.setColumns(10);
		
		txtIngNot = new JTextField();
		txtIngNot.setHorizontalAlignment(SwingConstants.CENTER);
		txtIngNot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtIngNot.setBounds(149, 122, 86, 20);
		Notas.add(txtIngNot);
		txtIngNot.setColumns(10);
		
		txtIngFal = new JTextField();
		txtIngFal.setHorizontalAlignment(SwingConstants.CENTER);
		txtIngFal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtIngFal.setBounds(273, 122, 86, 20);
		Notas.add(txtIngFal);
		txtIngFal.setColumns(10);
		
		JLabel lblMatematica = new JLabel("Matemática");
		lblMatematica.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMatematica.setBounds(10, 82, 104, 17);
		Notas.add(lblMatematica);
		
		JLabel lblIngles = new JLabel("Inglês");
		lblIngles.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblIngles.setBounds(10, 125, 104, 25);
		Notas.add(lblIngles);
		
		JLabel lblNotas = new JLabel("Nota");
		lblNotas.setHorizontalAlignment(SwingConstants.CENTER);
		lblNotas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNotas.setBounds(149, 11, 86, 21);
		Notas.add(lblNotas);
		
		JLabel lblFaltas = new JLabel("Faltas");
		lblFaltas.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaltas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFaltas.setBounds(273, 11, 86, 21);
		Notas.add(lblFaltas);
		
		JPanel Boletim = new JPanel();
		tabbedPane.addTab("Boletim", null, Boletim, null);
		Boletim.setLayout(null);
		
		
		textFieldRgm = new JTextField();
		textFieldRgm.setForeground(new Color(0, 0, 0));
		textFieldRgm.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldRgm.setEditable(false);
		textFieldRgm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldRgm.setBounds(83, 11, 86, 28);
		Boletim.add(textFieldRgm);
		textFieldRgm.setColumns(10);
		txtRgm.addKeyListener(new KeyAdapter() {
		      public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        textFieldRgm.setText(text);
		      }

		      public void keyTyped(KeyEvent e) {
		      }

		      public void keyPressed(KeyEvent e) {
		      }
		    });

		JLabel lblNewLabel = new JLabel("Rgm:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 14, 63, 25);
		Boletim.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(191, 11, 71, 28);
		Boletim.add(lblNewLabel_1);
		
		textFieldNome = new JTextField();
		textFieldNome.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldNome.setEditable(false);
		textFieldNome.setBounds(260, 11, 299, 28);
		Boletim.add(textFieldNome);
		textFieldNome.setColumns(10);
		txtNome.addKeyListener(new KeyAdapter() {
		      public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        textFieldNome.setText(text);
		      }

		      public void keyTyped(KeyEvent e) {
		      }

		      public void keyPressed(KeyEvent e) {
		      }
		    });
		
		JLabel lblNewLabel_2 = new JLabel("Curso:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(10, 64, 71, 25);
		Boletim.add(lblNewLabel_2);
		
		textFieldCurso = new JTextField();
		textFieldCurso.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCurso.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldCurso.setEditable(false);
		textFieldCurso.setBounds(83, 70, 109, 25);
		Boletim.add(textFieldCurso);
		textFieldCurso.setColumns(10);
		textFieldNome.setColumns(10);
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Opção 1");
		comboBox.addItem("Opção 2");
		comboBox.addItem("Opção 3");

		JTextField textField = new JTextField();

		// Adiciona um ActionListener ao JComboBox
		boxCurso.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obtém o valor selecionado do JComboBox
		        String valorSelecionado = (String) boxCurso.getSelectedItem();
		        // Define o valor selecionado no JTextField
		        textFieldCurso.setText(valorSelecionado);
		    }
		});

		
		
		lblNewLabel_3 = new JLabel("Periodo:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(202, 64, 94, 25);
		Boletim.add(lblNewLabel_3);
		
		textFieldPeriodo = new JTextField();
		textFieldPeriodo.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPeriodo.setEditable(false);
		textFieldPeriodo.setColumns(10);
		textFieldPeriodo.setBounds(287, 68, 245, 25);
		Boletim.add(textFieldPeriodo);
		JComboBox<String> comboBox1 = new JComboBox<String>();
		comboBox1.addItem("Opção 1");
		comboBox1.addItem("Opção 2");
		comboBox1.addItem("Opção 3");

		JTextField textField1 = new JTextField();

		// Adiciona um ActionListener ao JComboBox
		comboBoxPeriodo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Obtém o valor selecionado do JComboBox
		        String valorSelecionado = (String) comboBoxPeriodo.getSelectedItem();
		        // Define o valor selecionado no JTextField
		        textFieldPeriodo.setText(valorSelecionado);
		    }
		});
		
		lblNewLabel_4 = new JLabel("Português");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(10, 167, 109, 28);
		Boletim.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Disciplinas");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(10, 128, 100, 28);
		Boletim.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Matemática");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(10, 194, 109, 28);
		Boletim.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Inglês");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(10, 220, 100, 28);
		Boletim.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Notas");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(175, 128, 71, 28);
		Boletim.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Faltas");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_9.setBounds(305, 128, 71, 28);
		Boletim.add(lblNewLabel_9);
		
		textFieldPortNot = new JTextField();
		textFieldPortNot.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPortNot.setEditable(false);
		textFieldPortNot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPortNot.setBounds(175, 175, 61, 20);
		Boletim.add(textFieldPortNot);
		textFieldPortNot.setColumns(10);
		txtPortNot.addKeyListener(new KeyAdapter() {
		      public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        textFieldPortNot.setText(text);
		      }

		      public void keyTyped(KeyEvent e) {
		      }

		      public void keyPressed(KeyEvent e) {
		      }
		    });
		
		textFieldMatNot = new JTextField();
		textFieldMatNot.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMatNot.setEditable(false);
		textFieldMatNot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldMatNot.setColumns(10);
		textFieldMatNot.setBounds(175, 202, 61, 20);
		Boletim.add(textFieldMatNot);
		txtMatNot.addKeyListener(new KeyAdapter() {
		      public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        textFieldMatNot.setText(text);
		      }

		      public void keyTyped(KeyEvent e) {
		      }

		      public void keyPressed(KeyEvent e) {
		      }
		    });
		
		textFieldIngNot = new JTextField();
		textFieldIngNot.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIngNot.setEditable(false);
		textFieldIngNot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldIngNot.setColumns(10);
		textFieldIngNot.setBounds(175, 228, 61, 20);
		Boletim.add(textFieldIngNot);
		txtIngNot.addKeyListener(new KeyAdapter() {
		      public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        textFieldIngNot.setText(text);
		      }

		      public void keyTyped(KeyEvent e) {
		      }

		      public void keyPressed(KeyEvent e) {
		      }
		    });
		
		textFieldPortFal = new JTextField();
		textFieldPortFal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPortFal.setEditable(false);
		textFieldPortFal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldPortFal.setColumns(10);
		textFieldPortFal.setBounds(299, 175, 61, 20);
		Boletim.add(textFieldPortFal);
		txtPortFal.addKeyListener(new KeyAdapter() {
		      public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        textFieldPortFal.setText(text);
		      }

		      public void keyTyped(KeyEvent e) {
		      }

		      public void keyPressed(KeyEvent e) {
		      }
		    });
		
		textFieldMatFal = new JTextField();
		textFieldMatFal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMatFal.setEditable(false);
		textFieldMatFal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldMatFal.setColumns(10);
		textFieldMatFal.setBounds(299, 202, 61, 20);
		Boletim.add(textFieldMatFal);
		txtMatFal.addKeyListener(new KeyAdapter() {
		      public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        textFieldMatFal.setText(text);
		      }

		      public void keyTyped(KeyEvent e) {
		      }

		      public void keyPressed(KeyEvent e) {
		      }
		    });
		
		textFieldIngFal = new JTextField();
		textFieldIngFal.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldIngFal.setEditable(false);
		textFieldIngFal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textFieldIngFal.setColumns(10);
		textFieldIngFal.setBounds(299, 228, 61, 20);
		Boletim.add(textFieldIngFal);
		
		JButton AtualizarB = new JButton("AtualizarB");
		AtualizarB.setBounds(447, 148, 89, 23);
		Boletim.add(AtualizarB);
		txtIngFal.addKeyListener(new KeyAdapter() {
		      public void keyReleased(KeyEvent e) {
		        JTextField textField = (JTextField) e.getSource();
		        String text = textField.getText();
		        textFieldIngFal.setText(text);
		      }

		      public void keyTyped(KeyEvent e) {
		      }

		      public void keyPressed(KeyEvent e) {
		      }
		    });
		
	
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
	
	
