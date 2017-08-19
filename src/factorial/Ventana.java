/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Alumno
 */
public class Ventana extends JFrame implements ActionListener{
    
    public int num = 0;
    public int resultFact = 0;
    public int resultSF = 0;
    JFrame vent = new JFrame();
    JButton boton = new JButton("OK");
    JTextField texto = new JTextField();
    JTextField texto2 = new JTextField();
    JTextField texto3 = new JTextField();
    JLabel eti = new JLabel();
    JLabel eti2 = new JLabel();
    JLabel eti3 = new JLabel();
    
    public Ventana() {
        super();
        setLayout(null);
        setTitle("Calculador de Factorial y SF");
        setBounds(70, 30, 530, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        
        
        boton.setBounds(370, 100, 70, 40);
        boton.addActionListener(this);
        add(boton);
        
        texto.setBounds(170, 30, 300, 40);
        add(texto);
        texto2.setBounds(170, 200, 300, 40);
        texto2.setEditable(false);
        add(texto2);
        texto3.setBounds(170, 260, 300, 200);
        texto3.setEditable(false);
        add(texto3);
        
        eti.setText("Escribe un número");
        eti.setLabelFor(boton);
        eti.setBounds(20, 30, 160, 30);
        add(eti);
        
        eti2.setText("Factorial");
        eti2.setLabelFor(texto2);
        eti2.setBounds(20, 200, 160, 30);
        add(eti2);
        
        eti3.setText("Sucesion Fibonacci");
        eti3.setLabelFor(texto3);
        eti3.setBounds(20, 260, 160, 30);
        add(eti3);
        
        this.setVisible(true);
    }
    
    public void Factor() {
        num = Integer.parseInt(texto.getText());
        int numer = 1;
        int numer2 = 0;
        int numer3 = 0;

        for(int i=1; i>0 && i<=num; i++) {
            numer = numer * i;
        }
        resultFact = numer;
        texto2.setText(String.valueOf(resultFact));
        ArrayList<String> fibo = new ArrayList<String>();

        for(int i=0; i<num ; i++) {
            if(i<=1) {
                fibo.add(String.valueOf(i));
            }
            else {
                numer2 = Integer.parseInt(fibo.get(i-2));
                numer3 = Integer.parseInt(fibo.get(i-1));
                fibo.add(String.valueOf(numer2 + numer3));
            }
            
        }
        texto3.setText(String.valueOf(fibo));
        texto.setText("");
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==boton) {
            Factor();
        }
    }
    
}
