package com.conversor.challenger;

import javax.swing.*;
import java.text.DecimalFormat;

public class ConversorDinero extends JFrame {
    private JPanel conversorDinero;
    private JComboBox opcionesDivisas;
    private JLabel divisasLabel;
    Double COP, USD, EUR, GBP, valor;

    public ConversorDinero(){
        DecimalFormat numero = new DecimalFormat("###,###");
        new Index();
        dispose();
        divisasLabel.setText(Index.user.toUpperCase() + ", Elija la divisa a convertir");
        opcionesDivisas.addActionListener(e -> {
            if (opcionesDivisas.getSelectedIndex() == 0) {
                try {
                    COP = Double.valueOf(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingrese el valor en pesos colombianos:",
                            "Conversor de dinero", JOptionPane.QUESTION_MESSAGE));
                    valor = COP / 3999;
                    JOptionPane.showMessageDialog(null, numero.format(valor) + " USD");
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Dato no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else if (opcionesDivisas.getSelectedIndex() == 1) {
                try {
                    COP = Double.valueOf(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingrese el valor en pesos colombianos:",
                            "Conversor de dinero", JOptionPane.QUESTION_MESSAGE));
                    valor = COP / 4453;
                    JOptionPane.showMessageDialog(null, numero.format(valor) + " EUR");
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Dato no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else if (opcionesDivisas.getSelectedIndex() == 2) {
                try {
                    COP = Double.valueOf(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingrese el valor en pesos colombianos:",
                            "Conversor de dinero", JOptionPane.QUESTION_MESSAGE));
                    valor = COP / 5147;
                    JOptionPane.showMessageDialog(null, numero.format(valor) + " GBP");
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Dato no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else if (opcionesDivisas.getSelectedIndex() == 3) {
                try {
                    COP = Double.valueOf(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingrese el valor en pesos colombianos:",
                            "Conversor de dinero", JOptionPane.QUESTION_MESSAGE));
                    valor = COP / 28.57;
                    JOptionPane.showMessageDialog(null, numero.format(valor) + " JPY");
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Dato no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else if (opcionesDivisas.getSelectedIndex() == 4) {
                try {
                    COP = Double.valueOf(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingrese el valor en pesos colombianos:",
                            "Conversor de dinero", JOptionPane.QUESTION_MESSAGE));
                    valor = COP / 3.13;
                    JOptionPane.showMessageDialog(null, numero.format(valor) + " KRW");
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Dato no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else if (opcionesDivisas.getSelectedIndex() == 5) {
                try {
                    USD = Double.valueOf(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingresa el valor en dolares:",
                            "Conversor de dinero", JOptionPane.QUESTION_MESSAGE));
                    valor = USD * 3999;
                    JOptionPane.showMessageDialog(null, numero.format(valor) + " COP");
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Dato no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else if (opcionesDivisas.getSelectedIndex() == 6) {
                try {
                    EUR = Double.valueOf(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingresa el valor en euros:",
                            "Conversor de dinero", JOptionPane.QUESTION_MESSAGE));
                    valor = EUR * 4453;
                    JOptionPane.showMessageDialog(null, numero.format(valor) + " COP");
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Dato no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
            } else if (opcionesDivisas.getSelectedIndex() == 7) {
                try {
                    GBP = Double.valueOf(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingresa el valor en libras:",
                            "Conversor de dinero", JOptionPane.QUESTION_MESSAGE));
                    valor = GBP * 5147;
                    JOptionPane.showMessageDialog(null, numero.format(valor) + " COP");
                }catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(null,"Dato no valido","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            String[] opciones = {"Si","No"};
            int opcion =JOptionPane.showOptionDialog(null,"¿Desea seguir ejecutando el programa?",
                    "menu", JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,0);
            if(opcion == 0){
                iniciarConversorMonedas();
            }else if(opcion == 1) {
                JOptionPane.showMessageDialog(null,"Programa finalizado" ,"Te esperamos",JOptionPane.INFORMATION_MESSAGE);
                System.exit(1);
            }
        });

    }

    protected void iniciarConversorMonedas() {
        setContentPane(new ConversorDinero().conversorDinero);
        setVisible(true);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Divisas conversor");
    }
}
