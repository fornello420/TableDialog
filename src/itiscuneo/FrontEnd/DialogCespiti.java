package itiscuneo.FrontEnd;

import javax.swing.*;
import java.awt.*;

public class DialogCespiti extends JDialog {
    private FrameCespiti frameCespiti;
    private JTextField txtFieldCodice;
    private JTextField txtFielQuantita;
    private JTextField txtFieldDataAcquisto;
    private JButton btnUndo;
    private JButton btnOk;


    public DialogCespiti(FrameCespiti frameCespiti) {
        this.frameCespiti = frameCespiti;
        initComponents();
    }

    private void initComponents() {
       this.setLayout(new GridLayout(4,2));
       this.add(new JLabel("Codice"));
       txtFieldCodice = new JTextField(10);
       this.add(txtFieldCodice);

        this.add(new JLabel("Quantità"));
        txtFielQuantita = new JTextField(10);
        this.add(txtFielQuantita);

        this.add(new JLabel("Data di acquisto"));
        txtFieldDataAcquisto = new JTextField(10);
        this.add(txtFieldDataAcquisto);

        btnUndo = new JButton("Annulla");
        this.add(btnUndo);
        btnOk = new JButton("OK");
        this.add(btnOk);
    }

}
