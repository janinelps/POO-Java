
import java.awt.Color;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Janine
 */
public class Tela extends JFrame implements ActionListener, TextListener, KeyListener, WindowListener, ItemListener {

    private JPanel painel1 = null;
    private DefaultListModel lista = null;
    private JButton btnIncluir = null;
    private JButton btnRetirar = null;
    private JCheckBox jCheckBox2 = null;
    private JLabel lblNome = null;
    private JLabel lblMensagem = null;
    private JList jList1 = null;
    private JScrollPane jScrollPanel = null;
    private JTextField txtItem = null;
    private TextField txtTexto = null;
    private JLabel lblEmail = null;
    private JLabel lblSenha = null;
    private JTextField txtEmail = null;
    private JPasswordField pswSenha = null;
    private JComboBox jComboBoxEstado = null;
    private JComboBox jComboBoxCidade = null;
    private JLabel lblEstado = null;
    private JLabel lblCidade = null;
    private JRadioButton rdbFeminino = null;
    private JRadioButton rdbMasculino = null;
    private ButtonGroup tipoSexo = null;
    private JLabel lblValor = null;
    private JTextField txtValor = null;
    private int valor;
    private JLabel lblValidade = null;
    private JLabel lblRua = null;
    private JTextField txtRua = null;
    private JLabel lblBairro = null;
    private JTextField txtBairro = null;
    private Iterator i;
    
