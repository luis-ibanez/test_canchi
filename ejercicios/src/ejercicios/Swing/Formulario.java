package ejercicios.Swing;

import javax.swing.*;

public class Formulario extends JFrame{
    private JLabel label1;
    public Formulario() {
        setLayout(null);
        label1 = new JLabel("Hola muldo");
        label1.setBounds(10, 10, 400, 80);
        add(label1);
        }

        public static void main(String[] args) {
        Formulario formulario1 = new Formulario();
        formulario1.setBounds(20, 30 ,400, 200);
        formulario1.setVisible(true);
        }

}
/*Problema 1:

Confeccionar el programa "Hola Mundo" utilizando una interfaz gráfica de usuario.*/