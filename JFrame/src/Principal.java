import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {
    public static class MyFrame extends JFrame{
        public MyFrame(){
            JFrame frame = new JFrame("Ventana con Cuadro de Texto");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //cuadrado de texto
            JTextField cuadradotexto = new JTextField(20);
            //crea boton
            JButton boton = new JButton("Mostrar Texto");

            //hace que funcione el botón, y ademas recoge lo que se pone en la caja de texto y lo muestra por pantalla
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String textoIngresado = cuadradotexto.getText();
                    System.out.println("Texto ingresado: " + textoIngresado);
                }
            });

            JPanel panel = new JPanel();
            panel.add(cuadradotexto);
            panel.add(boton);

            frame.getContentPane().add(panel);

            frame.setSize(300, 200);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }
    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
