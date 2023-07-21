package com.conversor.challenger;

import javax.swing.*;


public class MenuConversor extends JFrame {
    private JPanel menu;
    private JComboBox opcionConversiones;
    private JLabel menuLabel;

    public MenuConversor() {
        new Index();
        menuLabel.setText("Bienvenido " + Index.user.toUpperCase() + ", Selecciona una tipo de coversor");
        opcionConversiones.addActionListener(e -> {
            if (opcionConversiones.getSelectedIndex() == 0) {
                ConversorDinero monedas = new ConversorDinero();
                monedas.iniciarConversorMonedas();
                menu.setVisible(false);
                dispose();
            } else{
                JOptionPane.showMessageDialog(null, Index.user.toUpperCase() + ", Muy pronto añadiremos esta nueva funcionalidad.",
                        "¡Oops!", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    protected void iniciarMenu() {
        setContentPane(new MenuConversor().menu);
        setVisible(true);
        setSize(500, 500);
        setTitle("Conversores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
}
