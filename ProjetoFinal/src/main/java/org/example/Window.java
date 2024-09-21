package org.example;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(400, 500));
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JLabel altura_predio_label = new JLabel("Altura do prédio:");
        JLabel  angulo_elevaçao_sol_label= new JLabel("Ângulo de elevação do sol:");
        JLabel angulo_incidencia_sol_label = new JLabel("Ângulo de incidência do sol:");
        JTextField altura_predio_input = new JTextField();
        JTextField angulo_elevacao_sol_input = new JTextField();
        JTextField angulo_incidencia_sol_input = new JTextField();
        JLabel resultado_label = new JLabel("Resultado:");

        JButton calcular = new JButton("Calcular");
        JButton limpar = new JButton("Limpar");

        altura_predio_input.setPreferredSize(new Dimension(30, 30));
        angulo_elevacao_sol_input.setPreferredSize(new Dimension(30, 30));
        angulo_incidencia_sol_input.setPreferredSize(new Dimension(30, 30));

        calcular.addActionListener(e -> {
            try {
                double altura = Double.parseDouble(altura_predio_input.getText());
                double anguloIncidencia = Double.parseDouble(angulo_incidencia_sol_input.getText());

                double sombra = calcularSombra(altura, anguloIncidencia);
                resultado_label.setText(String.format("O comprimento da sombra é: %.2f metros", sombra));
            } catch (NumberFormatException ex) {
                resultado_label.setText("Por favor, insira valores válidos.");
            }
        });

        limpar.addActionListener(e -> {
            altura_predio_input.setText("");
            angulo_elevacao_sol_input.setText("");
            angulo_incidencia_sol_input.setText("");
            resultado_label.setText("Resultado:");
        });

        gbc.insets = new Insets(5, 0,5,0);


        gbc.gridx = 0;
        gbc.gridy = 0;
        add(altura_predio_label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(angulo_elevaçao_sol_label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(angulo_incidencia_sol_label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(calcular, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(altura_predio_input, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(angulo_elevacao_sol_input, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(angulo_incidencia_sol_input, gbc);


        gbc.gridx = 1;
        gbc.gridy = 3;
        add(limpar, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(resultado_label, gbc);


        setVisible(true);
    }

    private double calcularSombra(double altura, double anguloIncidencia) {
        // Converte o ângulo de incidência para radianos e calcula a sombra
        return altura * (1 / Math.tan(Math.toRadians(anguloIncidencia)));
    }

    /*
    1. Altura do prédio:  x (em metros)
    Definição: Refere-se à altura vertical do prédio, medida em metros.
    Importância: Esse valor é essencial porque, quanto mais alto o prédio, maior será a sombra que ele pode projetar, dependendo da posição do sol.

    2. Ângulo de elevação do sol
    Definição: O ângulo de elevação do sol é o ângulo entre a linha do horizonte e a linha imaginária que vai do observador (ou do ponto de referência) até o sol.
    Importância: Este ângulo indica a altura do sol no céu. Um ângulo de elevação maior significa que o sol está mais alto e, consequentemente, a sombra projetada pelo prédio será menor. Por outro lado, um ângulo menor resulta em sombras mais longas.

    3. Ângulo de incidência do sol
    Definição: Este ângulo refere-se à inclinação dos raios solares em relação à superfície vertical do prédio. É medido em relação à vertical.
    Importância: O ângulo de incidência influencia diretamente o comprimento e a direção da sombra. Um ângulo de incidência maior significa que os raios solares estão mais paralelos à superfície, resultando em sombras mais longas.
     */

}
