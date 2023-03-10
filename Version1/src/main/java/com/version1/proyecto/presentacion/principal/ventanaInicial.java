package com.version1.proyecto.presentacion.principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.springframework.stereotype.Component;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import javax.swing.JButton;

@SuppressWarnings("serial")
@Component


public class ventanaInicial extends JFrame{
	
	public ventanaInicial() throws HeadlessException {
		setLocationRelativeTo(null);// Centramos la ventana
		setSize(593, 544);
		//Eliminar el gestor dr Organizacion
		getContentPane().setLayout(null); 
		ImageIcon icono1;
		
		//Etiqueta para Texto: "Menu Principal"
		JLabel lblNewLabel = new JLabel("Menú Principal"); /*Etiqueta de menu principal.*/
		lblNewLabel.setFont(new Font("Yu Gothic", Font.PLAIN, 15));
		lblNewLabel.setBounds(194, 6, 172, 25);
		getContentPane().add(lblNewLabel);//La etiqueta de Menu principal es agregada a la ventana
	
		
		/**************** SECCION PARA BOTONES*********************************/
		//Panel para botones con texto
		JPanel texto= new JPanel();
		texto.setBounds(176, 42, 226, 427);
		getContentPane().add(texto); //Se agrega el panel a la ventana.
		texto.setLayout(null);
		
		//Boton de datos
		JButton bt1= new JButton("Mis datos");
		bt1.setBounds(10, 20, 206, 69);
		bt1.setForeground(new Color(0, 0, 0));
		texto.add(bt1);
		bt1.setFont(new Font("Yu Gothic", Font.PLAIN, 13)); //Se ajusta el tipo de letra
		bt1.setBackground(Color.DARK_GRAY);
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//Boton de diagnosticos
		JButton bt2 = new JButton("Mis diagnósticos");
		bt2.setBounds(10, 100, 206, 74);
		texto.add(bt2);
		bt2.setFont(new Font("Yu Gothic", Font.PLAIN, 13)); //Se ajusta el tipo de letra
		bt2.setBackground(Color.DARK_GRAY);
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//Boton citas
		JButton bt3 = new JButton("Consultar mis Citas");
		bt3.setBounds(10, 185, 206, 69);
		texto.add(bt3);
		bt3.setFont(new Font("Yu Gothic", Font.PLAIN, 13));
		bt3.setBackground(Color.DARK_GRAY);
		
		JButton bt4 = new JButton("Solicitar una Cita");
		bt4.setBounds(10, 270, 206, 69);
		bt4.setFont(new Font("Yu Gothic", Font.PLAIN, 13));
		bt4.setBackground(Color.DARK_GRAY);
		texto.add(bt4);
		
		JButton bt5 = new JButton("Notificaciones");
		bt5.setBounds(10, 350, 206, 69);
		bt5.setFont(new Font("Yu Gothic", Font.PLAIN, 13));
		bt5.setBackground(Color.DARK_GRAY);
		texto.add(bt5);
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		//Panel para Imagenes
		JPanel Panelimg = new JPanel();
		Panelimg.setLayout(null);
		getContentPane().add(Panelimg); //Se agrega el panel a la ventana.
		Panelimg.setBounds(24, 42, 152, 427);
		setSize(500, 536); /*Tamano de la ventana*/
		setLocationRelativeTo(null);/*Agregamos el panel a la ventana*/
		
		/***************************************************************************************************/
		/*SECCION DE IMAGENES*/
		/*Boton para Ventana "Mis datos"*/
		//Se agrega una etiqueta que nos permita anadir la imagen.
		JLabel ar1 = new JLabel();
		ar1.setBounds(76, 14, 66, 77);
		ImageIcon icono = new ImageIcon(getClass().getResource("icono1.PNG")); //Se crea un icono
		Image Imagen = icono.getImage(); //Se asigna el icono a la imagen
		icono1 = new ImageIcon(Imagen.getScaledInstance(60, 70, Image.SCALE_AREA_AVERAGING)); //Se ajusta la imagen
		ar1.setIcon(icono1); //La imagen es agregada a el JLabel
		Panelimg.add(ar1); //Agregamos el JLabel al Panel de imagenes
		
		//Agregamos imagen 2: 
		JLabel ar2 = new JLabel();
		ar2.setBounds(76, 102, 66, 77);
		ImageIcon icono2 = new ImageIcon(getClass().getResource("icono2.PNG")); //Se crea un icono
		Image Imagen2 = icono2.getImage(); //Se asigna el icono a la imagen
		icono2 = new ImageIcon(Imagen2.getScaledInstance(60, 70, Image.SCALE_AREA_AVERAGING)); //Se ajusta la imagen
		ar2.setIcon(icono2); //La imagen es agregada a el JLabel
		Panelimg.add(ar2); 
		
		JLabel ar3 = new JLabel();
		ar3.setBounds(76, 192, 66, 71);
		ImageIcon icono3 = new ImageIcon(getClass().getResource("icono3.PNG"));
		Image Imagen3 = icono3.getImage(); //Se asigna el icono a la imagen
		icono3 = new ImageIcon(Imagen3.getScaledInstance(60, 70, Image.SCALE_AREA_AVERAGING)); //Se ajusta la imagen
		ar3.setIcon(icono3); //La imagen es agregada a el JLabel
		Panelimg.add(ar3);
		
		
		JLabel ar4 = new JLabel();
		ar4.setBounds(76, 274, 66, 71);
		ImageIcon icono4 = new ImageIcon(getClass().getResource("icono4.PNG"));
		Image Imagen4 = icono4.getImage(); //Se asigna el icono a la imagen
		icono4 = new ImageIcon(Imagen4.getScaledInstance(60, 70, Image.SCALE_AREA_AVERAGING)); //Se ajusta la imagen
		ar4.setIcon(icono4); //La imagen es agregada a el JLabel
		Panelimg.add(ar4);
		 
		
		JLabel ar5 = new JLabel();
		ar5.setBounds(76, 356, 66, 60);
		ImageIcon icono5 = new ImageIcon(getClass().getResource("icono5.PNG"));
		Image Imagen5 = icono5.getImage(); //Se asigna el icono a la imagen
		icono5 = new ImageIcon(Imagen5.getScaledInstance(60, 60, Image.SCALE_AREA_AVERAGING)); //Se ajusta la imagen
		ar5.setIcon(icono5);
		Panelimg.add(ar5);
		
		setVisible(true);// Hacemos visible la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Con esto cerramos la ventana
	}
}
