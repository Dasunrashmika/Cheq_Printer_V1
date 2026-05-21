

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ChequeProUI extends JFrame {

    private JTextField txtDate, txtChqNo, txtAmountLKR, txtAmountInWords;
    private JComboBox<String> comboPayee, comboTemplate;
    private JCheckBox chkACPayee;
    private JLabel lblTotalPrinted;
    private JPanel previewArea;

    public ChequeProUI() {
        setTitle("Cheque Printing System");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("Bank Templates"));
        menuBar.add(new JMenu("Reports"));
        menuBar.add(new JMenu("Help"));
        setJMenuBar(menuBar);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(new Color(240, 240, 240));

        JButton btnNewCheque = new JButton("+ NEW CHEQUE");
        btnNewCheque.setBounds(20, 20, 150, 35);
        btnNewCheque.setBackground(new Color(128, 128, 128));
        mainPanel.add(btnNewCheque);

        lblTotalPrinted = new JLabel("TOTAL PRINTED : 50");
        lblTotalPrinted.setBounds(190, 20, 200, 35);
        lblTotalPrinted.setFont(new Font("Tahoma", Font.BOLD, 14));
        mainPanel.add(lblTotalPrinted);

        // Form Fields
        addLabel(mainPanel, "Date :", 50, 80);
        txtDate = new JTextField();
        txtDate.setBounds(160, 80, 200, 30);
        mainPanel.add(txtDate);

        addLabel(mainPanel, "Chq No :", 400, 80);
        txtChqNo = new JTextField();
        txtChqNo.setBounds(520, 80, 200, 30);
        mainPanel.add(txtChqNo);

        addLabel(mainPanel, "Payee Name :", 50, 130);
        String[] payees = {"Item 1", "Item 2"};
        comboPayee = new JComboBox<>(payees);
        comboPayee.setBounds(160, 130, 215, 30);
        mainPanel.add(comboPayee);

        addLabel(mainPanel, "Amount LKR :", 400, 130);
        txtAmountLKR = new JTextField();
        txtAmountLKR.setBounds(520, 130, 200, 30);
        mainPanel.add(txtAmountLKR);

        txtAmountInWords = new JTextField("Amount in Word");
        txtAmountInWords.setBounds(50, 180, 670, 35);
        txtAmountInWords.setEditable(false);
        mainPanel.add(txtAmountInWords);

        addLabel(mainPanel, "Bank Template", 50, 230);
        String[] templates = {"Item 1", "Commercial Bank", "Sampath Bank"};
        comboTemplate = new JComboBox<>(templates);
        comboTemplate.setBounds(175, 230, 200, 30);
        mainPanel.add(comboTemplate);

        addLabel(mainPanel, "Bank Template", 415, 230);
        chkACPayee = new JCheckBox("A/C Payee");
        chkACPayee.setBounds(545, 230, 100, 30);
        chkACPayee.setOpaque(false);
        mainPanel.add(chkACPayee);

        previewArea = new JPanel();
        previewArea.setBounds(50, 280, 670, 180);
        previewArea.setBorder(new LineBorder(Color.GRAY));
        previewArea.setBackground(Color.WHITE);
        previewArea.add(new JLabel("Cheque Preview Area"));
        mainPanel.add(previewArea);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(330, 480, 90, 35);
        mainPanel.add(btnSave);

        JButton btnSavePrint = new JButton("Save & Print");
        btnSavePrint.setBounds(430, 480, 140, 35);
        mainPanel.add(btnSavePrint);

        JButton btnVoid = new JButton("Void Cheque");
        btnVoid.setBounds(580, 480, 140, 35);
        mainPanel.add(btnVoid);

        add(mainPanel);

        // Amount to Word Logic
        txtAmountLKR.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                    if(!txtAmountLKR.getText().isEmpty()){
                        double amount = Double.parseDouble(txtAmountLKR.getText());
                        txtAmountInWords.setText("Rupees " + amount + " Only");
                    }
                } catch (Exception ex) {
                    txtAmountInWords.setText("Invalid Amount");
                }
            }
        });
    }

    private void addLabel(JPanel panel, String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 120, 30);
        label.setFont(new Font("Tahoma", Font.BOLD, 12));
        panel.add(label);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ChequeProUI().setVisible(true));
    }
    
   
}
