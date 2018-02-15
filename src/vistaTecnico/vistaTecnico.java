package vistaTecnico;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SpringLayout;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

import java.awt.BorderLayout;
	import java.awt.Button;
	import java.awt.Color;
	import java.awt.Container;
	import java.awt.Dimension;
	import java.awt.Font;
	import java.awt.GraphicsEnvironment;
	import java.awt.GridLayout;
	import java.awt.Image;
	import java.awt.Label;
	import java.awt.TextField;
	import java.awt.Toolkit;
	import java.awt.event.ActionListener;

	import javax.print.DocFlavor.URL;
	import javax.swing.ImageIcon;
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JPanel;
	import javax.swing.SpringLayout;
	import javax.swing.SwingConstants;

import Controller.Controller;
import Model.Model;
import View.View;

	
public class vistaTecnico extends JFrame {
	
	//Atributos clase
	private JFrame ventana;
	private Controller cntrl;
	
	private Label ltitulo1;
	private Label ltitulo2;
	private Button bnuevo;
	private Button bayuda;
	private Button blogout;
	private Button bsalir;
	
	public View() {
		
		BorderLayout layout = new BorderLayout();
		
		//Definir Ventana... Faltan dimensiones
		ventana = new JFrame("Ventana Tecnico");
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    //labels
	    ltitulo1= new Label("Sistema de Administración de ECGs");
	    ltitulo1.setFont(new Font("verdana", Font.TRUETYPE_FONT, 20));
	    ltitulo2= new Label("Sistema de Administración de ECGs");
	    ltitulo2.setFont(new Font("verdana", Font.TRUETYPE_FONT, 20));
	    
	    //Buttons
	    bnuevo = new Button(" Validar ");
	    bnuevo.addActionListener(cntrl);
	    bayuda = new Button(" Validar ");
	    bayuda.addActionListener(cntrl);
	    blogout = new Button(" Validar ");
	    blogout.addActionListener(cntrl);
	    bsalir = new Button(" Validar ");
	    bsalir.addActionListener(cntrl);
	    
	    //Añadir Componentes
	    ventana.add(ltitulo1);
	    ventana.add(ltitulo2);
	    ventana.add(bnuevo);
	    ventana.add(bayuda);
	    ventana.add(blogout);
	    ventana.add(bsalir);
	    ventana.setVisible(true);
	}
	    
	    //Getters y Setters
	    
	    public Label getLtitulo1 () {
	    		return lusuario;
	    }
		public void setLtitulo1 (Label ltitulo1) {
			this.ltitulo1=ltitulo1;
		}
		public Label getLtitulo2 () {
    			return lusuario;
		}
		public void setLtitulo2 (Label ltitulo1) {
			this.ltitulo2=ltitulo2;
		}	   
		public Button getBotonNuevo() {
			return bnuevo;
		}	   	
		public void setBotonNuevo(Button bnuevo) {
			this.bnuevo=bnuevo;
		}   
		public Button getBotonAyuda() {
			return bnuevo;
		}	   	
		public void setBotonAyuda(Button bayuda) {
			this.bayuda=bayuda;
		}	   
		public Button getBotonLogout() {
			return blogout;
		}	   	
		public void setBotonLogout(Button blogout) {
			this.blogout=blogout;
		}	   
		public Button getBotonSalir() {
			return bsalir;
		}	   	
		public void setBotonSalir(Button bslair) {
			this.bsalir=bsalir;
		}
	
		//Escuchar Botones
		public void addActionListener(ActionListener listenerforboton) {
			  bnuevo.addActionListener(listenerforboton);
		      }
		public void addActionListener(ActionListener listenerforboton) {
			   botonValidar.addActionListener(listenerforboton);
		      }
		public void addActionListener(ActionListener listenerforboton) {
			   bayuda.addActionListener(listenerforboton);
		      }
		public void addActionListener(ActionListener listenerforboton) {
			   blogout.addActionListener(listenerforboton);
		      }
		public void addActionListener(ActionListener listenerforboton) {
			   bsalir.addActionListener(listenerforboton);
		      }
		public static void main(String[] args){
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					vistaTecnico vista = new vistaTecnico();
					vista.setCntrl(controladora);

