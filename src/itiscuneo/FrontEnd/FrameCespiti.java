package itiscuneo.FrontEnd;

import itiscuneo.BackEnd.Cespiti;
import itiscuneo.BackEnd.CespitiFile;
import itiscuneo.BackEnd.ElencoCespiti;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameCespiti extends JFrame implements ActionListener {

    private final ElencoCespiti elencoCespiti;
    private JButton btnNuovo;
    private JTable tableCespiti;
    private DefaultTableModel dtmCespiti;
    private TableModel dftCespiti;
    private Object menuItemJson;
    private Object menuItemCsv;

    public FrameCespiti() throws HeadlessException {
        super("Cespiti");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        elencoCespiti = new ElencoCespiti();
        initComponents();
        //tracing(line to line) and whatches(stato oggetto) metto un breakpoint e controllo la variabile

    }
    public static final String path= "data/";
    private void initComponents() {
        this.setLayout(new BorderLayout());
        JPanel panelTable = new JPanel();

        String[] aHeader = {"Codice", "Quantità", "Data di acquisto"};
        dtmCespiti= new DefaultTableModel(aHeader, 0);
        tableCespiti= new JTable(dftCespiti);
        panelTable.add(new JScrollPane(tableCespiti));

        JPanel panelCmd= new JPanel();
        btnNuovo = new JButton("Nuovo");
        panelCmd.add(btnNuovo);
        btnNuovo.addActionListener(this);

        this.add(panelTable, BorderLayout.CENTER);

        JMenuBar menuBar = initMenu();
        this.setJMenuBar(menuBar);


    }

    private JMenuBar initMenu() {
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);
        JMenuItem menuItemJson = new JMenuItem("Esporta json");
        menuFile.add(menuItemJson);
        JMenuItem menuItemCsv = new JMenuItem("Esporta csv");
        menuFile.add(menuItemCsv);

        return menuBar;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnNuovo) {
            new DialogCespiti(this).setVisible(true);
        }
        if (e.getSource() == menuItemCsv) {

        }
        if (e.getSource() == menuItemJson) {
            Cespiti cespitiFile = new CespitiFile();
            cespitiFile.scriviCsv(this.elencoCespiti);
        }

    }

    public ElencoCespiti getElencoCespiti() {
        return elencoCespiti;
    }

    public static void main(String[] args) {
        new FrameCespiti().setVisible(true);
    }
}
