import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaIMC {
	
	//Janela
	private JFrame janela;
	
	//Painéis
	private JPanel jpAlt;
	private JPanel jpPeso;
	private JPanel jpBotoes;
	private JPanel jpRes;
	
	//Rótulos
	private JLabel jlAlt;
	private JLabel jlPeso;
	private JLabel jlRes;
	private JLabel jlIMC;
	
	//Campos
	private JTextField txtAlt;
	private JTextField txtPeso;
	
	//Botoes
	private JButton btSair;
	private JButton btLimpar;
	private JButton btCalc;
	
	private IMC imc;
	
	public TelaIMC() {
		imc = new IMC();
	}
	
	//Instancias de componentes
	public void criaComponentes() {
		janela = new JFrame("Tela Calcula IMC");
		
		jpAlt = new JPanel();
		jpPeso = new JPanel();
		jpBotoes = new JPanel();
		jpRes = new JPanel();
		
		jlAlt = new JLabel("Digite sua altura");
		jlPeso = new JLabel("Digite seu peso");
		jlRes = new JLabel("Resultado: ");
		jlIMC = new JLabel();
		
		txtAlt = new JTextField(15);
		txtPeso = new JTextField(15);
		
		btCalc = new JButton("Calcula IMC");
		btLimpar = new JButton("Limpa Campos");
		btSair = new JButton("Sair"); 		
	}
	
	//Organiza Componentes
	public void preparaPaineis() {
		jpAlt.setLayout(new FlowLayout());
		jpAlt.add(jlAlt);
		jpAlt.add(txtAlt);
		
		jpPeso.setLayout(new FlowLayout());
		jpPeso.add(jlPeso);
		jpPeso.add(txtPeso);
		
		jpBotoes.setLayout(new FlowLayout());
		jpBotoes.add(btCalc);
		jpBotoes.add(btLimpar);
		jpBotoes.add(btSair);
		
		jpRes.setLayout(new FlowLayout());
		jpRes.add(jlRes);
		jpRes.add(jlIMC);
	}
	
	//Configura Janela
	public void preparaJanela() {
		
		janela.setLayout(new FlowLayout());
		
		janela.add(jpAlt);
		janela.add(jpPeso);
		janela.add(jpBotoes);
		janela.add(jpRes);
	
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setSize(400,200);
		janela.setVisible(true);
	}
	
	public void sair() {
		btSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	
	public void limparCampos() {
		btLimpar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtAlt.setText("");
				txtPeso.setText("");
				jlIMC.setText("");
				
			}
		});
	}
	
	public void calculaIMC() {
		btCalc.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				
				try{
					double alt = Double.parseDouble(txtAlt.getText());
					double peso = Double.parseDouble(txtPeso.getText());
					jlIMC.setText(imc.calcIMC(alt, peso));
					
				}catch (NumberFormatException e2) {
					JOptionPane.showMessageDialog(null, "Os campos só aceitam \n"
							+ "tipos numéricos");
				}
				
				
				
				
			}
		});
	}
	
	//Renderiza Janela
	public void renderizaJanela() {
		
		criaComponentes();
		preparaPaineis();
		preparaJanela();
		sair();
		limparCampos();
		calculaIMC();
	}
		
	
	

}
