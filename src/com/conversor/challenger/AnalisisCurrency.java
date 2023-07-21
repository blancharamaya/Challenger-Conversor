package com.conversor.challenger;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Objects;

public class AnalisisCurrency {

    public void curency(String moneda, int opcion) {
        Double valor = null;
        String currency = null;
        DecimalFormat numero = new DecimalFormat();

        if (opcion == 1) {
            try {

                double divisa = Double.parseDouble(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingrese el valor en pesos colombianos:",
                        "Conversor de peso colombiano a dolar", JOptionPane.QUESTION_MESSAGE));

                if (Objects.equals(moneda, "usd")) {
                    valor = divisa / 3999;
                    currency = moneda;
                } else if (Objects.equals(moneda, "eur")) {
                    valor = divisa / 4453.0;
                    currency = moneda;
                } else if (Objects.equals(moneda, "gpb")) {
                    valor = divisa / 5147.0;
                    currency = moneda;
                } else if (Objects.equals(moneda, "jpy")) {
                    valor = divisa / 28.57;
                    currency = moneda;
                } else if (Objects.equals(moneda, "krw")) {
                    valor = divisa / 3.13;
                    currency = moneda;
                }

                JOptionPane.showMessageDialog(null, "La conversion es de: " + numero.format(valor) + " " + currency);

            } catch (RuntimeException errorDivisa) {
                JOptionPane.showMessageDialog(null, "Dato no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (opcion == 2) {

            try{

                double divisa = Double.parseDouble(JOptionPane.showInputDialog(null, Index.user.toUpperCase() + ", Ingrese el valor de la moneda ( " + moneda + " ):",
                        "Conversor de peso colombiano a dolar", JOptionPane.QUESTION_MESSAGE));

                if (Objects.equals(moneda, "usd")) {
                    valor = divisa * 3999;
                } else if (Objects.equals(moneda, "eur")) {
                    valor = divisa * 4453.0;
                } else if (Objects.equals(moneda, "gpb")) {
                    valor = divisa * 5147.0;
                }

                JOptionPane.showMessageDialog(null, "La conversion es de: " + numero.format(valor) + " cop.");

            }catch (RuntimeException errorDivisaDos){
                JOptionPane.showMessageDialog(null, "Dato no valido", "Error", JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane.showMessageDialog(null, "La opcion en el constructor es diferente de 1 o 2","Error",JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
}