    public Tela() {

        super("CADASTRO DE CLIENTES");

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(500, 600);
        setLayout(null);

        lblNome = new JLabel("");
        lblNome.setText("NOME");
        lblNome.setBounds(40, 28, 120, 28);

        lblMensagem = new JLabel();
        lblMensagem.setFont(new java.awt.Font("Tahoma", 1, 10));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensagem.setText("Mensagem de Informações");
        lblMensagem.setBounds(220, 365, 300, 28);
               
        txtItem = new JTextField();
        txtItem.setBounds(40, 50, 200, 28);

        btnIncluir = new JButton();
        btnIncluir.setText("Incluir");
        btnIncluir.setBounds(295, 340, 80, 28);
        btnIncluir.addActionListener(this);

        btnRetirar = new JButton();
        btnRetirar.setText("Excluir");
        btnRetirar.setBounds(385, 340, 80, 28);
        btnRetirar.addActionListener(this);

        lista = new DefaultListModel();
        jList1 = new JList(lista);
        jScrollPanel = new JScrollPane(jList1);
        jScrollPanel.setBounds(300, 50, 150, 250);

        jCheckBox2 = new JCheckBox();
        
        lblEmail = new JLabel("EMAIL ");
        lblEmail.setBounds(40, 78, 120, 28);

        txtEmail = new JTextField(20);
        txtEmail.getText();
        txtEmail.setBounds(40, 100, 200, 28);
        
        lblValidade = new JLabel();
        lblValidade.setBounds(150, 78,120,28);

        lblSenha = new JLabel("SENHA ");
        lblSenha.setBounds(40, 128, 120, 28);

        pswSenha = new JPasswordField(10);
        pswSenha.setBounds(40, 150, 200, 28);

        painel1 = new JPanel();
        painel1.setLayout(new FlowLayout());
        painel1.setBackground(Color.white);
        painel1.add(new JLabel("SEXO"));
        painel1.setBounds(40,190,200,48);
        painel1.setBorder(BorderFactory.createEtchedBorder());
        
        rdbFeminino = new JRadioButton("Feminino");
        rdbFeminino.setBounds(45, 215, 80, 15);
        rdbFeminino.setBackground(Color.white);

        rdbMasculino = new JRadioButton("Masculino");
        rdbMasculino.setBounds(150, 215, 85, 15);
        rdbMasculino.setBackground(Color.white);

        tipoSexo = new ButtonGroup();
        tipoSexo.add(rdbFeminino);
        tipoSexo.add(rdbMasculino);    
        
        lblValor = new JLabel();
        lblValor.setText("Cadastrado");
        lblValor.setBounds(365, 300, 120, 28);

        valor = 0;
        txtValor = new JTextField();
        txtValor.setBounds(300, 302, 50, 20);
        
        lblRua = new JLabel();
        lblRua.setText("Endereço");
        lblRua.setBounds(40,238,120,28);
        txtRua = new JTextField();
        txtRua.setBounds(40,260,200,28);
        
        lblBairro = new JLabel();
        lblBairro.setText("Bairro");
        lblBairro.setBounds(40,288,120,28);
        txtBairro = new JTextField();
        txtBairro.setBounds(40, 310,200,28);
        
        lblEstado = new JLabel("Estado Brasileiro");
        lblEstado.setBounds(40, 378, 120, 28);

        jComboBoxEstado = new JComboBox();
        jComboBoxEstado.setBounds(40, 400, 120, 28);
        jComboBoxEstado.addItem("Acre");
        jComboBoxEstado.addItem("Alagoas");
        jComboBoxEstado.addItem("Amapá");
        jComboBoxEstado.addItem("Amazonas");
        jComboBoxEstado.addItem("Bahia");
        jComboBoxEstado.addItem("Ceará");
        jComboBoxEstado.addItem("Distrito Federal");        
        jComboBoxEstado.addItem("Espirito Santo");
        jComboBoxEstado.addItem("Goiás");
        jComboBoxEstado.addItem("Maranhão");
        jComboBoxEstado.addItem("Mato Grosso");
        jComboBoxEstado.addItem("Mato Grosso do Sul");
        jComboBoxEstado.addItem("Minas Gerais");
        jComboBoxEstado.addItem("Pará");
        jComboBoxEstado.addItem("Paraíba");
        jComboBoxEstado.addItem("Paraná");
        jComboBoxEstado.addItem("Pernambuco");
        jComboBoxEstado.addItem("Piauí");
        jComboBoxEstado.addItem("Rio de Janeiro");
        jComboBoxEstado.addItem("Rio Grande do Norte");
        jComboBoxEstado.addItem("Rio Grande do Sul");
        jComboBoxEstado.addItem("Rondonia");        
        jComboBoxEstado.addItem("Roraima");
        jComboBoxEstado.addItem("Santa Catarina");
        jComboBoxEstado.addItem("São Paulo");
        jComboBoxEstado.addItem("Sergipe");
        jComboBoxEstado.addItem("Tocantins");
        
        jComboBoxEstado.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                IncluirCidades(jComboBoxEstado.getSelectedItem().toString());
            }
       });
        
        lblCidade = new JLabel("Cidade");
        lblCidade.setBounds(170,378,120,28);
        
        jComboBoxCidade = new JComboBox();
        jComboBoxCidade.setBounds(170,400,120,28);
               
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter(){
            @Override
            public void focusLost(java.awt.event.FocusEvent evento ){
            verificaEmail(evento);
            }
       });
    
        add(lblValor);
        add(txtValor);
        add(lblEmail);
        add(txtEmail);
        add(lblSenha);
        add(pswSenha);
        add(txtItem);
        add(lblNome);
        add(lblMensagem);
        add(btnIncluir);
        add(btnRetirar);
        add(jScrollPanel);
        add(lblEstado);
        add(lblCidade);
        add(jComboBoxEstado);
        add(jComboBoxCidade);
        add(rdbFeminino);
        add(rdbMasculino);
        add(painel1);
        add(lblValidade);
        add(lblRua);
        add(txtRua);
        add(lblBairro);
        add(txtBairro);
        add(jCheckBox2);
        
        setLocationRelativeTo(this);
    }
    
    private void IncluirCidades(String estado){
        Map<String, ArrayList> Cidades = new HashMap<String, ArrayList>();
        ArrayList<String> cidadeMinas = new ArrayList<String>();

        cidadeMinas.add("Belo Horizonte");
        cidadeMinas.add("Araxá");
        cidadeMinas.add("Betim");
        cidadeMinas.add("Caeté");
        cidadeMinas.add("Divinopolis");
        cidadeMinas.add("Esmeraldas");
        cidadeMinas.add("Florestal");
        cidadeMinas.add("Governador Valadares");
        cidadeMinas.add("Heliodora");
        cidadeMinas.add("Itajubá");
        cidadeMinas.add("Juatuba"); 
        cidadeMinas.add("Lagoa Santa");
        cidadeMinas.add("Moeda");
        cidadeMinas.add("Nanuque");
        cidadeMinas.add("Ouro Preto");
        cidadeMinas.add("Para de Minas");
        cidadeMinas.add("Raposos");
        cidadeMinas.add("Santa Luzia");
        cidadeMinas.add("Teófilo Otoni");
        cidadeMinas.add("Ubá");
        cidadeMinas.add("Varginha");
        cidadeMinas.add("Wenceslau Braz");
        
        ArrayList<String> cidadeSaoPaulo = new ArrayList<String>();
        cidadeSaoPaulo.add("São Paulo");
        cidadeSaoPaulo.add("Guarulhos");
        cidadeSaoPaulo.add("Congonhas");
        cidadeSaoPaulo.add("Areias");
        cidadeSaoPaulo.add("Balbinos");
        cidadeSaoPaulo.add("Campinas");
        cidadeSaoPaulo.add("Dumont");
        cidadeSaoPaulo.add("Estrela do Norte");
        cidadeSaoPaulo.add("Flórida Paulista");
        cidadeSaoPaulo.add("Guararema");
        cidadeSaoPaulo.add("Hortolândia");
        cidadeSaoPaulo.add("Itararé");
        cidadeSaoPaulo.add("Juquitiba");
        cidadeSaoPaulo.add("Lagoinha");        
        cidadeSaoPaulo.add("Mogi Mirim");
        cidadeSaoPaulo.add("Novais");
        cidadeSaoPaulo.add("Osasco");
        cidadeSaoPaulo.add("Pereiras");
        cidadeSaoPaulo.add("Queiroz");
        cidadeSaoPaulo.add("Ribeirão Preto");
        cidadeSaoPaulo.add("Santos");
        cidadeSaoPaulo.add("Taubaté");
        cidadeSaoPaulo.add("Ubatuba");
        cidadeSaoPaulo.add("Valparaíso");
        cidadeSaoPaulo.add("Zacarias");
        
        
        
        Cidades.put("Minas Gerais", cidadeMinas);
        Cidades.put("São Paulo", cidadeSaoPaulo);
        
        jComboBoxCidade.removeAllItems();
        for(Map.Entry<String, ArrayList> cidade : Cidades.entrySet())
        {  if (cidade.getKey()==estado){
            ArrayList<String> item = cidade.getValue();
            jComboBoxCidade.setModel(new DefaultComboBoxModel<String>(item.toArray(new String[0])));
           }
        }
    }

    private void trataIncluir(ActionEvent evt) {
        txtEmail.getText();
        limpaCampos();
        
        if (txtItem.getText().equals("")) {
            lblMensagem.setForeground(Color.RED);
            lblMensagem.setText("Caixa Vazia");
        } else {
            lista.addElement(txtItem.getText());
            txtItem.setText("");
            lblMensagem.setText("");
            this.valor++;
            mostraValor(valor);
            lblValor.setText("Cadastrados");
        }
    }

    private void trataExcluir(ActionEvent evt) {
        if (jList1.getSelectedIndex() >= 0) {
            txtItem.setText((String) lista.remove(jList1.getSelectedIndex()));
            this.valor--;
            mostraValor(valor);
            lblValor.setText("Cadastrados");
        }
    }

    private void mostraValor(int va) {
        txtValor.setText(Integer.toString(va));
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnIncluir) {
            trataIncluir(evt);
        } else if (evt.getSource() == btnRetirar) {
            trataExcluir(evt);
        }
    }
    
    private void verificaEmail(java.awt.event.FocusEvent evt){
        String email = txtEmail.getText();
        Color c = new Color(0,255,0);
        if (validaEmail(email)){
            c = Color.GREEN;
            lblValidade.setText("Valido");
            btnIncluir.setEnabled(true);
            btnIncluir.requestFocus();
        } else {
            c = Color.RED;
            lblValidade.setText("Email Invalido");
            if (txtEmail.getText().equals("")){
                lblValidade.setText("");
            } else {
                lblEmail.requestFocus();
            }
        }
        lblValidade.setForeground(c);
    }
    
    private boolean validaEmail(String email){
        Pattern p = Pattern.compile("[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?");
        Matcher m = p.matcher(email);
        return (m.matches());
    }
    
    private void limpaCampos(){
        txtEmail.setText("");
        lblValidade.setText("");
        pswSenha.setText("");
        txtBairro.setText("");
        txtRua.setText("");
        tipoSexo.clearSelection();
        
        
        
        
    }
    
    private void trataLimpa(java.awt.event.ActionEvent evento){
         limpaCampos();
    }
    
    @Override
    public void textValueChanged(TextEvent te) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    private void trataEventoKey(KeyEvent ke) {
        String s = txtItem.getText();
        s.concat(Integer.toString(ke.getKeyChar()));
        lblMensagem.setText("Tecla ->" + Integer.toString(ke.getKeyChar()));
        if (ke.getKeyChar() == 10) {
            trataIncluir(null);
        }
    }

    private void trataFechamento() {
        JOptionPane.showMessageDialog(null, "Saindo", "CADASTRO CLIENTES", JOptionPane.DEFAULT_OPTION);
        System.exit(0);
    }

    private void trataAbertura() {
        JOptionPane.showConfirmDialog(null, "Iniciando", "CADASTRO CLIENTES", JOptionPane.DEFAULT_OPTION);
    }

    public void setMsg(String msg) {
        lblValor.setText(msg);
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        trataEventoKey(ke);
    }

    @Override
    public void windowIconified(WindowEvent minimiza) {
        JOptionPane.showMessageDialog(null, "Minimizar");
    }
    @Override
    public void windowDeiconified(WindowEvent maximiza) {
        JOptionPane.showMessageDialog(null, "Maximizar");
    }
    @Override
    public void windowActivated(WindowEvent evento) {
        setMsg("");
    }
    @Override
    public void windowDeactivated(WindowEvent evento) {
        setMsg("");
    }
    @Override
    public void windowOpened(WindowEvent evento) {
        trataAbertura();
    }
    @Override
    public void windowClosing(WindowEvent evento) {
        trataFechamento();
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
