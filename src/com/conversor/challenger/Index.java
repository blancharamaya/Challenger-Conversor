package com.conversor.challenger;
import javax.swing.*;

public class Index extends JFrame {
    private JPanel index;
    private JTextField usernameTF;
    private JButton loginButton;
    private JLabel welcomeLabel;

    public static String user = "";

    public Index() {

        welcomeLabel.setText("Bienvenido al conversor ultimate, ingresa tu nombre para continuar: ");

        loginButton.addActionListener(e -> {
            user = usernameTF.getText();
            MenuConversor menuLabel = new MenuConversor();
            menuLabel.iniciarMenu();
            index.setVisible(false);
            dispose();
        });
    }

    public static void main(String[] args) {
        JFrame index = new JFrame();
        index.setContentPane(new Index().index);
        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        index.setVisible(true);
        index.setSize(500, 500);
        index.setTitle("Challenger: Conversor");
        index.setLocationRelativeTo(null);
    }
}
